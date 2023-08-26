public class FuncaoSoma {
    // Definição da função
    public static int somar(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }

    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 10;

        // Chamada da função e impressão do resultado
        int resultadoSoma = somar(numero1, numero2);
        System.out.println("A soma é: " + resultadoSoma);
    }
}
