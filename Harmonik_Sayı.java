package Kodluyoruz;

import java.util.Scanner;

public class Harmonik_Say� {

	public static void main(String[] args) {
		// Harmonik say� bulma
		
		double sayi;
		double toplam = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("L�tfen i�lem yapmak istedi�iniz say�y� girinzi : ");
		sayi = scan.nextDouble();
		
		for(double i = 1; i<=sayi; i++) {
			toplam += (1/i);
		}
		System.out.print("��lem sonucu : " + toplam);
	}

}
