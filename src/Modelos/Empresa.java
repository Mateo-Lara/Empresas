package Modelos;

import java.util.ArrayList;

public abstract class Empresa {
	
	private String nit;
	private String nombre;
	private String direccion;
	private String ciudad;
	private ArrayList<Empleado> empleados;
	
	public Empresa() {
		nit = "";
		nombre = "";
		direccion = "";
		ciudad = "";
		empleados = new ArrayList<Empleado>();
	}
	
	public Empresa(String nit, String nombre, String direccion, String ciudad) {
		this.nit = nit;
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
		empleados = new ArrayList<Empleado>();
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public void asignarEmpleado(Empleado emp) {
		empleados.add(emp);
	}
	
	public int contarEmpleados() {
		return empleados.size();
	}

	@Override
	public String toString() {
		return String.format("nit=%s, nombre=%s, direccion=%s, ciudad=%s", nit, nombre, direccion, ciudad);
	}
	
}