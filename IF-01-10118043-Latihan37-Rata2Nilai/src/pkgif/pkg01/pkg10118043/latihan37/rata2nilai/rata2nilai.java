/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg01.pkg10118043.latihan37.rata2nilai;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class rata2nilai {
	public static int[] nilaiMhs = new int[10];
	public static int banyakMahasiswa;
	public static double rataNilai;
    
    public static void hitungrata2(int banyakMhs) {
    double temp = 0;                       
    Scanner scanner = new Scanner(System.in);
    if(banyakMhs >10){
    System.out.println("Maaf Banyak Mahasiswa terlalu banyak,silahkan isi ulang kembali ");
    }
    else{
    for(int i = 1 ; i <= banyakMhs ; i++){
    System.out.print("Nilai Mahasiswa ke- " + i + " : ");
    nilaiMhs[i] = scanner.nextInt();
    temp += nilaiMhs[i]; 
    }
    rataNilai = temp / banyakMhs;  
    }
}
public static void main(String[] args) {
//input
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Banyaknya Mahasiswa : ");
banyakMahasiswa = scanner.nextInt();                        
//proses
hitungrata2(banyakMahasiswa);
System.out.println("Maka rata-rata nilainya adalah : " + rataNilai);                        		
	}    
}
