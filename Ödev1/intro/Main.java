package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		System.out.println("basladik yine.");
		
		
		String ortaMetin = "Ilginizi cekebilir";
		String altMetin = "Vade suresi";
		
		System.out.println(ortaMetin);
	
		int vade = 12;
		double dolarDun = 18.25;
		double dolarBugun = 18.30;
		
		boolean dolarDustuMu = true;
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if(dolarBugun>dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		} else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		
		String[] krediler = {"Hizli kredi", "Maasini Halkbank'tan alanlar", "Mutlu Emekli"};
		
		for(int i = 0 ; i< krediler.length ; i++) {
			 System.out.println(krediler[i]);
		}
		
		}
	}
