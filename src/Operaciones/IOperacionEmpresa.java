package Operaciones;

import Modelos.Empleado;

public interface IOperacionEmpresa {
	
	public void crearEmpresa();

	public void asignarEmpleado(Empleado emp);
	
	public void listarEmpresas();
	
	public void contarEmpleadosdeEmpresa();
}
