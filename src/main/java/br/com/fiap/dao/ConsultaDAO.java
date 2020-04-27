package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Consulta;
import br.com.fiap.entity.Especialidade;

public class ConsultaDAO extends GenericDAO<Consulta, Integer> {

	public ConsultaDAO(EntityManager em) {
		super(em);
	}

	public List<Consulta> buscaPorEspecialidade(Especialidade esp) {
		return em.createQuery("from Consulta c where c.especialidade = :es", Consulta.class).setParameter("es", esp)
				.getResultList();
    }
	

}
