package testentidades;

import dao.ClassClienteImpl;
import model.TblCliente;

import java.util.List;

public class TestEntidadCliente {
	
	public static void main(String[] args){
		
		TblCliente cliente = new TblCliente();
		ClassClienteImpl crud = new ClassClienteImpl();
		
		// Test Registrar
		// asignamos valores
		/* 
		cliente.setNombre("nilson ronaldo");
		cliente.setApellido("ramirez ramirez");
		cliente.setDni("1045789");
		cliente.setEmail("nilson@gmail.com");
		cliente.setTelf("3871459");
		cliente.setSexo("M");
		cliente.setNacionalidad("argentina");
		
		// invocamos metodo main ...
		crud.RegistrarClientes(cliente);
		*/
		
		// Test Listado
        List<TblCliente> listado = crud.ListadoCliente();
        for (TblCliente lis : listado) {
            System.out.println("Nombre: " + lis.getNombre() +
                    ", Apellido: " + lis.getApellido() +
                    ", DNI: " + lis.getDni() +
                    ", Email: " + lis.getEmail() +
                    ", Teléfono: " + lis.getTelf() +
                    ", Sexo: " + lis.getSexo() +
                    ", Nacionalidad: " + lis.getNacionalidad());
        }
		
		
	} // fin del metodo

}
