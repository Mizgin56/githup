package Kodluyoruz;

import java.util.Scanner;

public class kod7 {

	public static void main(String[] args) {
		// Manav Kasa yapma
		
		double armut,elma,domates,muz,patl�can,toplamTutar;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("L�tfen ald���n�z armut kilosunu giriniz : ");
		armut = scan.nextDouble();
		
		System.out.print("L�tfen ald���n�zn elma kilosunu giriniz : ");
		elma = scan.nextDouble();
		
		System.out.print("L�tfen ald���n�zn domates kilosunu giriniz : ");
		domates = scan.nextDouble();
		
		System.out.print("L�tfen ald���n�zn muz kilosunu giriniz : ");
		muz = scan.nextDouble();
		
		System.out.print("L�tfen ald���n�zn patl�can kilosunu giriniz : ");
		patl�can = scan.nextDouble();
		
		toplamTutar = (armut*(2.14) + elma*(3.67) + domates*(1.11) + muz*(0.95) + patl�can*(5.00));
		
		System.out.print("Toplam Tutat : " + toplamTutar);
		
		
		

	}

}
