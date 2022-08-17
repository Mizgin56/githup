package Kodluyoruz;

import java.util.Scanner;

public class kod6 {

	public static void main(String[] args) {
		// Vücut kitle  indexsi bulma
		
		double boy,kilo,vIndex;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen boyunuzu giriniz : ");
		boy = scan.nextDouble();
		
		System.out.print("Lütfen kilonuzu giriniz : ");
		kilo = scan.nextDouble();
		
		vIndex = (kilo/(boy*boy));
		System.out.print("Vücut Kitle Ýndewsiniz : " + vIndex);
		

	}

}
