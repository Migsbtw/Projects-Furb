import java.util.Scanner;

public class Uni5Exe02 {
    public static void main(String[] args) throws Exception {
        int n = 1;
        int numerosPares = 0;
        int numerosImpares = 0;
        Scanner scan = new Scanner(System.in); 
        for(int a = 1; a <101; a++){
            if (a % 2 == 0) {
                numerosPares = numerosPares + n;
                System.out.println("Pares "+numerosPares);
            }else{
                numerosImpares = numerosImpares + n;
                System.out.println("Impares "+numerosImpares);
            }
            n += 1;
        }
        System.out.println("");
        System.out.println("Pares = "+numerosPares);
        System.out.println("Impares = "+numerosImpares);
    scan.close();
    }
}
