import java.util.Scanner;
public class ClientePrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leer el teclado
		Scanner lec = new Scanner(System.in);
		//variables para los datos del teclado
		String nombre, apellido;
		double monto;
		System.out.print("Ingresa el nombre: ");
		nombre = lec.nextLine();
		System.out.print("Ingresa el apellido:");
		apellido = lec.nextLine();
		System.out.print("Ingresa deposito inicial: ");
		monto = lec.nextDouble();
		
		
		Cliente cliente1 = new Cliente(nombre, apellido);
		Cuenta cuenta1 = new Cuenta(monto);
		cliente1.setCuenta(cuenta1);
		
		System.out.println("Nombre: " +cliente1.getNombre());
		System.out.println("Apellido: " +cliente1.getApellido());
		System.out.println("Su saldo es: " +cliente1.getCuenta().getSaldo());
		
		System.out.println("Ingreso monto a depositar: ");
		monto = lec.nextDouble();
		if(cliente1.getCuenta().depositar(monto)){
			System.out.println("Deposito Realizado!!!!!");
		}
		
		System.out.print("Ingresa la cantidad a retirar: ");
		monto = lec.nextDouble();
		
		if(cliente1.getCuenta().retirar(monto)){
			System.out.println("Transaccion exitosa");
		}else{
			System.out.println("Fondos insuficientes");
		}
		
		System.out.println("Nombre\tApellido\tSaldo");
		System.out.println(cliente1.toString());
		
	}
	

}
