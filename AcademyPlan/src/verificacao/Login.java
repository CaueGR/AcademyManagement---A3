package verificacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    private Registro registro;
    
    public Login() {
    	
    }

    public Login(Registro registro) {
        this.registro = registro;
    }
    
    
    
    public boolean autenticar() {
        Scanner sc = new Scanner(System.in);
        int MAX_TENTATIVAS = 3;
        int tentativas = 0;

        while (tentativas < MAX_TENTATIVAS) {
            System.out.print("Digite o email: ");
            String email = sc.nextLine();

            System.out.print("Digite a senha: ");
            String senha = sc.nextLine();

            ArrayList<String> emails = registro.getEmails();
            ArrayList<String> senhas = registro.getSenhas();

            for (int i = 0; i < emails.size(); i++) {
                if (emails.get(i).equals(email) && senhas.get(i).equals(senha)) {
                    System.out.println("Login realizado com sucesso!");
                    return true;
                }
            }

            tentativas++;
            System.out.println("Email ou senha inválidos. Tentativa " + tentativas + " de " + MAX_TENTATIVAS);
        }

       
        System.out.println("Número máximo de tentativas atingido.");
        System.out.print("Deseja se cadastrar? (s/n): ");
        String opcao = sc.nextLine();

        if (opcao.equalsIgnoreCase("s")) {
            System.out.print("Digite novo email: ");
            String novoEmail = sc.nextLine();

            System.out.print("Digite nova senha: ");
            String novaSenha = sc.nextLine();
            
            registro.cadastrarUsuario(novoEmail, novaSenha);
        } else {
            System.out.println("Encerrando o programa.");
        }

        return false;
       
    }
}