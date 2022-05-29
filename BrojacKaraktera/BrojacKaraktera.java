//Write a Java program to count the letters, spaces, numbers and other characters of an input string

//import java.util.Scanner;

public class BrojacKaraktera{

	public static void main(String[] args){
		Scanner s = new Scanner(System.in); // proglasenje skenera klase Scanner 

		System.out.println("Unesite neku recenicu:");

		String unetaRecenica = s.nextLine();
		
		izbroj(unetaRecenica);
	}
	
	public static void izbroj(String unos){
		

		
		char[] ch = unos.toCharArray(); // pretvaranje unosa u niz karaktera - omogucavanje prolaska kroz niz
		
		int slova = 0; // brojac slova
		int razmaci = 0; // brojac razmaka
		int cifre = 0; // brojac cifara
		int ostalo = 0; // brojac za ostalo

		for(int i = 0; i < unos.length(); i++){
			if(Character.isLetter(ch[i]))
				slova++;
			
			else if(Character.isSpaceChar(ch[i]))
				razmaci++;
			
			else if(Character.isDigit(ch[i]))
				cifre++;

			else ostalo++;
		}
		
		System.out.println("Vas unos je: " + unos);
		System.out.println("Broj slova: " + slova);
		System.out.println("Broj cifara: " + cifre);
		System.out.println("Broj razmaka: " + razmaci);
		System.out.println("Ostalo: " + ostalo);
	}
}