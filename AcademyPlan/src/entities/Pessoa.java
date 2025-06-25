package entities;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

	
	
	protected String name;
	private LocalDate dataNascimento;
	protected long telefone;
	private long cpf;
	protected Integer cep;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String name, LocalDate dataNascimento, long telefone, long cpf, Integer cep) {
		this.name = name;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.cpf = cpf;
		this.cep = cep;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public int calcularIdade() {
		LocalDate hoje = LocalDate.now();
		if(dataNascimento != null) {
		 return Period.between(dataNascimento, hoje).getYears();
		}else {
			throw new IllegalArgumentException("Insira uma data válida!");
		}
	}

	
	
	

}