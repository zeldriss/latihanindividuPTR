package latihanindividuptr;

import java.util.Scanner;

public class faktorical {
static int Faktorial(int a){
        int hasil = 1;
        for (int i=a; i>0; i--){
            hasil *=i;
        }
        return hasil;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        System.out.println(angka+" adalah "+Faktorial(angka));
    }
}
    
