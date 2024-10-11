import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número total de reabastecimentos: ");
        int numReabastecimentos = scan.nextInt();

        double totalKm = 0;
        double totalCombustivel = 0;

        System.out.print("Digite o valor do odômetro antes de iniciar a viagem: ");
        double odometroAnterior = scan.nextDouble();

        for (int i = 1; i <= numReabastecimentos; i++) {
            System.out.print("Digite o valor do odômetro no reabastecimento " + i + ": ");
            double odometroAtual = scan.nextDouble();

            System.out.print("Digite a quantidade de combustível comprada (em litros) no reabastecimento " + i + ": ");
            double litros = scan.nextDouble();

            double kmRodados = odometroAtual - odometroAnterior;
            double kmPorLitro = kmRodados / litros;

            System.out.println("Quilometragem obtida por litro no reabastecimento " + i + ": " + kmPorLitro + " km/l");

            totalKm += kmRodados;
            totalCombustivel += litros;

            odometroAnterior = odometroAtual;
        }

        double kmMedioPorLitro = totalKm / totalCombustivel;
        System.out.println("Quilometragem média obtida por litro em toda a viagem: " + kmMedioPorLitro + " km/l");

        scan.close();
    }
}
