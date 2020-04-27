package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.PacienteDAO;
import br.com.fiap.entity.Paciente;

public class PacienteDAOTeste {
	
	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("especialidademedica-orm");
		EntityManager em = fabrica.createEntityManager();
		
		PacienteDAO dao = new PacienteDAO(em);
		
		System.out.println("Quantidade de pacientes: " +dao.contar());
		
		Paciente paciente = dao.buscarPorEmail("lucas@gmail.com");
		
	    System.out.println(paciente.getDsEmailPaciente()+ "  " + paciente.getNomePaciente());
		
		em.close();
		fabrica.close();
	}

}
