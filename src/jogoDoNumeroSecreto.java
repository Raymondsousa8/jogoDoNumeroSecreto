import java.util.Random;

import java.util.Scanner;

public class jogoDoNumeroSecreto {

    public static void main(String[] args) {

        Random randam = new Random();
        int numeroGerado = randam.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int tentativas = 0;

        while(tentativas < 5) {
            System.out.println("Digite um numero entre 0 e 100 ");
            int numeroUsuario = scanner.nextInt();
            tentativas++;


            if(numeroUsuario == numeroGerado) {
                System.out.println("Parabens voce acertou o numero! " + numeroGerado);
                break;
            }else if(numeroUsuario > numeroGerado) {
                System.out.println("O numero gerado é menor " + numeroUsuario);
            }else {
                System.out.println("O numero gerado é maior ");
            }

            if (tentativas == 5) {
                System.out.println("Você não consegiu acertar o numero em 5 tentativas. O numero gerado era " + numeroGerado);

            }
        }

        scanner.close();
    }
}


