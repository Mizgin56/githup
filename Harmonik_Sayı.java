package Kodluyoruz;

import java.util.Scanner;

public class Harmonik_Sayý {

	public static void main(String[] args) {
		// Harmonik sayý bulma
		
		double sayi;
		double toplam = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen iþlem yapmak istediðiniz sayýyý girinzi : ");
		sayi = scan.nextDouble();
		
		for(double i = 1; i<=sayi; i++) {
			toplam += (1/i);
		}
		System.out.print("Ýþlem sonucu : " + toplam);
	}

}
