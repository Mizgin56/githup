package Kodluyoruz;

import java.util.Scanner;

public class kod6 {

	public static void main(String[] args) {
		// V�cut kitle  indexsi bulma
		
		double boy,kilo,vIndex;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("L�tfen boyunuzu giriniz : ");
		boy = scan.nextDouble();
		
		System.out.print("L�tfen kilonuzu giriniz : ");
		kilo = scan.nextDouble();
		
		vIndex = (kilo/(boy*boy));
		System.out.print("V�cut Kitle �ndewsiniz : " + vIndex);
		

	}

}
