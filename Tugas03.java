package tp02;
import java.util.Scanner;
public class Tugas03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Input Jumlah permen yang dimiliki Dira dan Jumlah teman Dira
        int x, y; 
        x = input.nextInt();
        y = input.nextInt();
        //Teman Dira + Dira
        ++y;
        //Bagi Permen Dira
        int a = x/y;
        //Sisa Permen Dira Setelah dibagi
        int b = x%y;
        //Output
        System.out.println(a);
        System.out.println(b);

        input.close();
        
    }
}
