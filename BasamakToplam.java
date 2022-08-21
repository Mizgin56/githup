package Kodluyoruz;

import java.util.Scanner;

public class BasamakToplam {

	public static void main(String[] args) {
		// Bir sayýnýn basamak sayýlarýnýn toplamýný hesaplayan programý
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen iþlem yapmak istdeðiniz sayýyý giriniz : ");
		int sayi = scan.nextInt();
		int sayiTut = sayi;
		int sayiDegeri = 0;
		int toplam = 0;
		
		
		while(sayiTut !=0) {
			sayiDegeri = sayiTut % 10;
			toplam += sayiDegeri;
			sayiTut /= 10;
		}
		
		System.out.print(sayi + " " + "Sayýsýnýn basamak toplamý : " + toplam);
		
	
		
		

	}

}
