import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scan.nextInt();
        int n = numero;

        System.out.println("número\tdecomposição");

        while (n > 1) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    System.out.println(n + "\t" + i);
                    n /= i;
                    break;
                }
            }
        }
        
        System.out.println("1\t");
        scan.close();
    }
}
