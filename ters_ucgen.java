package Kodluyoruz;

import java.util.Scanner;

public class ters_ucgen {

	public static void main(String[] args) {
		// Ters ��gen
		
		int sayi;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("L�tfen i�lem yapmak istedi�iniz say� de�erini giriniz : ");
		sayi = scan.nextInt();
		
		for (int i = 1; i <= sayi; i ++) {
			for(int j = 1; j <= (i - 1); j++) {
				System.out.print(" ");
			}
			
			for(int k = 1; k <= 2 * sayi - (2 * i - 1); k++) {
				System.out.print("*");
			}
			
			System.out.println(" ");
			
		} 
        
		
	}
	
	

}
