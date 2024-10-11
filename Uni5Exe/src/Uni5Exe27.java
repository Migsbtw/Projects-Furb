import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dia;
        double salario;
        int producaoManha, producaoTarde;
        int diaMaiorProducao = 0;
        int maiorProducao = 0;
        int totalProducaoManha = 0;
        int totalProducaoTarde = 0;

        while (true) {
            System.out.print("Dia: ");
            dia = scan.nextInt();
            while (dia < 1 || dia > 30) {
                System.out.println("Dia inválido");
                System.out.print("Dia: ");
                dia = scan.nextInt();
            }

            System.out.print("Produção no turno da manhã: ");
            producaoManha = scan.nextInt();
            System.out.print("Produção no turno da tarde: ");
            producaoTarde = scan.nextInt();

            int totalProduzido = producaoManha + producaoTarde;

            if (dia <= 15) {
                if (totalProduzido > 100 && producaoManha >= 30 && producaoTarde >= 30) {
                    salario = totalProduzido * 0.80;
                } else {
                    salario = totalProduzido * 0.50;
                }
            } else {
                salario = producaoManha * 0.40 + producaoTarde * 0.30;
            }

            System.out.println("R$ " + salario + " (valor recebido)");

            if (totalProduzido > maiorProducao) {
                maiorProducao = totalProduzido;
                diaMaiorProducao = dia;
            }

            totalProducaoManha += producaoManha;
            totalProducaoTarde += producaoTarde;

            System.out.print("Novo funcionário (1.sim 2.não)? ");
            int resposta = scan.nextInt();
            if (resposta != 1) {
                break;
            }
        }

        System.out.println("Dia da maior produção: " + diaMaiorProducao);
        if (totalProducaoManha > totalProducaoTarde) {
            System.out.println("O funcionário mais produziu no período da manhã com " + totalProducaoManha + " peças.");
        } else {
            System.out.println("O funcionário mais produziu no período da tarde com " + totalProducaoTarde + " peças.");
        }

        scan.close();
    }
}
