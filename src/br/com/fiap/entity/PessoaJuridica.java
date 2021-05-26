package br.com.fiap.entity;

import javax.persistence.Column;
//import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

//@DiscriminatorValue("PJ")

@PrimaryKeyJoinColumn(name = "cd_pj")

@Entity
@Table(name = "TB_PESSOA_JURIDICA")
public class PessoaJuridica extends Pessoa{

	@Column(name = "nr_cnpj", length = 30)
	private String cnpj;
	
	@Column(name = "nr_inscricao_estadual", length = 30)
	private String inscricaoEstadual;

	public PessoaJuridica() {
	}

	public PessoaJuridica(String nome, String endereco, String cnpj, String inscricaoEstadual) {
		super(nome, endereco);
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
}