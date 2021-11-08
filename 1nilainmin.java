import java.util.Scanner;
public class PTRno1{
public static void main(String[] args){

        int a,b,c;

        Scanner input = new Scanner(System.in);

        System.out.print("masukkan nilai a = ");
        a=input.nextInt();
        System.out.print("masukkan nilai b = ");
        b=input.nextInt();
        System.out.print("masukkan nilai c = ");
        c=input.nextInt();

        int nilaiMin;
        nilaiMin=Fnmin(a,b,c);
        System.out.println("Nilai Min = "+nilaiMin);
}

private static int Fnmin(int a, int b, int c) {
        if (a<b && a<c){
        return a;

        }if (b<a && b<c){
        return b;

        }else{
        return c;
        }
        }

}
