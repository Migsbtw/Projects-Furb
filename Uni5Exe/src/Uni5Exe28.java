import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int votosNenhum = 0, votosCPM22 = 0, votosSkank = 0, votosJotaQuest = 0;
        int totalVotos = 0;
        char continuar = 's';

        while (continuar == 's' || continuar == 'S') {
            System.out.print("Mais um voto: s (SIM) / n (NÃO)? ");
            continuar = scan.next().charAt(0);

            if (continuar == 's' || continuar == 'S') {
                System.out.print("Digite o código do conjunto (1-Nenhum de Nós, 2-CPM22, 3-Skank, 4-Jota Quest): ");
                int codigo = scan.nextInt();

                switch (codigo) {
                    case 1:
                        votosNenhum++;
                        break;
                    case 2:
                        votosCPM22++;
                        break;
                    case 3:
                        votosSkank++;
                        break;
                    case 4:
                        votosJotaQuest++;
                        break;
                    default:
                        System.out.println("Código inválido. Tente novamente.");
                        continue;
                }
                totalVotos++;
            }
        }

        System.out.println("Total de votos:");
        System.out.println("Nenhum de Nós: " + votosNenhum + " voto(s)");
        System.out.println("CPM22: " + votosCPM22 + " voto(s)");
        System.out.println("Skank: " + votosSkank + " voto(s)");
        System.out.println("Jota Quest: " + votosJotaQuest + " voto(s)");

        System.out.println("Total de votos: " + totalVotos);

        if (totalVotos > 0) {
            double percentualNenhum = (votosNenhum * 100.0) / totalVotos;
            double percentualCPM22 = (votosCPM22 * 100.0) / totalVotos;
            double percentualSkank = (votosSkank * 100.0) / totalVotos;
            double percentualJotaQuest = (votosJotaQuest * 100.0) / totalVotos;

            System.out.println("Percentual de votos:");
            System.out.println("Nenhum de Nós: " + percentualNenhum + "%");
            System.out.println("CPM22: " + percentualCPM22 + "%");
            System.out.println("Skank: " + percentualSkank + "%");
            System.out.println("Jota Quest: " + percentualJotaQuest + "%");

            String vencedor = "Nenhum de Nós";
            int maxVotos = votosNenhum;

            if (votosCPM22 > maxVotos) {
                maxVotos = votosCPM22;
                vencedor = "CPM22";
            }
            if (votosSkank > maxVotos) {
                maxVotos = votosSkank;
                vencedor = "Skank";
            }
            if (votosJotaQuest > maxVotos) {
                maxVotos = votosJotaQuest;
                vencedor = "Jota Quest";
            }

            System.out.println("Grupo vencedor: " + vencedor);
        } else {
            System.out.println("Nenhum voto foi registrado.");
        }

        scan.close();
    }
}
