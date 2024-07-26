import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Cachorro Quente");
        System.out.println("2 - X-Salada");
        System.out.println("3 - X-Bacon");
        System.out.println("4 - Torrada Simples");
        System.out.println("5 - Refrigerante");
        System.out.print("Digite o código do item: ");
        int item = sc.nextInt();
        System.out.println("Digite a quantidade do item: ");
        double qtd = sc.nextInt();

        if (item == 1){
            double valor = qtd * 4;
            System.out.print("Total: R$ " + valor);
        }
        else if (item == 2){
            double valor = qtd * 4.50;
            System.out.print("Total: R$ " + valor);
        }
        else if (item == 3){
            double valor = qtd * 5;
            System.out.print("Total: R$ " + valor);
        }
        else if (item == 4){
            double valor = qtd * 2;
            System.out.print("Total: R$ " + valor);
        }
        else if (item == 5){
            double valor = qtd * 1.50;
            System.out.print("Total: R$ " + valor);
        }

    }
}
