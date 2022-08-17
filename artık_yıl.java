package Kodluyoruz;

import java.util.Scanner;

public class kod_16 {

	public static void main(String[] args) {
		// Artýk yýl hesaplama
		
		int yil;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen hesaplamak istediðiniz yýlý giriniz : ");
		yil = scan.nextInt();
		
		if(yil % 4 == 0 && yil % 100 != 0) {
			System.out.print( yil + " " +"Yýlý Artýk Yýldýr :) ");
		}else if(yil % 100 == 0 && yil % 400 == 0) {
			System.out.print(yil + " " +"Artýk Yýldýr :) ");
		}else {
			System.out.print(yil + " " +"Artýk Yýl Deðildir :( ");
		}
		
		
		
		
	}
	

}
