import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu salario: ");
        double sal = sc.nextDouble();
        double diferenca = sal - 2000;

        if (sal <= 3000){
            double imposto = diferenca * 0.08;
            System.out.printf("R&: %.2f" , imposto);
        }
        else if (sal <=  4500){
            double imposto = diferenca * 0.18;
            System.out.printf("R&: %.2f" , imposto);
        }
        else if (sal > 4500){
            double imposto = diferenca * 0.28;
            System.out.printf("R&: %.2f" , imposto);
        }
        else if (sal < 2000){
            System.out.println("Isento");
        }
        sc.close();
    }
}
