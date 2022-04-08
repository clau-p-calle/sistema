package sistema.com.component;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class Component_Implement implements Component_Dependencia{
 
	@Override
	public void saludar(String mensaje) {
		System.out.println("Hola"+ mensaje);
	}
   
	@Override
	public String leerNombre() {
		System.out.println("Porfavor ingrese su nombre:  ");
		Scanner leer=new Scanner(System.in);
		return leer.nextLine();
	}

	@Override
	public String suma(int a, int b) {
		// TODO Auto-generated method stub
		int resultado=a+b;
		
		return String.valueOf(resultado);
	}

	@Override
	public int leerNumeros() {
		// TODO Auto-generated method stub
		System.out.println("Porfavor ingrese una cantidad:  ");
		Scanner leer=new Scanner(System.in);
		return leer.nextInt();
		
		
	}

	@Override
	public String visualizarResultado(String resultado) {
		System.out.println("El resultado es"+" "+"="+" "+ resultado);
		return resultado;
	}

	
}
