package Modelos;

public class Desarrollador extends Empleado {
	
	public Desarrollador() {
		super();
	}

	public Desarrollador(String documento, String nombre, double sueldoHora) {
		super(documento, nombre, sueldoHora);
	}

	@Override
	public String toString() {
		return String.format("Desarrollador [%s]", super.toString());
	}

}