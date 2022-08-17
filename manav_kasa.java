package Kodluyoruz;

import java.util.Scanner;

public class kod7 {

	public static void main(String[] args) {
		// Manav Kasa yapma
		
		double armut,elma,domates,muz,patlýcan,toplamTutar;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen aldýðýnýz armut kilosunu giriniz : ");
		armut = scan.nextDouble();
		
		System.out.print("Lütfen aldýðýnýzn elma kilosunu giriniz : ");
		elma = scan.nextDouble();
		
		System.out.print("Lütfen aldýðýnýzn domates kilosunu giriniz : ");
		domates = scan.nextDouble();
		
		System.out.print("Lütfen aldýðýnýzn muz kilosunu giriniz : ");
		muz = scan.nextDouble();
		
		System.out.print("Lütfen aldýðýnýzn patlýcan kilosunu giriniz : ");
		patlýcan = scan.nextDouble();
		
		toplamTutar = (armut*(2.14) + elma*(3.67) + domates*(1.11) + muz*(0.95) + patlýcan*(5.00));
		
		System.out.print("Toplam Tutat : " + toplamTutar);
		
		
		

	}

}
