package Kodluyoruz;

import java.util.Scanner;

public class BasamakToplam {

	public static void main(String[] args) {
		// Bir say�n�n basamak say�lar�n�n toplam�n� hesaplayan program�
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("L�tfen i�lem yapmak istde�iniz say�y� giriniz : ");
		int sayi = scan.nextInt();
		int sayiTut = sayi;
		int sayiDegeri = 0;
		int toplam = 0;
		
		
		while(sayiTut !=0) {
			sayiDegeri = sayiTut % 10;
			toplam += sayiDegeri;
			sayiTut /= 10;
		}
		
		System.out.print(sayi + " " + "Say�s�n�n basamak toplam� : " + toplam);
		
	
		
		

	}

}
