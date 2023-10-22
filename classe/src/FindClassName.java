import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;

public class FindClassName {
    public static void main(String[] args) {
        
        if(args.length < 2) {
            System.err.println("Argumentos: <nome da classe> <dir> [-p]");
            System.exit(1);
        }

        String className = args[0];
        String directoryPath = args[1];
        boolean useParallel = (args.length > 2 && args[2].equals("-p"));

        long startTime = System.currentTimeMillis();

        Path dirPath = Paths.get(directoryPath);

        if(!Files.exists(dirPath) || !Files.isDirectory(dirPath)) {
            System.err.println("O diretório especificado não existe ou não é um diretório válido.");
            System.exit(1);
        }

        List<Path> classFiles = new ArrayList<>();

        try {
            Stream<Path> filesStream = useParallel ? Files.walk(dirPath).parallel() : Files.walk(dirPath);

            classFiles = filesStream
                .filter(file -> isClassFile(file) && isClassNameInFile(file, className))
                .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

        printOutput(startTime, classFiles);
    }

    private static boolean isClassFile(Path filePath) {
        return Files.isRegularFile(filePath) && filePath.getFileName().toString().toLowerCase().endsWith(".class");
    }


    private static boolean isClassNameInFile(Path filePath, String className) {
        try {
            byte[] classBytes = Files.readAllBytes(filePath);
            String classContent = new String(classBytes);
            return classContent.contains(className);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    private static void printOutput(long startTime, List<Path> classFiles) {
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        if (classFiles.isEmpty()) {
            System.out.println("A classe não foi encontrada em nenhum arquivo .class.");
        } else {
            System.out.println("A classe foi encontrada nos seguintes locais:");
            for (Path path : classFiles) {
                System.out.println(path);
            }
        }

        System.out.println("Tempo gasto: " + duration + " ms");
        System.out.println("Número de arquivos .class consultados: " + classFiles.size());
    }
}