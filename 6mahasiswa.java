package latihanindividuptr;
import java.util.Scanner;

public class nama {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
    
        System.out.println("Menentukan Mahasiswa lulus atau tidak\n"
                + "-------------------------------------");
        System.out.print("Masukkan Nilai Tugas = ");
        double tugas = input.nextDouble();
        System.out.print("Masukkan Nilai Quiz = ");
        double quiz = input.nextDouble();
        System.out.print("Masukkan Nilai UTS = ");
        double uts = input.nextDouble();
        System.out.print("Masukkan Nilai UAS = ");
        double uas = input.nextDouble();
    

        System.out.println();
        double akhir = KelulusanMahasiswa(tugas,quiz,uts,uas);
    }
    
    static int KelulusanMahasiswa(double t,double q,double uts, double uas) {
        
        System.out.println("Nilai Tugas*20% = " +t*20/100);
        System.out.println("Nilai Quiz*10% = " +q*10/100);
        System.out.println("Nilai UTS*30% = " +uts*30/100);
        System.out.println("Nilai UAS*40% = " +uas*40/100);
        
        double n = (0.20*t+0.10*q+0.30*uts+0.40*uas);{
        System.out.println("\nTotal Nilai = "+n);
        if (n>70)
            System.out.println("Maka, Siswa Lulus");
        else
            System.out.println("Maka, Siswa tidak Lulus");
}return (int) n;
    }

}
