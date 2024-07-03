package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.IUsuario;
import model.TblUsuariocl3;

public class ClassUsuarioImp implements IUsuario{

	public void RegistrarUsuario(TblUsuariocl3 usuario) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL3_CISNEROSBAUTISTA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(usuario);
		System.out.println("Usuario registrado correctamente");
		em.getTransaction().commit();
		em.close();
	}

	public List<TblUsuariocl3> ListarUsuario() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL3_CISNEROSBAUTISTA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		List<TblUsuariocl3> listado = em.createQuery("SELECT u FROM TblUsuariocl3 u",TblUsuariocl3.class).getResultList();
		em.getTransaction().commit();
		em.close();
		return listado;
	}

}
