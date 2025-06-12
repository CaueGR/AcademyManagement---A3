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
	
	

