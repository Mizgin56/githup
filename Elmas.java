package Kodluyoruz;

import java.util.Scanner;

public class Elmas {

	public static void main(String[] args) {
		// Elmas yapma
		
		int sayi;

        Scanner input = new Scanner(System.in);

        System.out.print("L�tfen elmas say�s�n� giriniz : ");
        sayi = input.nextInt();

        for (int i = 1; i < sayi; i ++) {

            for (int j = 1; j <= (sayi-i); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("/");
            }

            System.out.println(" ");
        }

        for (int i = 1; i <= sayi; i++) {

            for(int j = 1; j <= i - 1 ; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * sayi - (2 * i - 1)); k++) {
                System.out.print("/");
            }

            System.out.println(" ");
        }

	}

}
