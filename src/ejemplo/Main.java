package ejemplo;

import javax.swing.JOptionPane;
import java.time.LocalDate;

import tp1.CuentaBanco;

public class Main {

	public static void main(String[] args) {
		Trabajadores Franco = new Trabajadores("Franco_Russo",2003, 29042023);
		Trabajadores Diamela = new Trabajadores("Diamela_Aversano",2006, 29042023);
		Trabajadores Alex = new Trabajadores("Alex_Condoleo",2003, 500000);
		
		
		String año = JOptionPane.showInputDialog("Ingrese año de nacimiento");
		JOptionPane.showMessageDialog(null, "tu año es " +año);
		String mes = JOptionPane.showInputDialog("Ingrese mes de nacimiento");
		JOptionPane.showMessageDialog(null, "tu mes es: " +mes);
		String dia = JOptionPane.showInputDialog("Ingrese dia de nacimiento");
		JOptionPane.showMessageDialog(null, "tu dia es: " +dia);
		
		int añoNA = Integer.parseInt(año);
		int mesNA = Integer.parseInt(mes);
		int diaNA = Integer.parseInt(dia);
		
		
		LocalDate hoy = LocalDate.now();
		LocalDate nacimiento = LocalDate.of(añoNA, mesNA, diaNA); 
		
		String nombre = JOptionPane.showInputDialog("Ingrese Su nombre de la cuenta de la empresa");
		while (!nombre.equals(Franco.nombre)) {
			 nombre = JOptionPane.showInputDialog(" nombre incorrecto");
			 Franco = new Trabajadores(nombre, 2003, 29042023);
		}
		
		String opciones = JOptionPane.showInputDialog("ingrese que necesita = "
				+ "1. Saber años de antiguedad  "
				+ "2. Saber dias de vacaciones que dispondra  "
				+ "3. Calcular indemizacion en caso de despido  "
				+ "4. Pedir salario actualizado con los años e antiguedad");
		int menu_opciones = Integer.parseInt(opciones);
		switch (menu_opciones) {
		
		case 1:
			
		case 2:
		
		
		}
		
	}
}
