import java.util.Scanner;

public class SupervisorPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lec = new Scanner(System.in);
		String nombre, departamento ;
		float salario;
		System.out.print("Ingresa el nombre del supervisor");
		nombre = lec.nextLine();
		System.out.print("Ingresa el nombre del departamento asignado");
		departamento = lec.nextLine();
		System.out.print("Ingresa el salario del supervisor");
		salario = lec.nextFloat();
		supervisor spv1 = new supervisor(nombre, salario, departamento);
		System.out.println("Nombre\tSalario\tdepartamento");
		System.out.println(spv1.toString());
	}

}
