package sistema.com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sistema.com.component.Component_Dependencia;

@SpringBootApplication
public class SistemaApplication implements CommandLineRunner {

	public Component_Dependencia component_Dependencia;
	
	
		
	
	public SistemaApplication(Component_Dependencia component_Dependencia) {
		
		this.component_Dependencia = component_Dependencia;
	}
	

	public static void main(String[] args) {
		SpringApplication.run(SistemaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//String nombre=component_Dependencia.leerNombre();
		//component_Dependencia.saludar(nombre);
		int a=component_Dependencia.leerNumeros();
		int b=component_Dependencia.leerNumeros();
		String resultado=component_Dependencia.visualizarResultado(component_Dependencia.suma(a ,b));
		
	}

}
