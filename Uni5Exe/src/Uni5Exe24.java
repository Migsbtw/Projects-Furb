import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o limite diário em quilogramas: ");
        double limiteDiario = sc.nextDouble() * 1000;
        double pesoTotal = 0;
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Digite o peso do peixe em gramas: ");
            double pesoPeixe = sc.nextDouble();
            pesoTotal += pesoPeixe;

            if (pesoTotal > limiteDiario) {
                System.out.println("Limite diário excedido! Peso total da pesca: " + pesoTotal + " gramas.");
                break;
            }

            System.out.println("Peso total da pesca até agora: " + pesoTotal + " gramas.");
            System.out.print("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)? ");
            continuar = sc.next();
        }

        sc.close();
    }
}
