/**
 * Created by 21343045_Farraz Hadyan
 */

package Tugas;
import java.util.Scanner;

public class Mahasiswa {
    float ip;
    String nama,nim,semester;

    public void inputDataMahasiswa(){
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukan Nama            : ");
        nama = masuk.nextLine();
        System.out.print("Masukan NIM             : ");
        nim = masuk.nextLine();
        System.out.print("Masukan Semester        : ");
        semester = masuk.nextLine();
        System.out.print("Masukan IP semester ini : ");
        ip = masuk.nextFloat();
    }

    public void tampilData(){
        System.out.println("Nama            : " +nama);
        System.out.println("NIM             : " +nim);
        System.out.println("Semester        : " +semester);
        System.out.println("IP Semester ini : " +ip);
    }

    public void jika(){
        if(ip>=3.5){
            System.out.println("Anda berhak mengontrak 24 SKS pada semester V");
        }
        else if(ip>=3){
            System.out.println("Anda berhak mengontrak 22 SKS pada semester V");
        }
        else if(ip>=2.5){
            System.out.println("Anda berhak mengontrak 20 SKS pada semester V");
        }
        else if(ip>=2){
            System.out.println("Anda berhak mengontrak 18 SKS pada semester V");
        }
        else{
            System.out.println("Anda berhak mengontrak 15 SKS pada semester V");    
        }
    }
   
}
