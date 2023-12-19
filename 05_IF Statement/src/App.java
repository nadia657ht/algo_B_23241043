
import java.util.Scanner;

public class App {

    public static void main(String[] args)  {
        System.out.println("Hello, World!");
    
           //Data member
           int total_belanja = 0;


           //membuat scanner menerima input dari keyboard
           Scanner scan = new Scanner (System.in);


           //mengambil input dari keyboard
           System.out.print("Masukan Total Belanja :");
           total_belanja = scan.nextInt();

           //cek total belanja
           if (total_belanja >= 50000) {
           System.out.println( " Anda Mendapatkan Mouse " );
           } else {
           System.out.println( " Belanja Anda kurang dari Rp. 50000") ;
           }

            System.out.println("Terima kasih Belanja di Toko kami");
           }
        }
