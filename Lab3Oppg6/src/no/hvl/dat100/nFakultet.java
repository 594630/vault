package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class nFakultet {

	public static void main(String[] args) {
		int n = Integer.parseInt(showInputDialog("n = ")); //ber om verdien for n
		
		int fakultet = n;
		
		while(n >= 2) { //utf�r s� lenge n er st�rre eller lik 2
			n--; // (n-1), subtraksjonen i parantes gj�res f�r multiplikasjonen
			fakultet = fakultet * n; //n! = (n*(n-1)) 
		}
		System.out.println("n! = " + fakultet);
		

	}

}
