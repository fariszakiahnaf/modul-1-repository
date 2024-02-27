import java.util.Scanner;
public class library{
    void Student(long nomer){
        long Nim[] = {202310370311174L, 202310370311175L, 202310370311176L};
        for (long i : Nim){
            if (i == nomer){
                System.out.println("Sukses login sebagai mahasiswa.");
                break;
            } else {
                System.out.println("User tidak ditemukan.");
                break;
            }
        }
    }
    void Admin(String user, String password){
        String adm = "admin";
        String pw = "admin";

        if (adm.equals(user) && pw.equals(password)){
            System.out.println("Sukses login sebagai Admin.");
        }else{
            System.out.println("User tidak ditemukan.");
        }
    }
    public static void main(String[] args){
        library lb = new library();
        Scanner inp = new Scanner(System.in);
        //masukkan data//
        System.out.println("====== Library System ======");
        System.out.println("1. Login sebagai mahasiswa");
        System.out.println("2. Login sebagai admin");
        System.out.println("3. keluar");
        System.out.print("Pilih opsi (1-3): ");
        int pilih = inp.nextInt();

        switch (pilih){
            case 1:
                System.out.print("Masukkan NIM: ");
                long nim = inp.nextLong();
                lb.Student(nim);
                break;
            case 2:
                System.out.print("Masukkan username: ");
                String user = inp.next();
                System.out.print("Masukkan password: ");
                String pass = inp.next();
                lb.Admin(user,pass);
                break;
            case 3:
                break;
            default:
                System.out.println("Maaf inputan anda salah.");
                break;
        }
    }
}
