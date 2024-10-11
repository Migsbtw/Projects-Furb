public class Uni5Exe11 {
    public static void main(String[] args) {
        int totalBiscoitosQuebrados = 0;
        int biscoitosQuebradosHora = 1;

        for (int hora = 1; hora <= 16; hora++) {
            totalBiscoitosQuebrados += biscoitosQuebradosHora;
            biscoitosQuebradosHora *= 3;
        }

        System.out.println("Total de biscoitos quebrados em 16 horas: " + totalBiscoitosQuebrados);
    }
}
