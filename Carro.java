package pruebaCar;

public class Carro {
String propietario;
String color;
String modelo;
float precio;
//Constructor
public Carro(){
	propietario = "Sin nombre";
	color= "Transparente";
	modelo = "xxxx";
	precio = 7.7f;
}
//metodos
public void encender(){
	System.out.println("Encendiendo...");
}//fin metodo encender
public void apagar(){
	System.out.println("Apagando...");
}//fin metodo apagar
public void acelerar(){
	System.out.println("Acelerando...");
}//fin metodo acelerar
public void detener(){
	System.out.println("Deteniendo...");
}//fin metodo detener
public String toString(){
	return propietario +""+color+""+modelo+""+precio;
}
}