import java.util.Scanner;

public class Voltar {

    public static int escolhaVoltar;

    public static void retorno(Scanner leia){



        System.out.println("------------------------------------------");
        System.out.println("      Deseja realizar continuar?          ");
        System.out.println("------------------------------------------");
        System.out.println("[1] Não, voltar ao menu                   ");
        System.out.println("[2] Sim, desejo realizar a mesma operação ");
        System.out.println("[3] Gostaria de sair                      ");
        System.out.println("------------------------------------------");
        System.out.print("Digite a opção que deseja:");
        escolhaVoltar = leia.nextInt();

        if (escolhaVoltar == 3){
            System.out.println("Encerrado");
            System.out.println("Obrigado pela preferência");
            System.exit(0);
        }

    }



}
