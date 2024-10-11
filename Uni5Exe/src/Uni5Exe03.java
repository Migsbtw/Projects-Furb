import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe03 {
    public static void main(String[] args) throws Exception {
        double n = 1;
        double tot = 0;
        Scanner scan = new Scanner(System.in); 
        DecimalFormat deci = new DecimalFormat("0.00");
        for(int a = 1; a <101; a++){
            n = 1;
            n /= a;
            tot += n;
            System.out.println(deci.format(tot));
        }
    scan.close();
    }
}
