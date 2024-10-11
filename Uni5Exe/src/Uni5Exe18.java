import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalPessoas = 0;
        int audienciaCanal4 = 0;
        int audienciaCanal5 = 0;
        int audienciaCanal9 = 0;
        int audienciaCanal12 = 0;

        while (true) {
            System.out.print("Digite o número do canal (4, 5, 9, 12 ou 0 para encerrar): ");
            int canal = scan.nextInt();

            if (canal == 0) {
                break;
            }

            System.out.print("Digite o número de pessoas assistindo: ");
            int pessoas = scan.nextInt();

            if (canal == 4) {
                audienciaCanal4 += pessoas;
            } else if (canal == 5) {
                audienciaCanal5 += pessoas;
            } else if (canal == 9) {
                audienciaCanal9 += pessoas;
            } else if (canal == 12) {
                audienciaCanal12 += pessoas;
            }

            totalPessoas += pessoas;
        }

        if (totalPessoas > 0) {
            System.out.println("Percentual de audiência:");

            double percentualCanal4 = (audienciaCanal4 / (double) totalPessoas) * 100;
            double percentualCanal5 = (audienciaCanal5 / (double) totalPessoas) * 100;
            double percentualCanal9 = (audienciaCanal9 / (double) totalPessoas) * 100;
            double percentualCanal12 = (audienciaCanal12 / (double) totalPessoas) * 100;

            System.out.println("Canal 4: " + percentualCanal4 + "%");
            System.out.println("Canal 5: " + percentualCanal5 + "%");
            System.out.println("Canal 9: " + percentualCanal9 + "%");
            System.out.println("Canal 12: " + percentualCanal12 + "%");
        } else {
            System.out.println("Nenhuma audiência registrada.");
        }

        scan.close();
    }
}
