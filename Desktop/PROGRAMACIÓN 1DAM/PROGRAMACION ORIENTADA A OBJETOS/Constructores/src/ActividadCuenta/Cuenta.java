package ActividadCuenta;

public class Cuenta {
	//CREAMOS LOS ATRIBUTOS
	private int numero;
	private int dni;
	private int saldo;
	private int interes;
	//1. CONSTRUCTOR POR DEFECTO Y CONSTRUCTOR CON DNI
	public Cuenta() {
		
	}
	public Cuenta(int dni, int saldo, int interes) {
		this.dni = dni;
		this.saldo = saldo;
		this.interes = interes;
		
	}
	
}
