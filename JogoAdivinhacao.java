import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numAleatorio = new Random().nextInt(100);
        int tentativas = 10;
        int contador = 10;
        int  i;

        System.out.print("\033[H\033[2J");
        System.out.println("""
        JOGO DA ADIVINHAÇÃO
        ===========================================
        Um número aleátorio de 1 a 100 seja criado.    
        Você terá 10 chances para adivinhar o número.\n""");
        for ( i = 1; i <= tentativas; i++){

            System.out.println("Adivinhe o número:");

            int chute =scan.nextInt();
            if (chute == numAleatorio){
                System.out.println("Paarabéns!! você acertou, você precisou de " +i+" tentativas");
                break;
            }
            else if (chute != numAleatorio){
                contador--;
                System.out.println("Você errou!! Você ainda tem "+contador+" chances");
                if (chute > numAleatorio){
                    System.out.println("O número é menor do que o digitado!!");
                }
                else if (chute < 0){
                    System.out.println("Você não pode digitar numeros negativos");
                }
                else{
                    System.out.println("O número é maior do que o digitado!!");
                }
            }
        }
        scan.close();
    }
}