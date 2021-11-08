package latihanindividuptr;

import java.util.Scanner;

public class kerucut {
             static Scanner in = new Scanner(System.in);
         public static void main(String[] args) {     

        int dmeter,t,rms,j;
        Scanner G = new Scanner (System.in);
        System.out.print ("Masukan Diameter: ");
        dmeter = G.nextInt();
       
        System.out.print("Masukan Tinggi: ");
        t = G.nextInt();
       
        double k,hsil;
        j=dmeter*1/2;
        k=3.14;
        rms= (j*j*t)/3;
        hsil = rms*k;
        System.out.print("hasilnya : "+hsil);
    }
   
}
