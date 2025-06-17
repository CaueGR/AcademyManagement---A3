package verificacao;

import java.util.ArrayList;

public class Registro {
	private ArrayList<String> emails = new ArrayList<>();
	private ArrayList<String> senhas = new ArrayList<>();

	public Registro() {
		emails = new ArrayList<>();
		senhas = new ArrayList<>();
	}

	    public ArrayList<String> getEmails() {
	        return emails;
	    }

	    public ArrayList<String> getSenhas() {
	        return senhas;
	    }
	    
	    
	    private boolean emailExiste(String email) {
	        return emails.contains(email);
	    }

		public void alterarEmail(String emailAtual, String novoEmail) {
    int index = emails.indexOf(emailAtual);

    if (index != -1) {
        if (!emailAtual.equals(novoEmail) && emailExiste(novoEmail)) {
            System.out.println("Novo e-mail já está em uso.");
        } else {
            emails.set(index, novoEmail);
            System.out.println("E-mail atualizado com sucesso!");
        }
    } else {
        System.out.println("E-mail atual não encontrado.");
    }
}

public void alterarSenha(String email, String novaSenha) {
    int index = emails.indexOf(email);
	
    if (index != -1) {
        senhas.set(index, novaSenha);
        System.out.println("Senha atualizada com sucesso!");
    } else {
        System.out.println("E-mail não encontrado.");
    }
}
	    
	    public void cadastrarUsuario(String email, String senha) {
			if (!emailExiste(email)) {
		            emails.add(email);
		            senhas.add(senha);
		            System.out.println("Usuário cadastrado com sucesso!");
		        } else {
		            System.out.println("Email já cadastrado.");
		        }
		    }
	    public void confirmarSenha(String senha, String confirmaSenha) {
	    	if(confirmaSenha.equals(senha)) {

	    	}else {
	    		System.out.println("As senhas devem ser iguais.");
	    	}
	    }
	}
	
	

