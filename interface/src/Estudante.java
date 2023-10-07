public class Estudante {
    private String nome;
    private String sobrenome;
    private int idade;
    private double[] notas;

    public Estudante(String nome, String sobrenome, int idade, double[] notas) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getNotas() {
        return notas;
    }

    public double getMedia() {
        if(notas.length == 0) return 0.0;

        double soma = 0;

        for(double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome + " (Idade: " + idade + ", Média: " + getMedia() + ")";
    }
}