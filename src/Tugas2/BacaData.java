
package Tugas2;
import java.util.Scanner;

public class BacaData {
    public static void main(String[] args) {
        int a;
        Scanner masukan;

    System.out.print ("Contoh membaca dan menulis, ketik nilai integer: ");
    masukan = new Scanner(System.in);
    a = masukan.nextInt(); /* coba ketik : masukan.nextInt(); ; Apa akibatnya ?*/
    System.out.println("Nilai yang dibaca : "+ a);
    }  
}

