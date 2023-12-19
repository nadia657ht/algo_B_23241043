import java.util.Scanner;

public class BanyakIF {
public static void main(String[] args) {
    
     //DATA MEMBER
     int nilai;
     String grade;

     //INPUT SCANNER
     Scanner scan = new Scanner (System.in);

     //MEMASUKAN INPUT
     System.out.print("Masukan nilai : ");
     nilai = scan.nextInt();

     //IF STATEMENT
     if (nilai <= 80) {
        grade = "A";
     }
        else if (nilai >=70 && nilai <=79){
        grade ="B";
     } else if (nilai >=60 && nilai <=69){
        grade ="c";
     } else if (nilai >=50 && nilai <=59){
        grade ="D";
     } else {
        grade ="E";
     }

     System.out.println(" nilai angka : " + nilai);
     System.out.println("nilai huruf : "  + grade);

    


    }
}
