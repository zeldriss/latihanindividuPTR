
package latihanindividuptr;
import java.util.Scanner;

public class LatihanIndividuPTR {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a, t;
        double luas;
        
        System.out.print("Masukan Alas : ");
        a=input.nextInt();
        System.out.print("Masukan Tinggi : ");
        t=input.nextInt();
        
        luas=0.5*a*t;
        System.out.println("Luas Segitiga : "+luas);
    }  
}

