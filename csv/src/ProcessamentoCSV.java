import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ProcessamentoCSV {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Uso: java ProcessamentoCSV arquivoEntrada arquivoSaida");
            System.exit(1);
        }

        String arquivoEntrada = args[0];
        String arquivoSaida = args[1];

        try {
            processarArquivoCSV(arquivoEntrada, arquivoSaida);
            System.out.println("Processamento concluído com sucesso.");
        } catch (IOException e) {
            System.err.println("Erro ao processar o arquivo: " + e.getMessage());
        }
    }

    public static void processarArquivoCSV(String arquivoEntrada, String arquivoSaida) throws IOException {
        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivoEntrada));
             BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivoSaida))) {

            String linha;
            while ((linha = leitor.readLine()) != null) {
                String linhaProcessada = calcularSomaLinhaCSV(linha);
                escritor.write(linhaProcessada);
                escritor.newLine();
            }
        }
    }

    public static String calcularSomaLinhaCSV(String linha) {
        String[] colunas = linha.split(",");

        if (colunas.length >= 2) {
            try {
                double coluna1 = Double.parseDouble(colunas[0]);
                double coluna2 = Double.parseDouble(colunas[1]);
                double soma = coluna1 + coluna2;

                return linha + "," + soma;
            } catch (NumberFormatException e) {
                System.err.println("Erro ao converter valores: " + e.getMessage());
            }
        }

        return linha;
    }
}
