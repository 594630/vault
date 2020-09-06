package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class karakterBeregner {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) { //programmet stoppes når det har skrevet ut ti verdier
			
			int poeng = Integer.parseInt(showInputDialog("Poengsum: "));
			String karakter = "F"; //programmet forutsetter karakteren F, som består dersom den ikke erstattes av noe bedre
		
			if (poeng < 0 || poeng > 100) { //sjekker om poengsummen er gyldig
			poeng = Integer.parseInt(showInputDialog("Ugyldig poengsum prøv igjen: ")); //skriver ut feilmelding og ber om ny poengverdi
			} else //kjøres så lenge poengverdien er gyldig

				if (poeng >= 90) {
					karakter = "A";
				}
				if (poeng <= 89 && poeng >= 80) {
					karakter = "B";
				}
				if (poeng <= 79 && poeng >= 60) {
					karakter = "C";
				}
				if (poeng <= 59 && poeng >= 50) {
					karakter = "D";
				}
				if (poeng <= 49 && poeng >= 40) {
					karakter = "E";
				}
				System.out.println(karakter);
				
		}
		
	}

}
