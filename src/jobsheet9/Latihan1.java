package jobsheet9;

import java.util.Scanner;

public class Latihan1 {

    
    public static void hitung(int a, int b) {
        System.out.println("Kecepatan: "+(a/b)+"km/jam");
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jarak : ");
        int bil1 = input.nextInt();
        System.out.print("Masukan waktu : ");
        int bil2 = input.nextInt();
        
        hitung(bil1, bil2);
        
    }
    
}
