/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ratanilai;

import java.util.Scanner;

/**
 * Nama : Moch Rizki Maulana N
 * Kelas : IF-1/S1/III
 * NIM : 10118012
 * Deskripsi Program: MEnampilkan nilai rata-rata nilai mahasiswa
 *
 * @author LENOVO
 */
public class Ratanilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
          
        int Bm;
        int[] Na = new int[10];
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        Bm = input.nextInt();
        double Rata = 0;
        for(int i =0; i< Bm; i++){
            System.out.print("Nilai Mahasiswa Ke-"+(i+1)+" = ");
            Na[i] =input.nextInt();
            Rata += Na[i];
        }
        System.out.println("Maka ,Rata-Rata Nilainya Adalah : "+(Rata/Bm));
        System.out.println("( Develoved By : Moch Rizki Maulana N )");
    }
    
}
