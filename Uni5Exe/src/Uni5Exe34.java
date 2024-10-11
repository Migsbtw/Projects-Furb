import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;
        int contasEncerradas = 0;

        do {
            System.out.println("Opções:");
            System.out.println("1. Encerrar a conta de um hóspede");
            System.out.println("2. Verificar número de contas encerradas");
            System.out.println("3. Sair");
            opcao = scan.nextInt();

            if (opcao == 1) {
                System.out.print("Nome do hóspede: ");
                String nome = scan.next();
                System.out.print("Número de diárias: ");
                int diarias = scan.nextInt();

                double valorDiaria = 50.0;
                double taxaServico;

                if (diarias < 15) {
                    taxaServico = 7.50;
                } else if (diarias == 15) {
                    taxaServico = 6.50;
                } else {
                    taxaServico = 5.00;
                }

                double total = (valorDiaria * diarias) + (taxaServico * diarias);
                System.out.println("Nome: " + nome);
                System.out.println("Total a ser pago: R$ " + total);
                contasEncerradas++;
            } else if (opcao == 2) {
                System.out.println("Número de contas encerradas: " + contasEncerradas);
            } else if (opcao != 3) {
                System.out.println("Opção inválida");
            }

        } while (opcao != 3);
        
        scan.close();
    }
}
