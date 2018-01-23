import java.util.Scanner;

public class GerentePrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lec = new Scanner(System.in);
		String nombre, departamento ;
		float salario, bono;
		System.out.print("Ingresa el nombre del Gerente");
		nombre = lec.nextLine();
		System.out.print("Ingresa el nombre del departamento asignado");
		departamento = lec.nextLine();
		System.out.print("Ingresa el salario del Gerente");
		salario = lec.nextFloat();
		
		System.out.print("Ingresa el bono del gerente");
		bono = lec.nextFloat();
		Gerente gte1 = new Gerente(nombre, salario, departamento, bono);
		System.out.println("Nombre\tSalario\tdepartamento\tbono");
		System.out.println(gte1.toString());
	}

}
