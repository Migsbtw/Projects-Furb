import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalPessoas = 0;
        double somaAlturas = 0;

        int totalMulheres = 0;
        double somaAlturasMulheres = 0;

        while (true) {
            System.out.print("Digite a altura da pessoa (ou 0 para encerrar): ");
            double altura = scan.nextDouble();

            if (altura == 0) {
                break;
            }

            System.out.print("Digite o gênero da pessoa (M/m para masculino, F/f para feminino, O/o para outro): ");
            char genero = scan.next().charAt(0);

            totalPessoas++;
            somaAlturas += altura;

            if (genero == 'F' || genero == 'f') {
                totalMulheres++;
                somaAlturasMulheres += altura;
            }
        }

        if (totalPessoas > 0) {
            double mediaAlturaGrupo = somaAlturas / totalPessoas;
            System.out.println("Média de altura do grupo: " + mediaAlturaGrupo + " metros");

            if (totalMulheres > 0) {
                double mediaAlturaMulheres = somaAlturasMulheres / totalMulheres;
                System.out.println("Média de altura das mulheres: " + mediaAlturaMulheres + " metros");
            } else {
                System.out.println("Não há mulheres no grupo.");
            }
        } else {
            System.out.println("Nenhuma pessoa foi registrada.");
        }

        scan.close();
    }
}
