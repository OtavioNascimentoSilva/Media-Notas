import java.util.Scanner;

public class Media {

        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            double nota1, nota2, nota3;
            String nome;

            System.out.print("Qual seu nome? ");
            nome = entrada.nextLine();

            System.out.print("Qual foi sua primeira nota? ");
            nota1 = entrada.nextDouble();

            System.out.print("Qual foi sua segunda nota? ");
            nota2 = entrada.nextDouble();

            System.out.print("Qual foi sua terceira nota? ");
            nota3 = entrada.nextDouble();

            System.out.print(nome + " sua media foi de:" +
                    ((nota1 + nota2 + nota3) / 3) +
                    ", qualquer duvida entre em contato!");

            entrada.close();
        }
    }

