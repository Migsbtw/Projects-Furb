import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalRecebido = 0.0;

        while (true) {
            System.out.print("Digite o valor da compra (ou 0 para encerrar): ");
            double valorCompra = scan.nextDouble();

            if (valorCompra == 0) {
                break;
            }

            double desconto;
            if (valorCompra > 500) {
                desconto = valorCompra * 0.20;
            } else {
                desconto = valorCompra * 0.15;
            }

            double totalAPagar = valorCompra - desconto;
            totalRecebido += totalAPagar;

            System.out.println("Valor total a pagar: R$ " + totalAPagar);
        }

        System.out.println("Valor total recebido pela loja ao final do dia: R$ " + totalRecebido);
        scan.close();
    }
}
