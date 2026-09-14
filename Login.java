import java.util.Scanner;

public class Login {

    public static void verificao(Scanner leia){

        String confirmacao,usuario,senha,usuarioCorreto="c",senhaCorreta="1";

        do {
            System.out.println("------------------------");
            System.out.println("Realize seu login");
            System.out.println("------------------------");
            System.out.println("Digite o seu usuaŕio:");
            usuario = leia.next();
            System.out.println("------------------------");
            System.out.println("Digite sua senha:");
            senha = leia.next();
            System.out.println("------------------------");

            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)){
                confirmacao = "Correto";
            }
            else{
                confirmacao = "Incorreto";
            }

            if (confirmacao.equals("Correto")) {
                Menu.telaPrincipal(leia);
            } else {
                System.out.println("Incorreto, tente novamente...");

            }
        }while(confirmacao.equals("Incorreto"));








    }


}
