package Kodluyoruz;

import java.util.Scanner;

public class Dort_besK {

	public static void main(String[] args) {
		// Girilen say�ya kadar 4 ve 5'in kat�n� bulma
		
		int sayi;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("L�tfen i�lem yapmak istedi�iniz say�y� giriniz : ");
		sayi = scan.nextInt();
		
		for(int i = 1; i<sayi; i*= 2) {
			System.out.println("2'nin Katlar� : " + i);
		
			}
		System.out.println("-----------------------------------------");
		
		for(int j = 1; j<sayi; j*= 4) {
				System.out.println("4'�n Katlar� : " + j);
			 
				
			
			
			 
				
			
			
		}
	}

}
