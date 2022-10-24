package lp2a4.app;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import lp2a4.modelo.Estudante;

public class Aplicacao {

	public static void main(String[] args) {
		Estudante estudante = new Estudante();
		estudante.setMatricula("SP12345");
		estudante.setNome("José João da Silva");
		estudante.setEmail("jjsilva@ifsp.edu.br");
		estudante.setEndereco("Rua Pedro Vicente, 15, São Paulo");
		estudante.setDataIngresso(LocalDate.of(2022, 01, 01));
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(estudante);
		em.getTransaction().commit();
		
		Estudante found = em.find(Estudante.class, "SP12345");
		
		System.out.println("Registro criado: " + found);
		
		found.setEndereco("Avenida Cruzeiro do Sul, 10, São Paulo");
		
		em.getTransaction().begin();
		em.persist(found);
		em.getTransaction().commit();
		
		System.out.println("Registro atualizado: " + found);
		
		em.close();
		emf.close();
	}

}
