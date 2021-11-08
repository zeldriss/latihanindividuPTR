package latihanindividuptr;

import java.util.Scanner;
public class nilai {
    public static void main(String[]args){
        Scanner masukkan = new Scanner (System.in);
        int nm;
        
        System.out.println("NILAI MIN, NILAI MAX, RATA RATA, DAN STANDART DEVIASI\n");
        
        
        System.out.print("Masukkan Jumlah Mahasiswa = ");
        int jm = masukkan.nextInt();
        int[] nilai = new int[jm];
        for (nm = 0; nm < jm; nm++){
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (nm + 1 + " = "));
            nilai[nm] = masukkan.nextInt();
        }
        
        System.out.println();
        
        min(nilai, nm);
        max(nilai, nm);
        double rerata = rata(nilai, nm);
        System.out.println("Rata Rata = " +rerata);
        stdev1(nilai, nm);
        stdev(nilai, nm);
    }
    
    public static int min(int[] nilai, int nm){
        int min = nilai[0];
        for (int i = 0; i < nilai.length; i++){
            if (nilai[i] < min){
                min = nilai[i];
            }
        }
        System.out.println("Nilai Minimum adalah = " +min);
        return min;
    }
    
    public static int max(int[] nilai, int nm){
        int max = nilai[0];
        for (int i = 0; i < nilai.length; i++){
            if (nilai[i] > max ){
                max = nilai[i];
            }
        }
        System.out.println("Nilai Maximunm adalah = " +max);
        return max;
    }
    
    public static double rata(int[] nilai, int nm){
        double jumlah = 0;
        double rata = 0;
        for (int i = 0; i < nilai.length; i++){
            jumlah += nilai[i];
        }
        double rata1 = jumlah / nm;
        return rata1;
    }
    
    public static double stdev(int[] nilai, int nm){
        double rata3 = rata(nilai, nm);
        double aj = 0;
        for (int i = 0; i < nilai.length; i++){
            aj += Math.pow((nilai[i] - rata3), 2);
        }
        double hasil = (Math.sqrt(aj) / (nilai.length));
        System.out.println("Standar Deviasi Error = " +hasil);
        return hasil;
    }
    
    public static double stdev1(int[] nilai, int nm){
        double sum = 0, sd = 0;
        
        for(double num:nilai){
            sum+=num;
        }
        for (double num:nilai){
            sd+= Math.pow(num - rata(nilai, nm),2);
        }
        double hasil = Math.sqrt(sd/nilai.length);
        System.out.println("Standar Deviasi = " +hasil);
        
        return hasil;
    }
    
}
