package br.com.fiap.view;

import javax.persistence.EntityManager;

import br.com.fiap.dao.PessoaDao;
import br.com.fiap.dao.impl.PessoaDaoImpl;
import br.com.fiap.entity.Pessoa;
import br.com.fiap.entity.PessoaFisica;
import br.com.fiap.entity.PessoaJuridica;
import br.com.fiap.exception.CommitException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Teste {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		PessoaDao pessoaDao = new PessoaDaoImpl(em);
		
		Pessoa pessoa = new Pessoa("Lalala", "Rua das Treze");
		
		PessoaFisica pessoaFisica = new PessoaFisica("Daniel", "Rua das Onze", "0193232031", "23234122");
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica("GFT", "Rua das Doze", "03012812000124", "124245314145");
		
		try {
			pessoaDao.create(pessoa);
			pessoaDao.create(pessoaFisica);
			pessoaDao.create(pessoaJuridica);			
			pessoaDao.commit();
			System.out.println("Sucesso!");
		} catch (CommitException e) {
			System.out.println(e.getMessage());
		}
		
		em.close();
		EntityManagerFactorySingleton.getInstance().close();
	}
}
