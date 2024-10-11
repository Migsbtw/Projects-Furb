import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor máximo de pedágio: ");
        double limitePedagio = sc.nextDouble();
        
        double custoPedagio;
        int trechosAcimaLimite = 0;
        int totalTrechos = 0;
        int trechosLongosAceitos = 0;

        while (true) {
            System.out.print("Pedágio: ");
            custoPedagio = sc.nextDouble();
            if (custoPedagio < 0) {
                break;
            }

            System.out.print("Distância: ");
            int distancia = sc.nextInt();
            totalTrechos++;

            if (custoPedagio > limitePedagio) {
                trechosAcimaLimite++;
            }

            if (distancia > 150 && custoPedagio <= limitePedagio) {
                trechosLongosAceitos++;
            }
        }

        System.out.println(trechosAcimaLimite + " (trechos com valor acima do qual ele nega-se a pagar)");
        System.out.println(totalTrechos + " (quantidade de trechos informados)");
        System.out.println(trechosLongosAceitos + " (trechos acima de 150km com valor aceito por ele)");

        sc.close();
    }
}
