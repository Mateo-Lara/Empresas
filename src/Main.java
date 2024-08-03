import Modelos.Empleado;
import Operaciones.*;
import javax.swing.JOptionPane;

public class Main {
	
	private static OperacionEmpleado empleados = new OperacionEmpleado();
	private static OperacionEmpresa empresas = new OperacionEmpresa();

	public static void main(String[] args) {
		int op = 0;
        String menu = "Bienvenido, por favor ingrese la información que necesite: \n";
        menu += "1. Ingresar Empresa: \n";
        menu += "2. Ingresar datos del Empleado\n";
        menu += "3. Consular información del Empleado: \n";
        menu += "4. Consultar todas las empresas: \n";
        menu += "5. Consultar todos los empleados: \n";
        menu += "6. Calcular sueldo de empleado: \n";
        menu += "7. Cantidad de empleados en la empresa: \n";
        menu += "8. Salir \n";
        menu += "Selecciona una de las opciones del menú \n";
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op) {
                case 1:
                	empresas.crearEmpresa();
                    break;
                case 2:
                	//Creamos empleado y lo recogemos
                	Empleado emp = empleados.crearEmpleado();
                	//Y ahora lo asignaremos a una empresa
                	empresas.asignarEmpleado(emp);
                    break;
                case 3:
                	empleados.consultarEmpleado();
                    break;
                case 4:
                	empresas.listarEmpresas();
                    break;
                case 5:
                	empleados.listarEmpleados();
                    break;
                case 6:
                	empleados.calcularSueldoEmpleado();
                    break;
                case 7:
                	empresas.contarEmpleadosdeEmpresa();
            }
        } while (op != 8);
    }

}