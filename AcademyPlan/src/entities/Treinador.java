package entities;

import java.time.LocalDate;

import Interfaces.GerenciamentoPlano;

public class Treinador extends Pessoa implements GerenciamentoPlano {

    private String especializacao;
    private String disponibilidade;


    public Treinador(String name, LocalDate dataNascimento, Integer telefone, Integer cpf, Integer cep,
            String especializacao, String disponibilidade) {
        super(name, dataNascimento, telefone, cpf, cep);
        this.especializacao = especializacao;
        this.disponibilidade = disponibilidade;
    }

    

    public String getEspecializacao() {
        return especializacao;
    }



    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }



    public String getDisponibilidade() {
        return disponibilidade;
    }



    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
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
