package Kodluyoruz;

import java.util.Scanner;

public class kod2 {

	public static void main(String[] args) {
	// KDV tutar� hesaplama 
		
		double tutar , kdv = 0.18;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen �r�n Tutar�n� Giriniz :");
		tutar = scan.nextDouble();
		
		double kdvTutar = tutar * kdv;
		double kdvliTutar = kdvTutar + tutar ;
		
		System.out.println("Hesaplanan KDV Tutar� : " + kdvTutar);
		System.out.println("Hesaplanan KDV 'li Tutar� :" + kdvliTutar);

	}

}
