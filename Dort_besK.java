package Kodluyoruz;

import java.util.Scanner;

public class Dort_besK {

	public static void main(String[] args) {
		// Girilen sayýya kadar 4 ve 5'in katýný bulma
		
		int sayi;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen iþlem yapmak istediðiniz sayýyý giriniz : ");
		sayi = scan.nextInt();
		
		for(int i = 1; i<sayi; i*= 2) {
			System.out.println("2'nin Katlarý : " + i);
		
			}
		System.out.println("-----------------------------------------");
		
		for(int j = 1; j<sayi; j*= 4) {
				System.out.println("4'ün Katlarý : " + j);
			 
				
			
			
			 
				
			
			
		}
	}

}
