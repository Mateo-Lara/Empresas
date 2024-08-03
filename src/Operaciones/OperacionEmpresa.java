package Operaciones;
import Modelos.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OperacionEmpresa implements IOperacionEmpresa {
	
	private ArrayList<Empresa> empresas = new ArrayList<Empresa>();

	@Override
	public void crearEmpresa() {
		String nit = JOptionPane.showInputDialog(null, "NIT:", "Crear Empresa", 3);
		String nombre = JOptionPane.showInputDialog(null, "Nombre:", "Crear Empresa", 3);
		String direc = JOptionPane.showInputDialog(null, "Direccion:", "Crear Empresa", 3);
		String ciudad = JOptionPane.showInputDialog(null, "Ciudad:", "Crear Empresa", 3);
		
		empresas.add(new EmpresaDesarrollo(nit, nombre, direc, ciudad));
		
	}

	@Override
	public void asignarEmpleado(Empleado emp) {
		String nit = JOptionPane.showInputDialog(null, "Indique NIT de la empresa:", "Asignar Empleado", 3);
		//Buscamos empresa
		Empresa buscar = null;
		for (Empresa empre: empresas)
			if (empre.getNit().equals(nit))
				buscar = empre;
		//Comprobamos
		if (buscar == null)
			JOptionPane.showMessageDialog(null, "No hay empresas con ese NIT", "Asignar Empleado", 0, null);
		else {
			buscar.asignarEmpleado(emp);
			JOptionPane.showMessageDialog(null, "Empleado asignado", "Asignar Empleado", 1, null);
		}
	}

	@Override
	public void listarEmpresas() {
		JOptionPane.showMessageDialog(null, "Se mostrará un listado en la consola", "Listar Empresas", 1, null);
		System.out.println("\n\t\tLISTA EMPRESAS");
		System.out.println("\t\t----- --------\n");
		for (Empresa empre: empresas)
			System.out.println(empre);
	}

	@Override
	public void contarEmpleadosdeEmpresa() {
		String nit = JOptionPane.showInputDialog(null, "Indique NIT de la empresa:", "Contar Empleados", 3);
		//Buscamos empresa
		Empresa buscar = null;
		for (Empresa empre: empresas)
			if (empre.getNit().equals(nit))
				buscar = empre;
		//Comprobamos
		if (buscar == null)
			JOptionPane.showMessageDialog(null, "No hay empresas con ese NIT", "Contar Empleados", 0, null);
		else
			JOptionPane.showMessageDialog(null,
				String.format("Empleados contados: %d", buscar.contarEmpleados()), "Contar Empleados", 1, null);	
	}

}
