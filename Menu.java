import java.util.Scanner;

public class Menu {

    public static void telaPrincipal(Scanner leia){

        int escolha;


        do {
            System.out.println("------------------------");
            System.out.println("      BEM-VINDO !!      ");
            System.out.println("------------------------");
            System.out.println("[1] DEPOSITO            ");
            System.out.println("[2] RETIRADA            ");
            System.out.println("[3] CONSULTA DE SALDO   ");
            System.out.println("[4] PAGAMENTO VIA PIX   ");
            System.out.println("[5] SAIR DO PROGRAMA    ");
            System.out.println("-----------------------------------");
            System.out.print("Digite qual operação deseja realizar:");
            escolha = leia.nextInt();
            System.out.println("-----------------------------------");

            switch (escolha) {

                case 1:
                    Operacoes.deposito(leia);
                    break;

                case 2:
                    Operacoes.retirada(leia);
                    break;
                case 3:
                    Operacoes.consultaSaldo(leia);
                    break;
                case 4:
                    Operacoes.pix(leia);
                    break;
                case 5:
                    System.out.println("Encerrado");
                    System.out.println("Obrigado pela preferência");
                    break;
                default:
                    System.out.println("Inválido, tente de novo");
                    break;

            }

        } while (escolha != 5);

    }

}
