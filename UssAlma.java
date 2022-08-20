package Kodluyoruz;

import java.util.Scanner;

public class UssAlma {

	public static void main(String[] args) {
		// Girilen sayýnýn üssünü alma
		
		int a,b,us = 1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen Üssü alýnack sayýyý giriniz : ");
		a = scan.nextInt();
		
		System.out.print("Lütfen Üss olacak sayýyý giriniz : ");
		b = scan.nextInt();
		
		for(int i = 1; i<=b; i++) {
			us *= a;
			
		}
		System.out.print(us);

	}

}
