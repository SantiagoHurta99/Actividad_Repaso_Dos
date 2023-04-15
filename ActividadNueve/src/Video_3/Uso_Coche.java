package Video_3;

import javax.swing.JOptionPane;

public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche micoche=new Coche();
		micoche.estableceColor(JOptionPane.showInputDialog("Introduce color"));
		
		System.out.println(micoche.dime_datos_generales());
		System.out.println(micoche.dimeColor());
		
		micoche.configura_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
		System.out.println(micoche.dime_asientos());
		
		micoche.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
		System.out.println(micoche.dime_climatizador());
		
		System.out.println(micoche.dime_peso_coche());
	}

}
