package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.PessoaDao;
import br.com.fiap.entity.Pessoa;

public class PessoaDaoImpl extends GenericDaoImpl<Pessoa, Integer> implements PessoaDao {

	public PessoaDaoImpl(EntityManager em) {
		super(em);
	}
}