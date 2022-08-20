package Kodluyoruz;

import java.util.Scanner;

public class Dort_besK {

	public static void main(String[] args) {
		// Girilen sayıya kadar 4 ve 5'in katını bulma
		
		int sayi;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen işlem yapmak istediğiniz sayıyı giriniz : ");
		sayi = scan.nextInt();
		
		for(int i = 1; i<sayi; i*= 5) {
			System.out.println("5'nin Katları : " + i);
		
			}
		System.out.println("-----------------------------------------");
		
		for(int j = 1; j<sayi; j*= 4) {
				System.out.println("4'ün Katları : " + j);
			 
				
			
			
			 
				
			
			
		}
	}

}
