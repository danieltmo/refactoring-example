package extractmethod;

public class Calculadora {

    public static void main(String[] args) {
        int[] numeros = {10, 5, 8, 12, 7};

        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }

        double media = (double) soma / numeros.length;

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
    }
}