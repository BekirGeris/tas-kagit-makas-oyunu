package JavaOdevler2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TasKagitMakasOyunu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Tanımlamalar yapilir
		System.out.println("Rock-Paper-Sicssors oyun için birini giriniz...");
		String girilenEl = input.next();
		String pcEl = "";
		int sayisalEl = 0;
		
		input.close();
		
		//Girilen elin ne oldugu belrlenir ve sayisal karsilik olusturulur.
		switch (girilenEl) {
		
		case "Rock", "rock", "R", "r":
			
			sayisalEl = 1;
		    girilenEl = "Rock";
			break;
			
		case "Paper", "paper", "P", "p":
			
			sayisalEl = 2;
			girilenEl = "Paper";
			break;
			
		case "Sicssors", "sicssors", "S", "s":
			
			sayisalEl = 3;
			girilenEl = "Sicssors";
			break;
			
		default:
			
			System.out.println("Hatalaı giris yaptınız...");
			System.exit(0);
			
		}
		
		//PC oyun icin secim yapar
		int key = ThreadLocalRandom.current().nextInt(1, 4);
		
		switch (key) {
		
		case 1:
			
			pcEl = "Rock";
			break;
			
		case 2:
			
			pcEl = "Paper";
			break;
			
		case 3:
			
			pcEl = "Sicssors";
			break;
			
		default:
			
			System.out.println("PC hatali sayi olusturuyor...");
			System.exit(0);
			
		}
		
		//Kazanan ve Kaybeden belirlenir.
		if(sayisalEl == key) {
			
			System.out.println(girilenEl + ", " + pcEl + " Berabere Tekrar Deneyiniz...");
			
		}else {
			
			if((sayisalEl == 1 && key == 3) 
			|| (sayisalEl == 3 && key == 2)
			|| (sayisalEl == 2 && key == 1)) {
				
				System.out.println(girilenEl + ", " + pcEl + "'i yener. Kazandınız...:)");
			
			}else {
				
				System.out.println(pcEl + ", " + girilenEl + "'i yener. Kaybettiniz...:(");
				
			}
		}
		
	}
}
