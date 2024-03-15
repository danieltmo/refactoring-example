package extractmethod;

public class Calculadora {

    public static void main(String[] args) {
        int[] numeros = { 10, 5, 8, 12, 7 };

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

    class InnerCalculator {

        public static void wellcome() {
            String userName = "John";
            int userAge = 30;

            // Gerando e exibindo mensagem de boas-vindas
            String message = generateWelcomeMessage(userName, userAge);
            System.out.println(message);
        }

        private static String generateWelcomeMessage(String userName, int userAge) {
            String message = "Olá, " + userName + "! Bem-vindo ao nosso programa.";
            if (userAge >= 18) {
                message += " Esperamos que você aproveite sua experiência conosco!";
            } else {
                message += " Pedimos desculpas, mas este programa é para maiores de 18 anos.";
            }
            return message;
        }
    }
}
