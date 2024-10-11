import java.util.Scanner;
public class Uni5Exe08 {
    public static void main(String[] args) {
        int n = 0;
        int numeroMaiorTermos = 0;
        int numeroMaior=0,numeroMenor=0;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for(int i = 1; i < n + 1; i++){
            int n1 = scan.nextInt();
            if(n1 < 0){
                if (n1 < numeroMenor) {
                    numeroMenor = n1;
                }
            }else if(n1 >= 0){
                numeroMaiorTermos += 1;
                numeroMaior += n1;
            }
        }
        System.out.println("Numero menor: "+ numeroMenor);
        System.out.println("Media dos numeros positivos: "+ numeroMaior/numeroMaiorTermos);
        scan.close();
        }
    }

