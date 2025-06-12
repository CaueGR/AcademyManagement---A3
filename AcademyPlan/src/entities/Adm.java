package entities;

import java.time.LocalDate;

public class Adm extends Pessoa{

    private Integer numeroAcesso;
    private String senhaAdm;
	
    public Adm(String name, LocalDate dataNascimento, Integer telefone, Integer cpf, Integer cep, int numeroAcesso,
			String senhaAdm) {
		super(name, dataNascimento, telefone, cpf, cep);
		this.numeroAcesso = numeroAcesso;
		this.senhaAdm = senhaAdm;
	}
    
    
    
    




    
}
