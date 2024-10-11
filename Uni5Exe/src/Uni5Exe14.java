import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int menosDe10 = 0;
        int entre10e20 = 0;
        int maisDe20 = 0;

        double totalCompra = 0;
        double totalVenda = 0;
        double lucroTotal = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o nome da mercadoria " + i + ": ");
            String nome = scan.next(); 

            System.out.print("Digite o preço de compra da mercadoria " + nome + ": ");
            double precoCompra = scan.nextDouble();

            System.out.print("Digite o preço de venda da mercadoria " + nome + ": ");
            double precoVenda = scan.nextDouble();

            double lucroPercentual = (precoVenda - precoCompra) / precoCompra * 100;

            if (lucroPercentual < 10) {
                menosDe10++;
            } else if (lucroPercentual <= 20) {
                entre10e20++;
            } else {
                maisDe20++;
            }

            totalCompra += precoCompra;
            totalVenda += precoVenda;
            lucroTotal += (precoVenda - precoCompra);
        }

        System.out.println("Mercadorias com lucro < 10%: " + menosDe10);
        System.out.println("Mercadorias com 10% <= lucro <= 20%: " + entre10e20);
        System.out.println("Mercadorias com lucro > 20%: " + maisDe20);
        System.out.println("Valor total de compra: R$ " + totalCompra);
        System.out.println("Valor total de venda: R$ " + totalVenda);
        System.out.println("Lucro total: R$ " + lucroTotal);

        scan.close();
    }
}
