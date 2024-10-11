import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroInscricao;
        double altura;
        double somaAlturas = 0;
        int totalAtletas = 0;

        int numeroInscricaoMaisAlto = 0;
        double alturaMaisAlta = 0;

        int numeroInscricaoMaisBaixo = 0;
        double alturaMaisBaixa = Double.MAX_VALUE;

        while (true) {
            System.out.print("Digite o número de inscrição do atleta (ou 0 para encerrar): ");
            numeroInscricao = scan.nextInt();

            if (numeroInscricao == 0) {
                break;
            }

            System.out.print("Digite a altura do atleta: ");
            altura = scan.nextDouble();

            totalAtletas++;
            somaAlturas += altura;

            if (altura > alturaMaisAlta) {
                alturaMaisAlta = altura;
                numeroInscricaoMaisAlto = numeroInscricao;
            }

            if (altura < alturaMaisBaixa) {
                alturaMaisBaixa = altura;
                numeroInscricaoMaisBaixo = numeroInscricao;
            }
        }

        if (totalAtletas > 0) {
            double mediaAltura = somaAlturas / totalAtletas;
            System.out.println("Atleta mais alto: Número de Inscrição " + numeroInscricaoMaisAlto + ", Altura: " + alturaMaisAlta);
            System.out.println("Atleta mais baixo: Número de Inscrição " + numeroInscricaoMaisBaixo + ", Altura: " + alturaMaisBaixa);
            System.out.println("Altura média do grupo: " + mediaAltura);
        } else {
            System.out.println("Nenhum atleta registrado.");
        }

        scan.close();
    }
}
