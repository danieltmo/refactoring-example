package extractmethod;

public class Calculadora {

    public static void main(String[] args) {
        int[] numeros = {10, 5, 8, 12, 7};

        int soma = calcularSoma(numeros);
        double media = calcularMedia(soma, numeros.length);

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
    }

    private static int calcularSoma(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    private static double calcularMedia(int soma, int quantidade) {
        return (double) soma / quantidade;
    }

}