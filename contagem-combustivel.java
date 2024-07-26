import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
        int alcool = 1;
        int gasolina = 2;
        int diesel = 3;
        int fim = 4;

        int somaAlcool = 0;
        int somaGasolina = 0;
        int somaDiesel = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha seu combustivel: ");
        System.out.println("1 - Alcool 2 - Gasolina 3 - Diesel 4 - Fim");
        int x = sc.nextInt();
        while (x!=4){
            if (x == 1){
                somaAlcool += 1;
                System.out.println("Escolha seu combustivel: ");
                x = sc.nextInt();
            }
            else if (x==2){
                somaGasolina += 1;
                System.out.println("Escolha seu combustivel: ");
                x = sc.nextInt();
            }
            else if (x==3){
                somaDiesel += 1;
                System.out.println("Escolha seu combustivel: ");
                x = sc.nextInt();
            }
            else if (x < 1 || x >4){
                System.out.println("Opção inválida. Digite um número entre 1 e 4.");
                x = sc.nextInt();
            }
        }
        System.out.println("Fim");
        System.out.println("Alcool: " + somaAlcool);
        System.out.println("Gasolina: " + somaGasolina);
        System.out.println("Diesel: " + somaDiesel);


    }
}
