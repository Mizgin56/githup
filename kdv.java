package Kodluyoruz;

import java.util.Scanner;

public class kod2 {

	public static void main(String[] args) {
	// KDV tutarý hesaplama 
		
		double tutar , kdv = 0.18;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Ürün Tutarýný Giriniz :");
		tutar = scan.nextDouble();
		
		double kdvTutar = tutar * kdv;
		double kdvliTutar = kdvTutar + tutar ;
		
		System.out.println("Hesaplanan KDV Tutarý : " + kdvTutar);
		System.out.println("Hesaplanan KDV 'li Tutarý :" + kdvliTutar);

	}

}
