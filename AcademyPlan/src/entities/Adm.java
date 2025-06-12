package entities;

<<<<<<< HEAD
import java.time.LocalDate;
=======
import Interfaces.GerenciamentoPlano;

public class Adm implements GerenciamentoPlano{
>>>>>>> 4b35b3ce231cd06ad7c4f17346b32397aa3bf7a0

public class Adm extends Pessoa{

    private Integer numeroAcesso;
    private String senhaAdm;
	
    public Adm(String name, LocalDate dataNascimento, Integer telefone, Integer cpf, Integer cep, int numeroAcesso,
			String senhaAdm) {
		super(name, dataNascimento, telefone, cpf, cep);
		this.numeroAcesso = numeroAcesso;
		this.senhaAdm = senhaAdm;
	}
    
    
    
    

    

    @Override
    public void criarPlanoAcademia() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void criarPlanoAlimentar() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void editarPlanoAcademia() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void editarPlanoAlimentar() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void excluirPlanoAcademia() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void excluirPlanoAliementar() {
        // TODO Auto-generated method stub
        
    }


    
}
