import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner scan = new Scanner(System.in); 
        for(int a = 1; a <21; a++){
            n = scan.nextInt();
            if (n % 2 == 0) {
                System.out.println("Par");
            }else{
                System.out.println("Impar");
            }
            n = 0;
        }
    scan.close();
    }
}
