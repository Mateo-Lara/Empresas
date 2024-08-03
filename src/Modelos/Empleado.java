package Modelos;

public abstract class Empleado {
	
	private String documento;
	private String nombre;
	private double sueldoHora;
	
	public Empleado() {
		documento = "";
		nombre = "";
		sueldoHora = 0d;
	}
	
	public Empleado(String documento, String nombre, double sueldoHora) {
		this.documento = documento;
		this.nombre = nombre;
		this.sueldoHora = sueldoHora;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoHora() {
		return sueldoHora;
	}

	public void setSueldoHora(double sueldoHora) {
		this.sueldoHora = sueldoHora;
	}

	@Override
	public String toString() {
		return String.format("documento=%s, nombre=%s, sueldoHora=%s", documento, nombre, sueldoHora);
	}

}
