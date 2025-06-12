package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;
import verificacao.Registro;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("----------------------------------------");
        System.out.println("Olá, bem vindo! Já possui o cadastro? (S/N)");
        System.out.println("----------------------------------------");
        char possuiCadastro = sc.next().charAt(0);
        if(possuiCadastro == 'N' || possuiCadastro == 'n') {
        System.out.println("Sem problemas! Vamos fazer o cadastro, defina seu melhor acesso: ");
        System.out.println();
        System.out.println("Você é aluno ou adiministrador? (a/d) ");
        char alunoOUadm = sc.next().charAt(0);
        if(alunoOUadm == 'a') {
        	System.out.print("Nome: ");
        	String nome = sc.nextLine();
        	sc.next();

            System.out.print("Data de nascimento (dd/MM/yyyy): ");
            String dataString = sc.nextLine();
            sc.next();
            
            System.out.print("Telefone: ");
            Integer telefone = sc.nextInt();
            
            System.out.print("cpf: ");
            Integer cpf = sc.nextInt();
            
            System.out.print("cep");
            Integer cep = sc.nextInt();   
            
           // DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            //LocalDate dataNascimento = LocalDate.parse(dataString, formato);
            
          System.out.println("-------------------------------------");
          System.out.println();
          System.out.println("email: ");
          String email = sc.next();
          System.out.println("Senha: ");
          String senha = sc.next();
          System.out.println("Confrime a senha: ");
          String confrimaSenha = sc.next();
          System.out.println();
          System.out.println("-------------------------------------");

          Registro registro = new Registro();
          registro.cadastrarUsuario(email, senha);
          registro.confirmarSenha(confrimaSenha, senha);
        }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
			
		/* 
         
   
		
         // INFORMAÇÕES DO USUÁRIO (CLASSE PESSOA)

		System.out.println("nome: ");
		String nome = sc.nextLine();
		System.out.println("Grupo Muscular: ");
		String gM = sc.nextLine();
		System.out.println("Repetições: ");
		Integer r = sc.nextInt();
		System.out.println("Series: ");
		Integer s = sc.nextInt();
		Treino t = new Treino();
		Exercicio e = new Exercicio(nome, gM, r, s);


        System.out.println("Digite a opção desejada:\n1- Opção1");
		
		t.adicionarExercicio(e);
		
		t.listarExercicio();
		      */
		sc.close();

	}

}
