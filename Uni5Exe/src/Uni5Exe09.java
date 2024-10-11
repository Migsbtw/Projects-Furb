import java.util.Scanner;
public class Uni5Exe09 {
    public static void main(String[] args) {
        int nAlunos = 0,idade = 0,aluno18 = 0,aluno20 = 0; 
        Scanner scan = new Scanner(System.in);
        nAlunos= scan.nextInt();
        for(int i = 1; i < nAlunos + 1; i++){
            idade = scan.nextInt();
            if (idade == 18) {
                aluno18 += 1;
            }else if (idade > 20) {
                aluno20 += 1;
            }
        }
        System.out.println("Alunos de 18 anos: "+aluno18);
        System.out.println("Alunos de 20 anos: "+aluno20);
        scan.close();


    }
}
