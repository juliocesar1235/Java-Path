import java.util.Scanner;
public class CuentaPrueba {

	public static void main(String[] args) {
		Scanner lec = new Scanner(System.in);
		double monto;
		System.out.print("Ingreso deposito inicial:");
		monto = lec.nextDouble();
		// TODO Auto-generated method stub
		Cuenta miCuenta = new Cuenta(monto);
		System.out.println("Saldo:"+ miCuenta.getSaldo());
		System.out.println("Ingreso monto a depositar: ");
		monto = lec.nextDouble();
		if(miCuenta.depositar(monto)){
			System.out.println("Deposito Realizado");
		}
		System.out.println("Saldo:"+ miCuenta.getSaldo());
		System.out.println("Ingreso monto a retirar: ");
		monto = lec.nextDouble();
		if(miCuenta.retirar(monto)){
			System.out.println("Transaccion Exitosa");
			
		}else{
			System.out.println("Saldo insuficiente");
		}
		System.out.println("Saldo:"+ miCuenta.getSaldo());
	}
}
