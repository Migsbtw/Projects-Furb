import java.util.Scanner;
public class Uni5Exe05 {
    public static void main(String[] args) {
        int numeroTermos = 0,n = 8;
        Scanner scan = new Scanner(System.in);
        numeroTermos = scan.nextInt();

        System.out.println(n);
    for (int i = 1; i < numeroTermos + 1; i++ ){
        if (i % 2 != 0) {
            n += 2;
        }else{
            n -= 2;
            n *= 2;
        }
        System.out.println(n);
    }
    scan.close();
    }
}
