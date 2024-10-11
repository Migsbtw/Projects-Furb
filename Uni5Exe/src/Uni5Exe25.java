import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pontosDireito = 0;
        int pontosEsquerdo = 0;
        String codigoPonto;

        while (true) {
            System.out.print("Digite o código do ponto (D para direito, E para esquerdo): ");
            codigoPonto = sc.nextLine().toUpperCase();

            if (codigoPonto.equals("D")) {
                pontosDireito++;
            } else if (codigoPonto.equals("E")) {
                pontosEsquerdo++;
            } else {
                System.out.println("Código inválido. Tente novamente.");
                continue;
            }

            if ((pontosDireito >= 21 || pontosEsquerdo >= 21) && (pontosDireito - pontosEsquerdo >= 2 || pontosEsquerdo - pontosDireito >= 2)) {
                break;
            }
        }

        if (pontosDireito > pontosEsquerdo) {
            System.out.println("Vencedor: Jogador da direita com " + pontosDireito + " pontos.");
        } else {
            System.out.println("Vencedor: Jogador da esquerda com " + pontosEsquerdo + " pontos.");
        }

        sc.close();
    }
}
