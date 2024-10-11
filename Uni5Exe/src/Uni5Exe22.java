public class Uni5Exe22 {
    public static void main(String[] args) {
        double salario = 2000.0;
        double aumento = 0;
        int ano = 1995;

        while (ano <= 2024) {
            if (ano == 1996) {
                aumento = salario * 0.015; 
            } else if (ano > 1996) {
                aumento *= 2; 
            }
            salario += aumento;
            ano++;
        }

        System.out.println("Salário do funcionário em 2024: R$ " + salario);
    }
}
