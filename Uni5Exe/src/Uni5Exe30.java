import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o valor inicial N: ");
        int N = scan.nextInt();
        
        System.out.print("Digite o valor do decremento K: ");
        int K = scan.nextInt();
        
        System.out.print("Digite o tamanho da mochila M: ");
        int M = scan.nextInt();
        
        int valorAtual = N;
        int totalNaMochila = 0;
        int somaNaMochila = 0;
        int somaForaDaMochila = 0;

        System.out.println("Elementos a serem colocados na mochila:");

        while (valorAtual > 0) {
            System.out.print(valorAtual + " ");
            valorAtual -= K;
        }

        System.out.println("\n\nElementos que entraram na mochila:");
        valorAtual = N;

        while (valorAtual > 0) {
            if (totalNaMochila + valorAtual <= M) {
                System.out.print(valorAtual + " ");
                totalNaMochila += valorAtual;
                somaNaMochila += valorAtual;
            }
            valorAtual -= K;
        }

        System.out.println("\n\nElementos que ficaram fora da mochila:");
        valorAtual = N;

        while (valorAtual > 0) {
            if (totalNaMochila + valorAtual > M) {
                System.out.print(valorAtual + " ");
                somaForaDaMochila += valorAtual;
            }
            valorAtual -= K;
        }

        System.out.println("\n\nSoma dos elementos que entraram na mochila: " + somaNaMochila);
        System.out.println("Soma dos elementos que não entraram na mochila: " + somaForaDaMochila);

        scan.close();
    }
}
