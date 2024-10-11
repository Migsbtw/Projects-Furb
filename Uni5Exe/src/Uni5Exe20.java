import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a massa inicial em Kg: ");
        double massaInicial = scan.nextDouble();
        double massaFinal = 0.0005; // 0.5 gramas em Kg
        int tempo = 0;

        while (massaInicial >= massaFinal) {
            massaInicial /= 2;
            tempo += 50;
        }

        System.out.println("Massa inicial: " + (massaInicial * 2) + " Kg");
        System.out.println("Massa final: " + massaInicial + " Kg");
        System.out.println("Tempo necessário: " + tempo + " segundos");
        
        scan.close();
    }
}
