import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o nome do aluno (ou 'fim' para encerrar): ");
            String nome = scan.next();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Digite a nota da primeira prova: ");
            double nota1 = scan.nextDouble();

            System.out.print("Digite a nota da segunda prova: ");
            double nota2 = scan.nextDouble();

            double media = (nota1 + nota2) / 2;

            System.out.println("A média do aluno " + nome + " é: " + media);
        }

        scan.close();
    }
}
