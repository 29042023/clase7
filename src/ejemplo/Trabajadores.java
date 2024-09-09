package ejemplo;

public class Trabajadores {
	String nombre;
	double año;
	double mes;
	double dia;
	double saldo;
	
	public Trabajadores(String nombre, double experiencia, double saldo) {
		this.nombre = nombre;
		this.año = experiencia;
		this.saldo = saldo;
		
	}
		
	public Trabajadores(String nombre, double experiencia) {
		this.nombre = nombre;
		this.año = experiencia;
	
	}
	
	public Trabajadores(String nombre) {
		this.nombre = nombre;
	}
	
	
}
