//pangil class bawaan java
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        //objek dr class scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nama jurusan di UMM: ");
        //panggil method next
        String jurusan = sc.next();
        System.out.println("Nama jurusan : " + jurusan);

        //deklarasi variable
        int population = 10000;
        String nama = "Informatika";
        char kar = 'a';

        //output
        System.out.println("populasinya :" + population);
        System.out.println("jurusan :" + nama + "\nkarakter :" + kar);
    }
}