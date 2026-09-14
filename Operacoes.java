import java.util.Scanner;

public class Operacoes {

    public static void deposito(Scanner leia){

        double deposito;


        do {
            System.out.println("------------------------------");
            System.out.println("           DEPOSITO           ");
            System.out.println("------------------------------");
            System.out.print("Digite o valor do deposito: R$");
            deposito = leia.nextDouble();
            System.out.println("------------------------------");

            if (deposito < 0){
                System.out.println("--------------");
                System.out.println("Valor inválido");
                System.out.println("--------------");
                Voltar.retorno(leia);
            }
            else{
                Banco_Simples.saldo +=deposito;
                System.out.println("--------------------------------");
                System.out.println("Deposito realizado com sucesso!!");
                System.out.println("--------------------------------");
                System.out.println("Valor do deposito: R$"+deposito);
                System.out.println("Saldo atual: R$"+Banco_Simples.saldo);
                Voltar.retorno(leia);
            }

        }while(Voltar.escolhaVoltar ==2);



    }
    public static void retirada(Scanner leia){

        double retirada;

        do {

            System.out.println("------------------------------");
            System.out.println("           RETIRADA           ");
            System.out.println("------------------------------");
            System.out.print("Digite o valor do retirada: R$");
            retirada = leia.nextDouble();
            System.out.println("------------------------------");

            if (retirada < 0 || retirada > Banco_Simples.saldo){
                System.out.println("---------------------");
                System.out.println("Valor inválido/Insuficiente");
                System.out.println("Saldo atual: R$"+Banco_Simples.saldo);
                System.out.println("---------------------");
                Voltar.retorno(leia);
            }
            else{
                Banco_Simples.saldo-=retirada;
                System.out.println("--------------------------------");
                System.out.println("Retirada realizado com sucesso!!");
                System.out.println("--------------------------------");
                System.out.println("Valor do retirada: R$"+retirada);
                System.out.println("Saldo atual: R$"+Banco_Simples.saldo);
                Voltar.retorno(leia);
            }

        }while(Voltar.escolhaVoltar ==2);



    }

    public static void consultaSaldo(Scanner leia){

        System.out.println("----------------------------");
        System.out.println("Seu saldo atual: R$"+Banco_Simples.saldo);
        System.out.println("----------------------------");
        System.out.println("Digite qualquer coisa e aperte ENTER");
        leia.next();



    }
    public static void pix(Scanner leia){

        int escolhaPix=0;
        String cpf;
        String telefone;
        String email;

        System.out.println("------------------------");
        System.out.println("         PIX            ");
        System.out.println("------------------------");
        System.out.println("Escolha a forma de envio");
        System.out.println("------------------------");
        System.out.println("[1] CPF                 ");
        System.out.println("[2] TELEFONE            ");
        System.out.println("[3] EMAIL               ");
        System.out.println("[4] VOLTAR              ");
        System.out.println("---------------------------");
        System.out.print("Digite qual a opção desejada:");
        escolhaPix = leia.nextInt();
        System.out.println("---------------------------");

        switch (escolhaPix){

            case 1:
                do {
                    System.out.println("---------------------------");
                    System.out.print("Digite o CPF:");
                    cpf = leia.next();
                    System.out.println("---------------------------");


                    if (cpf.length() == 11) {
                        operacaoPix(leia);
                    } else {
                        System.out.println("Inválido");
                        Voltar.retorno(leia);
                    }
                }while(Voltar.escolhaVoltar == 2);
                break;

            case 2:
                do {

                    System.out.println("---------------------------");
                    System.out.print("Digite seu telefone:");
                    telefone = leia.next();
                    System.out.println("---------------------------");

                    if (telefone.length() == 11) {
                        operacaoPix(leia);
                    } else {
                        System.out.println("Inválido");
                        Voltar.retorno(leia);
                    }
                }while(Voltar.escolhaVoltar == 2);
                break;

            case 3:
                do {
                    System.out.println("---------------------------");
                    System.out.print("Digite seu email:");
                    email = leia.next();
                    System.out.println("---------------------------");

                    if (email.contains("@gmail.com") || email.contains("@hotmail.com")) {
                        operacaoPix(leia);
                    } else {
                        System.out.println("Inválido");
                        Voltar.retorno(leia);
                    }
                }while(Voltar.escolhaVoltar == 2);
                break;

            case 4:

                break;

        }


    }
    public static void operacaoPix(Scanner leia) {

        double pix;
        do {
            System.out.println("----------------------");
            System.out.print("Digite o valor do PIX: R$");
            pix = leia.nextDouble();
            System.out.println("----------------------");

            if (pix < 0 || pix > Banco_Simples.saldo) {
                System.out.println("---------------------");
                System.out.println("Valor inválido/Insuficiente");
                System.out.println("Saldo atual: R$" + Banco_Simples.saldo);
                System.out.println("---------------------");
                Voltar.retorno(leia);
            } else {
                Banco_Simples.saldo -= pix;
                System.out.println("--------------------------------");
                System.out.println("Pix realizado com sucesso!!");
                System.out.println("--------------------------------");
                System.out.println("Valor do pix: R$" + pix);
                System.out.println("Saldo atual: R$" + Banco_Simples.saldo);
                Voltar.retorno(leia);
            }
        }while(Voltar.escolhaVoltar ==2);
    }







}
