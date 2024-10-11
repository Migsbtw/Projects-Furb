import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int votosEgidio = 0;
        int votosAnaPaula = 0;
        int votosTramontin = 0;
        int votosRosane = 0;
        int votosNulos = 0;
        int votosBrancos = 0;
        int totalVotos = 0;
        int voto;

        do {
            System.out.print("1 para Egidio, 2 para Ana Paula, 3 para Tramontin, 4 para Rosane, 5 e 6 para nulo e Branco respectivamente: ");
            voto = scan.nextInt();

            if (voto == 1) {
                votosEgidio++;
            } else if (voto == 2) {
                votosAnaPaula++;
            } else if (voto == 3) {
                votosTramontin++;
            } else if (voto == 4) {
                votosRosane++;
            } else if (voto == 5) {
                votosNulos++;
            } else if (voto == 6) {
                votosBrancos++;
            } else if (voto != 0) {
                System.out.println("Opção incorreta");
            }

            if (voto > 0) {
                totalVotos++;
            }
        } while (voto != 0);

        System.out.println("Total de votos para o Candidato Egidio: " + votosEgidio);
        System.out.println("Total de votos para o Candidata Ana Paula: " + votosAnaPaula);
        System.out.println("Total de votos para o Candidato Tramontin: " + votosTramontin);
        System.out.println("Total de votos para o Candidata Rosane: " + votosRosane);
        System.out.println("Total de votos nulos: " + votosNulos);
        System.out.println("Total de votos em branco: " + votosBrancos);
        
        double percentualNulos = (totalVotos > 0) ? (double) votosNulos / totalVotos * 100 : 0;
        double percentualBrancos = (totalVotos > 0) ? (double) votosBrancos / totalVotos * 100 : 0;

        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
        System.out.println("Percentual de votos em branco: " + percentualBrancos + "%");
        
        scan.close();
    }
}
