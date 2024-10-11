public class Uni5Exe10 {
    public static void main(String[] args) {
        int count = 0; 
        
        for (int i = 0; i >= 0; i++) {
            double p1 = i / 100; 
            double p2 = i % 100; 
            double sum = p1 + p2; 
            if (p1 == 0) {
                p1 = i / 10;
                p2 = i % 10;
                sum = p1 + p2;
            }else if(p1 > 10){
                p1 = i / 1000;
                p2 = i % 1000;
                sum = p1 + p2;
            }else if(p1 >100){
                p1 = i / 10000;
                p2 = i % 10000;
                sum = p1 + p2;
            }else if(p1 >1000){
                p1 = i / 100000;
                p2 = i % 100000;
                sum = p1 + p2;
            }
            if (sum * sum == i) { 
                System.out.println(i);
                count++;
            }
            if (count == 10) { 
                break;
            }
        }
    }
}
