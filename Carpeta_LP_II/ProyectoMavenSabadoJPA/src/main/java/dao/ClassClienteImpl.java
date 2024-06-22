package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.ICliente;
import model.TblCliente;

public class ClassClienteImpl implements ICliente{

	@Override
	public void RegistrarClientes(TblCliente cliente) {
		// Establecer la conexión con la unidad de persistencia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoMavenSabadoJPA");

        // Gestionar entidades
        EntityManager em = emf.createEntityManager();

        // Iniciar transacción
        em.getTransaction().begin();

        // Registramos
        em.persist(cliente);

        // Confirmamos
        em.getTransaction().commit();

        // Cerramos
        em.close();
        emf.close();
	} // Fin metodo registrar

	@Override
	public void ActualizarCliente(TblCliente cliente) {
		// Establecer la conexión con la unidad de persistencia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoMavenSabadoJPA");

        // Gestionar entidades
        EntityManager em = emf.createEntityManager();
        
        // Iniciar transacción
        em.getTransaction().begin();
        
        // actualizamos
	    em.merge(cliente);
        
        // Confirmamos
        em.getTransaction().commit();

        // Cerramos
        em.close();
        emf.close();
	} // Fin metodo actualizar

	@Override
	public void EliminarCliente(TblCliente cliente) {
		// Establecer la conexión con la unidad de persistencia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoMavenSabadoJPA");

        // Gestionar entidades
        EntityManager em = emf.createEntityManager();
        
        // Iniciar transacción
        em.getTransaction().begin();
        
        // eliminar por medio de cod
        TblCliente elim=em.merge(cliente);
        
        // eliminar el registro
        em.remove(elim);
        
        // mensaje
        System.out.println("Cliente eliminado de la base de datos");
        
        // Confirmamos
        em.getTransaction().commit();

        // Cerramos
        em.close();
        emf.close();
	} // Fin metodo eliminar

	@Override
	public TblCliente BuscarCliente(TblCliente cliente) {
		// Establecer la conexión con la unidad de persistencia
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoMavenSabadoJPA");

        // Gestionar entidades
        EntityManager em = emf.createEntityManager();
        
        // Iniciar transacción
        em.getTransaction().begin();
        
        // recuperamos el codigo a buscar
        TblCliente buscliente = em.find(TblCliente.class,cliente.getIdcliente());
        
         // Confirmamos
        em.getTransaction().commit();

        // Cerramos
        em.close();
        emf.close();
        
        return buscliente;
	} // Fin metodo buscar

	@Override
	public List<TblCliente> ListadoCliente() {
		// Establecer la conexión con la unidad de persistencia
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoMavenSabadoJPA");

		// Gestionar entidades
		EntityManager em = emf.createEntityManager();
		        
		// Iniciar transacción
		em.getTransaction().begin();
		
		// recuperamos los clientes de la base de datos
		// utilizamos jpql
		List<TblCliente> Listadoclientes = em.createQuery("SELECT c FROM TblCliente c", TblCliente.class).getResultList();
	        
		// Confirmamos
		em.getTransaction().commit();

		// Cerramos
		em.close();
		emf.close();
		
		return Listadoclientes;
		        
	} // Fin metodo listar
}
