package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Paciente;

public class PacienteDAO extends GenericDAO<Paciente,Integer> {

	public PacienteDAO(EntityManager em) {
		super(em);
	}
	
	public long contar() {
		return em.createQuery("select count(p) from Paciente p",Long.class).getSingleResult();
	}
	
	@Override
	public List<Paciente> listar(){
		return em.createQuery("select p from Paciente p", Paciente.class).getResultList();
	}
	
	public Paciente buscarPorEmail(String email) {
		return em.createQuery("from Paciente p where p.dsEmailPaciente= :e",Paciente.class)
				.setParameter("e", email).getSingleResult()	;
		
	}
	
	public List<Paciente> listarPorNome(){
		return em.createQuery("from Paciente p order by nomePaciente",Paciente.class).getResultList();
	}
	
	public List<Paciente> buscarPorNome(String nome){
		return em.createQuery("from Paciente p where p.nomePaciente like :nomePaciente ",Paciente.class)
				.setParameter("nomePaciente",nome).getResultList();
	}

}
