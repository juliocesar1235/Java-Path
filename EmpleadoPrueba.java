import java.util.Scanner;
public class EmpleadoPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lec = new Scanner(System.in);
		String nombre ;
		float salario;
		System.out.print("Ingresa el nombre del empleado");
		nombre = lec.nextLine();
		System.out.print("Ingresa el salario del empleado");
		salario = lec.nextFloat();
		Empleado emp1 = new Empleado(nombre, salario);
		System.out.println("Nombre\tSalario");
		System.out.println(emp1.toString());

	}

}
