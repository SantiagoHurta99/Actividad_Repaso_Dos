package Video_2;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado[] misEmpleados=new Empleado[4];
		
//		misEmpleados[0]=new Empleado("Paco Gómez", 85000, 1990, 12, 17);
//		misEmpleados[1]=new Empleado("Ana López", 95000, 1995, 06, 02);
//		misEmpleados[2]=new Empleado("María Martín", 105000, 2002, 03, 15);
//		misEmpleados[3]=new Empleado("Antonio Fernández");
		misEmpleados[0]=new Empleado();
		misEmpleados[1]=new Empleado();
		misEmpleados[2]=new Empleado();
		misEmpleados[3]=new Empleado();
		
		for(Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		
		for(Empleado e: misEmpleados) {
			System.out.println("Nombre: " + e.dameNombre() 
					+ " Sueldo: " + e.dameSueldo()
					+ " Fecha de Alta: " + e.dameFechaContrato());
		}
	}

}

class Empleado {
	
//	public Empleado(String nom, double sue, int agno, int mes, int dia) {
//		nombre = nom;
//		sueldo = sue;
//		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
//		altaContrato=calendario.getTime();
//	}
//	
//	public Empleado(String nom) {
//		this(nom, 30000, 2000, 01, 01);
//	}
	
	public String dameNombre() { //getter
		return nombre;
	}
	
	public double dameSueldo() { //getter
		return sueldo;
	}
	
	public Date dameFechaContrato() { //getter
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) { //setter
		double aumento = sueldo * porcentaje/100;
		sueldo += aumento;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
}