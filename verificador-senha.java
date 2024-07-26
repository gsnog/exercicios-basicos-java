import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args) {
        int senha = 2002;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua senha: ");
        int x = sc.nextInt();
        while (x != senha){
            System.out.println("Senha inválida");
            System.out.println("Digite sua senha: ");
            x = sc.nextInt();
        }
        System.out.println("Acesso permitido");
    }
}
