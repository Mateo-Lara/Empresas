package Operaciones;

import Modelos.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OperacionEmpleado implements IOperacionEmpleado {
	
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	
	@Override
	public Empleado crearEmpleado() {
		//Preguntamos que tipo empleado se va a crear
		int tipo = JOptionPane.showOptionDialog(null, "Elija tipo de Empleado quiere crear",
				"Crear Empleado", 0, 3, null,
				new String[] {"Admin", "Desarrollador", "Gestor Proyectos"}, null);
		//Pedimos datos del empleado
		String documento = JOptionPane.showInputDialog(null, "Documento:", "Crear Empleado", 3);
		String nombre = JOptionPane.showInputDialog(null, "Nombre:", "Crear Empleado", 3);
		double sueldoHora = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Sueldo x Hora:", "Crear Empleado", 3));
		//Comprobamos elección para determinar que empleado hay que crear
		switch(tipo) {
		case 0: //Admin
			Admin admin = new Admin(documento, nombre, sueldoHora);
			empleados.add(admin);
			return admin;
		case 1: //Desarrollador
			Desarrollador desarr = new Desarrollador(documento, nombre, sueldoHora);
			empleados.add(desarr);
			return desarr;
		case 2: //Gestor de proyectos, requiere pedir otro dato
			String area = JOptionPane.showInputDialog(null, "Area:", "Crear Empleado", 3);
			GestorProyectos gesPro = new GestorProyectos(documento, nombre, sueldoHora, area);
			empleados.add(gesPro);
			return gesPro;
		default:
			return null;
		}
	}

	@Override
	public void listarEmpleados() {
		JOptionPane.showMessageDialog(null, "Se mostrará un listado en la consola",
				"Listar Empleados", 1);
		System.out.println("\n\t\tLISTA EMPLEADOS");
		System.out.println("\t\t----- ---------\n");
		for (Empleado emp: empleados)
			System.out.println(emp);
	}

	@Override
	public void consultarEmpleado() {
		String documento = JOptionPane.showInputDialog(null, "Documento del empleado:", "Consultar Empleado", 3);
		//Buscamos el empleado
		Empleado buscar = null;
		for (Empleado emp: empleados)
			if (emp.getDocumento().equals(documento))
				buscar = emp;
		//Comprobamos si lo hemos encontrado
		if (buscar == null)
			JOptionPane.showMessageDialog(null, "No hay ningún empleado con ese documento",
					"Consultar Empleado", 0);
		else
			JOptionPane.showMessageDialog(null, buscar,
					"Listar Empleados", 1);
	}

	@Override
	public void calcularSueldoEmpleado() {
		String documento = JOptionPane.showInputDialog(null, "Documento del empleado:", "Calcular Sueldo", 3);
		int horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Horas trabajadas:", "Calcular Sueldo", 3));
		//Buscamos empleado
		Empleado buscar = null;
		for (Empleado emp: empleados)
			if (emp.getDocumento().equals(documento))
				buscar = emp;
		//Comprobamos si lo hemos encontrado
		if (buscar == null)
			JOptionPane.showMessageDialog(null, "No hay ningún empleado con ese documento",
					"Calcular Sueldo", 0);
		else {
			double calculo = buscar.getSueldoHora() * horas;
			JOptionPane.showMessageDialog(null,String.format("Sueldo: %.2f", calculo),
					"Calcular Sueldo", 1);
		}
	}

}