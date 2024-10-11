import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Digite o nome do vendedor: ");
            String nome = scan.nextLine();
            
            System.out.print("Digite o número de produtos vendidos: ");
            int n = scan.nextInt();
            double totalVendas = 0;
            
            for (int i = 1; i <= n; i++) {
                System.out.print("Digite o preço do produto " + i + ": ");
                double precoUnitario = scan.nextDouble();
                System.out.print("Digite a quantidade vendida do produto " + i + ": ");
                int quantidade = scan.nextInt();
                totalVendas += precoUnitario * quantidade;
            }
            
            double salario = totalVendas * 0.30;
            System.out.println("Relatório do Vendedor:");
            System.out.println("Nome: " + nome);
            System.out.println("Total de Vendas: R$ " + totalVendas);
            System.out.println("Salário: R$ " + salario);
            
            System.out.print("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)? ");
            continuar = scan.next();
            scan.nextLine();
        }
        
        scan.close();
    }
}
