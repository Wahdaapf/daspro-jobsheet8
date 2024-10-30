import java.util.Scanner;

public class Triangle24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N;

        System.out.print("Masukkan Jumlah N : ");
        N = input.nextInt();
        
        int i = 0;
        while(i < N) {
            int j = 0;
            while(j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;
        }

        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        input.close();
    }
}