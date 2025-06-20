package entities;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

	
	
	private String name;
	private LocalDate dataNascimento;
	private Long telefone;
	private Long cpf;
	private Integer cep;
	
	public Pessoa(String name, LocalDate dataNascimento, Long telefone, Long cpf, Integer cep) {
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

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
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
