public class Newton {
    public static double calcularRaizQuadrada(double numero, double erro) {
        if (numero < 0) {
            throw new IllegalArgumentException("Entrada deve ser um número não negativo.");
        }

        double estimativa = numero;

        while (Math.abs(numero - estimativa * estimativa) > erro) {
            estimativa = (estimativa + (numero / estimativa)) / 2.0;
        }

        return estimativa;
    }
}
