package Kodluyoruz;

import java.util.Scanner;

public class Kombinasyon {

	public static void main(String[] args) {
		// Kombinasyon
		
		int a,b,fakt1 = 1,fakt2 = 1,fakt3 = 1,c;
		
		double islem = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen iþlem yapmak istediðiniz ilk sayýyý giriniz : ");
		a = scan.nextInt();
		
		System.out.print("Lütfen iþlem yapmak istediðiniz ikinci sayýyý giriniz : ");
		b = scan.nextInt();
		
		for(int i = 1; i<=a ;i++) {
			fakt1 *= i;
			
		}
		System.out.println(a + ". Faktoryeli : " + fakt1);
		
		for(int j = 1; j<=b; j++) {
			fakt2 *= j;
			
		}
		
		System.out.println(b + ". Faktoryeli : " + fakt2);
		
		c = a - b;
		for(int z = 1; z<=c; z++) {
			fakt3 *= z;
			
		}
		
		System.out.println(c + ". Faktoryeli : " + fakt3);
		
		islem = fakt1 / (fakt2 * (fakt3));
		
		System.out.print("Ýþlem sonucu : " + islem);
		
		
	}

}
