
import java.util.Scanner;

public class Banco_Simples {

    public static double saldo = 0;

    public static void main(String[]args){

         Scanner leia = new Scanner(System.in);



        Login login;
        login = new Login();

        Menu menu;
        menu = new Menu();

        Operacoes operacoes;
        operacoes = new Operacoes();

        Voltar voltar;
        voltar = new Voltar();

        Login.verificao(leia);


        leia.close();

    }

}

