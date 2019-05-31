package zarodevi;

import java.util.Scanner;
import java.util.Random;
import java.io.FileNotFoundException;

public class Zarodevi {

	public static void main(String[] args) {

		
		
	Scanner scan = new Scanner (System.in);
		System.out.println("Birinci oyuncunun adýný giriniz. ");
	String  a = scan.nextLine();
	System.out.println("Birinci oyuncu  "+ a);

	Scanner scan2 = new Scanner (System.in);
	System.out.println("Ýkinci oyuncunun adýný giriniz. ");
String  b = scan2.nextLine();
System.out.println("Ýkinci oyuncu  "+ a);

Scanner scan3 = new Scanner (System.in);
System.out.println("Kaç tur zar oyunu oynamak istersiniz ? ");

int c = scan.nextInt();

int sayi = 0 ;
int sayi2 = 0;


for(int  i= 0; i < c;  i++) {

Random Randomsayý = new Random();
int rastgelesayi;
rastgelesayi = Randomsayý.nextInt(6)+1;
System.out.println("Birinci oyuncunun attýðý zar sayýsý "+ rastgelesayi);

Random Randomsayý2 = new Random();
int rastgelesayi2;
rastgelesayi2 = Randomsayý2.nextInt(6)+1;
System.out.println("Ýkinci  oyuncunun attýðý zar sayýsý "+ rastgelesayi2);
	
if (rastgelesayi>rastgelesayi2)	
{
	System.out.println("Birinci oyuncu daha yüksek zar sayýsý attý Kazanan Birinci oyuncu ");

	sayi++;
}
	else if (rastgelesayi == rastgelesayi2)
{
	System.out.println(" Berabere ");
}else 
{
	System.out.println("Ýkinci oyuncu daha yüksek zar sayýsý attý kazanan ikinci oyuncu ");
sayi2++;
}

}

if (sayi>sayi2) {
System.out.println("Oyunu " + a + " oyuncusu kazandý. Kazandýðý tur sayýsý =" +" " + sayi + "\n" +  b + " Oyuncusunun kazandýðý tur sayýsý = " + sayi2 ); 


}
else if (sayi == sayi2)
{
System.out.print("Oyun berabere bitti.Kazanan yok.");
}
else 
{	
System.out.print("Oyunu " + b + " oyuncusu kazandý. Kazandýðý tur sayýsý ="+" " + sayi2+ "\n" +  a + " Oyuncusunun kazandýðý tur sayýsý = " + sayi );

}



	

	
	}

	
}

