package latihanindividuptr;

import java.util.Scanner;

public class ganjilgenap {
     int angka;
    public static void main(String args[])
  {
    int a;
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan sebuah bilangan : ");
    a = scan.nextInt();
    if (a % 2 == 0) {
      System.out.print("Bilangan " + a + " adalah genap.\n");
    } else {
      System.out.print("Bilangan " + a + " adalah ganjil.\n");
    }
  }
}

