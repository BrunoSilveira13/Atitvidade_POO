package exercicio;
import java.util.Scanner;

public class CalculoImc {

static void imprimeResultado(String nome, double calculo){
    System.out.print("\033[H\033[2J");
    System.out.println("ola " + nome);
    System.out.println("seu IMC É " + calculo);
}

    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.println("Digite seu nome:");
        String nome = lerTeclado.nextLine();

        System.out.println("Digite seu gênero");
        String genero = lerTeclado.nextLine().toUpperCase();
        char generoChar = genero.charAt(0);

        System.out.println("Digite sua altura:");
        double altura = lerTeclado.nextDouble();
        lerTeclado.nextLine();

        System.out.println("Digite seu peso: ");
        double peso = lerTeclado.nextDouble();
        lerTeclado.nextLine();

        double calculo = peso / (altura * altura);


        if (generoChar == 'M'){
            if (calculo >= 40){
                imprimeResultado(nome, calculo);
                System.out.println("seu genero é masculino");
                System.out.println("você está com obesidade morbida!!");
            }
            else if (calculo > 30){
                imprimeResultado(nome, calculo);
                System.out.println("seu genero é masculino");
                System.out.println("você está com obesidade moderada");
            }
            else if (calculo > 25){
                imprimeResultado(nome, calculo);
                System.out.println("seu genero é masculino");
                System.out.println("você está com obesidade leve");
            }
            else if (calculo > 20){
                imprimeResultado(nome, calculo);
                System.out.println("seu genero é masculino");
                System.out.println("você está com o peso normal");
            }
            else if (calculo < 20){
                imprimeResultado(nome, calculo);
                System.out.println("seu genero é masculino");
                System.out.println("você está com o peso abaixo do normal");
            }
        }
        if (generoChar == 'F' || generoChar =='N'){
            if (calculo >= 39){
                imprimeResultado(nome, calculo);
                System.out.println("seu genero é feminino");
                System.out.println("você está com obesidade morbida!!");
            }
            else if (calculo > 29){
                imprimeResultado(nome, calculo);
                System.out.println("seu genero é feminino");
                System.out.println("você está com obesidade moderada");
            }
            else if (calculo > 24){
                imprimeResultado(nome, calculo);
                System.out.println("seu genero é feminino");
                System.out.println("você está com obesidade leve");
            }
            else if (calculo > 19){
                imprimeResultado(nome, calculo);
                System.out.println("seu genero é feminino");
                System.out.println("você está com o peso normal");
            }
            else if (calculo < 19){
                imprimeResultado(nome, calculo);
                System.out.println("seu genero é feminino");
                System.out.println("você está com o peso abaixo do normal");
            }
        }
        lerTeclado.close();

    }
}
