package Kodluyoruz;

import java.util.Scanner;

public class UssAlma {

	public static void main(String[] args) {
		// Girilen say�n�n �ss�n� alma
		
		int a,b,us = 1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("L�tfen �ss� al�nack say�y� giriniz : ");
		a = scan.nextInt();
		
		System.out.print("L�tfen �ss olacak say�y� giriniz : ");
		b = scan.nextInt();
		
		for(int i = 1; i<=b; i++) {
			us *= a;
			
		}
		System.out.print(us);

	}

}
