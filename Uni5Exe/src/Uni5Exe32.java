import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o dia da semana do primeiro dia do mês (1=Domingo, 2=Segunda, ..., 7=Sábado): ");
        int primeiroDia = scan.nextInt();
        System.out.print("Digite o número de dias no mês: ");
        int numeroDias = scan.nextInt();

        System.out.println("Dom\tSeg\tTer\tQua\tQui\tSex\tSab");
        
        int diaAtual = 1;
        int diaDaSemana = primeiroDia;

        for (int i = 1; i < primeiroDia; i++) {
            System.out.print("\t");
        }

        while (diaAtual <= numeroDias) {
            System.out.print(diaAtual + "\t");
            if (diaDaSemana % 7 == 0) {
                System.out.println();
            }
            diaAtual++;
            diaDaSemana++;
        }

        scan.close();
    }
}
