public class Uni5Exe04 {
    public static void main(String[] args) {
        double s;
        double deno, nume;
        int acrescimo;
        nume = 3;
        acrescimo = 4;
        deno = 2;
        for (int c = 1; c < 21; c++){
            s= nume / deno;
            System.out.println("Resultado "+c+": "+ s);
            nume += 2;
            deno += acrescimo;
            acrescimo += 2;   
        }
        
    }
}
