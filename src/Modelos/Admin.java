package Modelos;

public class Admin extends Empleado {

	public Admin() {
		super();
	}

	public Admin(String documento, String nombre, double sueldoHora) {
		super(documento, nombre, sueldoHora);
	}

	@Override
	public String toString() {
		return String.format("Admin [%s]", super.toString());
	}

}