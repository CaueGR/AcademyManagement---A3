package verificacao;

import java.util.ArrayList;

public class Login {
    private Registro registro;

    public Login(Registro registro) {
        this.registro = registro;
    }

    public boolean autenticar(String email, String senha) {
        ArrayList<String> emails = registro.getEmails();
        ArrayList<String> senhas = registro.getSenhas();

        for (int i = 0; i < emails.size(); i++) {
            if (emails.get(i).equals(email) && senhas.get(i).equals(senha)) {
                System.out.println("Login realizado com sucesso!");
                return true;
            }
        }
        System.out.println("Email ou senha inválidos.");
        return false;
    }
}