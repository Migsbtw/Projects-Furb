import java.util.Scanner;
public class Uni5Exe07 {
    public static void main(String[] args) {
        int n = 0;
        double numeroMaior=0,numeroMenor=0;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for(int i = 1; i < n + 1; i++){
            double n1 = scan.nextDouble();
            if (i == 1) {   
                numeroMaior = n1;
                numeroMenor = n1;
            }else if(n1 < numeroMenor){
                numeroMenor = n1;
            }else if(n1 > numeroMaior){
                numeroMaior = n1;
            }
        }
        System.out.println("Numero menor: "+ numeroMenor);
        System.out.println("Numero maior: "+ numeroMaior);
        scan.close();
        }
    }

