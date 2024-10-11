import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        double alt = 0;
        double media = 0; 
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i < 21;i++){
            alt = scan.nextDouble();
            media += alt;
        }
        media /= 20;
        System.out.println(media);
        scan.close();
    }
}
