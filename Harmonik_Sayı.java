package Kodluyoruz;

import java.util.Scanner;

public class Harmonik_Sayi {

	public static void main(String[] args) {
		// Harmonik sayý bulma
		
		double sayi;
		double toplam = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen islem yapmak istediginiz sayiyi giriniz : ")
		sayi = scan.nextDouble();
		
		for(double i = 1; i<=sayi; i++) {
			toplam += (1/i);
		}
		System.out.print("Islem sonucu : " + toplam);
	}

}
