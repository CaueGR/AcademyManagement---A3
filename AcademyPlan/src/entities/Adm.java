package entities;

import Interfaces.GerenciamentoPlano;

public class Adm implements GerenciamentoPlano{

    private String nome;
    private Integer numeroAcesso;
    private String senhaAdm; 

    
    public boolean autenticacao(int numeroAcesso, String senhaAdm){
        if(numeroAcesso == this.numeroAcesso && senhaAdm.equals(this.senhaAdm)){
            return true;
        }else{
            System.out.println("Número de acesso ou senha inválidos");
            return false;
        }
    }
    

    public Adm() {
    	
    }


    public Adm(String name, Integer numeroAcesso, String senhaAdm) {
        this.nome = name;
        this.numeroAcesso = numeroAcesso;
        this.senhaAdm = senhaAdm;
    }	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumeroAcesso() {
		return numeroAcesso;
	}

	public void setNumeroAcesso(Integer numeroAcesso) {
		this.numeroAcesso = numeroAcesso;
	}

	public String getSenhaAdm() {
		return senhaAdm;
	}

	public void setSenhaAdm(String senhaAdm) {
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

	
    
    public void exibeMenu() {
        System.out.println("\n================= MENU PRINCIPAL =================");
        System.out.println("|                                                |");
        System.out.println("|  1 - 📅 Cadastrar treinador                    |");
        System.out.println("|  2 - 🏋️ Visualizar lista de alunos             |");
        System.out.println("|  3 - 📋 Editar planos                          |");
        System.out.println("|  4 - ❌ Sair                                   |");
        System.out.println("|________________________________________________|");
        System.out.print("Escolha uma opção: ");
    }
}