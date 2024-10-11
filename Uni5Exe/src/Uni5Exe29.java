import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um valor: R$ ");
        int valor = scan.nextInt();

        int cédula20 = 0, cédula10 = 0, cédula5 = 0, cédula2 = 0, cédula1 = 0;

        while (valor > 0) {
            if (valor >= 20) {
                cédula20 = valor / 20;
                valor = valor - (cédula20 * 20);
            } else if (valor >= 10) {
                cédula10 = valor / 10;
                valor = valor - (cédula10 * 10);
            } else if (valor >= 5) {
                cédula5 = valor / 5;
                valor = valor - (cédula5 * 5);
            } else if (valor >= 2) {
                cédula2 = valor / 2;
                valor = valor - (cédula2 * 2);
            } else if (valor >= 1) {
                cédula1 = valor / 1;
                valor = valor - (cédula1 * 1);
            }
        }

        System.out.println("Cédulas necessárias:");
        if (cédula20 > 0) {
            System.out.println(cédula20 + " cédula(s) de R$ 20");
        }
        if (cédula10 > 0) {
            System.out.println(cédula10 + " cédula(s) de R$ 10");
        }
        if (cédula5 > 0) {
            System.out.println(cédula5 + " cédula(s) de R$ 5");
        }
        if (cédula2 > 0) {
            System.out.println(cédula2 + " cédula(s) de R$ 2");
        }
        if (cédula1 > 0) {
            System.out.println(cédula1 + " cédula(s) de R$ 1");
        }

        scan.close();
    }
}
