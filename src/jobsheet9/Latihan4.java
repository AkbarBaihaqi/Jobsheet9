package jobsheet9;

import java.util.Scanner;

public class Latihan4 {

    
    public static void hitung(Double a, Double b) {
        System.out.println("Kecepatan: "+(a/b)+"km/jam");
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jarak : ");
        Double a = input.nextDouble();
        System.out.print("Masukan waktu : ");
        Double b = input.nextDouble();
        
        hitung(a, b);
        
    }
    
}
