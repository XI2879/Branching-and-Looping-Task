package Tasks;

public class Pattern {
    public static void main(String[] args) {
// for loop to get the sequence
        for (int i = 5; i > 0; i--) {
            for (int j = 5; j > 0; j--) {
                if (j > i) {
                    System.out.print(j+" ");
                }else{
                    System.out.print(i+" ");
                }
            }

            System.out.println();

        }

    }
}
