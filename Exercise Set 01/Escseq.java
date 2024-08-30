public class Escseq {
    public static void main(String[] args) {

        int multiple = 7;
        int count = 5;

        for (int i = 1; i <= count; i++) {
            
            if (i % 2 == 0) {
                System.out.println("\t" + (multiple * i));
            } else {
                System.out.println(multiple * i);
            }
        }
    }
}
