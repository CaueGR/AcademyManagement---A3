package entities;

import java.time.LocalDate;

import Interfaces.GerenciamentoPlano;
import modelos.PlanoAcademia;

public class Adm extends Pessoa implements GerenciamentoPlano{

    private Integer numeroAcesso; // insira o número de acesso aqui
    private String senhaAdm; // insira sua senha de acesso aqui

    
    public boolean autenticacao(int numeroAcesso, String senhaAdm){
        if(numeroAcesso == this.numeroAcesso && senhaAdm.equals(this.senhaAdm)){
            return true;
        }else{
            System.out.println("Número de acesso ou senha inválidos");
            return false;
        }
    }
    

    public Adm(String name, LocalDate dataNascimento, Long telefone, Long cpf, Integer cep, Integer numeroAcesso,
            String senhaAdm) {
        super(name, dataNascimento, telefone, cpf, cep);
        this.numeroAcesso = numeroAcesso;
        this.senhaAdm = senhaAdm;
    }

    

    @Override
    public void criarPlanoAcademia() {
        
    
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