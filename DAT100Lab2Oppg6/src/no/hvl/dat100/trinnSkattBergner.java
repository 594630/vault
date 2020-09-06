package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class trinnSkattBergner {

	public static void main(String[] args) {
		int inntekt = Integer.parseInt(showInputDialog("Inntekt?"));
		double trinnskatt = 0; //forutsetter 0 trinnskatt og dekker inntekter <= 180800
		
		if (inntekt > 180800 && inntekt >= 245500) {
			trinnskatt = inntekt * 0.019;
		}
		if (inntekt > 244500 && inntekt <= 639750) {
			trinnskatt = inntekt * 0.042;
		}
		if (inntekt > 639750 && inntekt <= 99550) {
			trinnskatt = inntekt * 0.132;
		}
		if (inntekt < 99550) {
			trinnskatt = inntekt * 0.162;
		}
		
		System.out.println("Trinnskatt = " + trinnskatt);
		

	}

}
