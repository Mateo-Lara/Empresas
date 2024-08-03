package Operaciones;
import Modelos.Empleado;

public interface IOperacionEmpleado {
	
	public Empleado crearEmpleado();
	
	public void listarEmpleados();
	
	public void consultarEmpleado();
	
	public void calcularSueldoEmpleado();

}