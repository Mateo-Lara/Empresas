package Modelos;

public class GestorProyectos extends Empleado {

	private String area;

	public GestorProyectos() {
		super();
		area = "";
	}

	public GestorProyectos(String documento, String nombre, double sueldoHora, String area) {
		super(documento, nombre, sueldoHora);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return String.format("GestorProyectos [%s, area=%s]", super.toString(), area);
	}
	
}
