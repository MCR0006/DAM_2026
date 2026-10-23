package pt.ipb.calculadorasoma;

public final class Calculadora {
    private Calculadora() { }

    public static double somar(String primeiro, String segundo) {
        return lerNumero(primeiro) + lerNumero(segundo);
    }
    public static double subtrair(String a, String b) {
        return lerNumero(a) - lerNumero(b);
    }

    public static double multiplicar(String a, String b) {
        return lerNumero(a) * lerNumero(b);
    }

    public static double dividir(String a, String b) {
        double primeiroNumero = lerNumero(a);
        double segundoNumero = lerNumero(b);

        if (segundoNumero == 0) {
            throw new ArithmeticException(
                    "Não é possível dividir por zero."
            );
        }

        return primeiroNumero / segundoNumero;
    }
    private static double lerNumero(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            throw new IllegalArgumentException("Preencha os dois números.");
        }
        try {
            return Double.parseDouble(texto.trim().replace(',', '.'));
        } catch (NumberFormatException erro) {
            throw new IllegalArgumentException("Introduza números válidos.", erro);
        }
    }
}
