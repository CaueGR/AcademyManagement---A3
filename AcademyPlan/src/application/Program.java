package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;
import entities.Adm;
import verificacao.Registro;
import verificacao.Login;
import modelos.PlanoAcademia;
import modelos.PlanoAlimentar;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Olá, seja bem vindo! Você é aluno ou adiministrador? (a/d) ");
        char alunoOUadm = sc.next().charAt(0);


        System.out.println("----------------------------------------");
        System.out.println("Já possui o cadastro? (S/N)");
        
        System.out.println("----------------------------------------");
        char possuiCadastro = sc.next().charAt(0);
        
        if(possuiCadastro == 'N' || possuiCadastro == 'n') {
        System.out.println("Sem problemas! Vamos fazer o cadastro, defina seu melhor acesso: ");

        }

        /*else if(possuiCadastro == 'S' || possuiCadastro == 's') {
            System.out.println("Certo! Vamos fazer login, qual seu acesso?");
        }*/


        //INTERFACE DO ALUNO
        
        if(alunoOUadm == 'a' || possuiCadastro == 'N' || possuiCadastro == 'n') {
        	System.out.print("Nome: ");
        	sc.nextLine();
        	String nome = sc.nextLine();
        	
        	
        	System.out.print("Data de nascimento (dd/MM/yyyy): ");
        	String dataString = sc.nextLine();

        	System.out.print("Telefone: ");
        	Long telefone = sc.nextLong();
        	sc.nextLine(); // limpa o \n deixado pelo nextInt()

        	System.out.print("CPF: ");
        	Long cpf = sc.nextLong();
        	sc.nextLine(); // limpa o \n

        	System.out.print("CEP: ");
        	Integer cep = sc.nextInt();
        	sc.nextLine(); // limpa o \n

        	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        	LocalDate dataNascimento = LocalDate.parse(dataString, formato);

           Aluno aluno = new Aluno(nome,dataNascimento, telefone, cpf, cep); 
            
          System.out.println("-------------------------------------");
          System.out.println();
          System.out.println("email: ");
          String email = sc.next();
          sc.nextLine(); // limpa o \n
          System.out.println("Senha: ");
          String senha = sc.next();
          System.out.println("Confrime a senha: ");
          String confirmaSenha = sc.next();
          System.out.println();
          System.out.println("-------------------------------------");

          Registro registro = new Registro();
          registro.cadastrarUsuario(email, senha);
          registro.confirmarSenha(confirmaSenha, senha);

          System.out.println("Cadastro concluído!, Realize o login: ");
        }
         Registro registro = new Registro();
         Aluno aluno = new Aluno(null, null, null, null, null);

          boolean valido = false;
          while (!valido) {
            
          
          
          System.out.println("-------------------------------------");
          sc.nextLine(); // limpa o \n

          System.out.println("Email: ");
          String emailAcesso = sc.nextLine();

          sc.nextLine(); // limpa o \n
          System.out.println("Senha: ");
          String senhaAcesso = sc.nextLine();
          
          System.out.println("-------------------------------------");

          
          Login login = new Login(registro);

          if(login.autenticar(emailAcesso, senhaAcesso)){
            int opcaoPrincipal = 0;
            while(opcaoPrincipal != 7){

            System.out.printf("Bem vindo %s! O que deseja fazer?" , aluno.getName());

            System.out.println("\n1- Agendar consulta com treinador");
            System.out.println("2- Agendar treino");
            System.out.println("3- Visualizar plano de treino");
            System.out.println("4- Verificar Planos Academia");
            System.out.println("5- Acessar dados pessoais");
            System.out.println("6- Visualizar plano alimentar");
            System.out.println("7- Sair");
            opcaoPrincipal = sc.nextInt();
            sc.nextLine(); // limpa o \n


            switch (opcaoPrincipal) {
                case 1:
                    System.out.println("Para quando deseja agendar sua consultada com o treinador?(dd/MM/yyyy) ");
                    String dataConsultaTreinador = sc.nextLine();

                    DateTimeFormatter formatoConsultaTreinador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate consultaTreinador = LocalDate.parse(dataConsultaTreinador, formatoConsultaTreinador);

                    System.out.println("Para qual horário gostaria de agendar? ");
                    String horarioConsulta = sc.nextLine();

                    System.out.println("Agendamento concluído!");
                    break;
                case 2:  
                    System.out.println("Para quando deseja agendar seu treino? (dd/MM/yyyy) ");
                    String dataTreino = sc.nextLine();

                    DateTimeFormatter formatoAgendamentoTreino = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate dataAgendamentoTreino = LocalDate.parse(dataTreino, formatoAgendamentoTreino);

                    System.out.println("Para qual horário gostaria de agendar seu treino? ");
                    String horarioTreino = sc.nextLine();

                    System.out.println("Agendamento concluído!");
                    break;
                case 3:
                System.out.println("Você ainda não possui treino!");
                System.out.println("Deseja um treino completo? (s/n)");
                char treinoCompleto = sc.next().charAt(0);
                 if(treinoCompleto == 'S' || treinoCompleto == 's'){
                    System.out.println("Seu treino completo fica da seguinte maneira: ");
                    System.out.println("1. 3 x Voador -  Repetições: 15\r\n" + //
                                                "2. 4 x Supino-  Repetições: 12\r\n" + //
                                                "3. 3 x Remada-  Repetições: 15\r\n" + //
                                                "4. 4 x Puxada Fechada Supinada-  Repetições: 12\r\n" + //
                                                "5. 4 x Desenvolvimento -  Repetições: 15\r\n" + //
                                                "6. 4 x Encolhimento-  Repetições: 12\r\n" + //
                                                "7. 3 x LegPress-  Repetições: 15\r\n" + //
                                                "8. 4 x Agachamento Hack-  Repetições: 12\r\n" + //
                                                "9. 4 x Rosca Direta Barra-  Repetições: 15\r\n" + //
                                                "10. 4 x Abdominal-  Repetições: 30\r\n" + //
                                                "");
                 }else if(treinoCompleto == 'N' || treinoCompleto == 'n'){
                    System.out.println("Qual treino específico deseja?\n1- Costas\n2- Peito\n3- Membros Superiores\n4- Pernas\n5- Ombros\n6- Abdômen");
                    int opcaoTreino = sc.nextInt();
                    
                    switch(opcaoTreino){
                        case 1: 
                        System.out.println("Puxada alta pegada aberta (barra ou frente) – Repetições: 4x8-10\r\n" + //
                                            "Remada curvada com barra (ou cavalinho) – Repetições: 4x8-10\r\n" + //
                                            "Remada baixa na máquina ou triângulo – Repetições: 3x10-12\r\n" + //
                                            "");break;
                        case 2:
                        System.out.println("Supino reto com barra – Repetições: 4x8-10\r\n" + //
                                            "Supino inclinado com halteres – Repetições: 4x8-10\r\n" + //
                                            "Crucifixo máquina ou voador – Repetições:  3x10-12\r\n" + //
                                                        "");break;
                        case 3:
                        System.out.println("Rosca direta barra EZ – Repetições: 4x8-10\r\n" + //
                                            "Rosca alternada com halteres (em pé) –  Repetições:3x10-12\r\n" + //
                                            "Rosca martelo (ou na corda) – Repetições: 3x10-12\r\n" + //
                                            "Mergulho entre bancos (ou paralelas assistidas) –  Repetições:3x10-12\r\n" + //
                                            "Tríceps testa com barra EZ – Repetições: 3x8-10\r\n" + //
                                            "Tríceps na corda –  Repetições:3x12-15 (foco em contração)\r\n" + //
                                                        "");break;
                        case 4: 
                        System.out.println("Agachamento livre (ou guiado se necessário) – Repetições: 4x8-10\r\n" + //
                                                "Leg press 45° – Repetições: 4x10-12\r\n" + //
                                                 "Cadeira extensora – Repetições: 3x12-15 (isometria no topo)\r\n" + //
                                                "Stiff com halteres – Repetições: 4x10-12 (foco no posterior)\r\n" + //
                                                "Mesa flexora – Repetições: 3x10-12\r\n" + //
                                                "Panturrilha sentado ou em pé – Repetições: 4x15-20\r\n" + //
                                                                "");break;
                        case 5: 
                        System.out.println("Desenvolvimento com halteres ou máquina – Repetições: 4x8-10\r\n" + //
                                                "Elevação lateral com halteres – Repetições: 4x12-15\r\n" + //
                                                "Elevação frontal com barra ou anilha – Repetições: 3x12\r\n" + //
                                                                "");break;
                        case 6:
                        System.out.println("Prancha abdominal – Repetições: 3x 30 a 60 segundos\r\n" + //
                                            "Abdominal na máquina ou crunch no solo – Repetições: 3x15-20\r\n" + //
                                            "Abdominal remador – Repetições: 3x15\r\n" + //
                                            "Prancha lateral (cada lado) – Repetições: 3x30 seg\r\n" + //
                                            "Abdominal com polia alta (cabo/corda) – Repetições: 3x15\r\n" + //
                                                        "");break;
                        default:
                        System.out.println("Opção inválida!");                                                                                                                                                     
                    }
                 }break;
                 case 4:
                 PlanoAcademia planoBasico = new PlanoAcademia("Basico", 100.00, "Para quem gosta de desafios mas mantém os pés no chão");
                    System.out.printf("Seu plano atual é %s no valor de " + planoBasico.getPrice() + " reais! ",planoBasico.getName());
                    System.out.println("/n"); break;

                case 5:
                 System.out.println("Nome: " + aluno.getName());
                 System.out.println("CEP: " + aluno.getCep());
                 System.out.println("Email:" + registro.getEmails());
                 System.out.println("Senha: " + registro.getSenhas());
                 System.out.println("CPF: " + aluno.getCpf());
                 System.out.println("Telefone: " + aluno.getTelefone());
                 System.out.println("Data de Nascimento: " + aluno.getDataNascimento());

                 System.out.println("Digite a opção desejada: (Para alterar os outros valores entre em contato com a sua unidade de cadastro)\n1- Alterar Email\n2- Alterar Senha\n3- Sair");
                 int opcaoDadosPessoais = sc.nextInt();
                 sc.nextLine(); // limpa o \n


                 if(opcaoDadosPessoais == 1){
                    System.out.println("Digite o novo email: ");
                    registro.alterarEmail(emailAcesso, sc.nextLine());;

                 }else if(opcaoDadosPessoais == 2){
                    System.out.println("Digite a nova senha: ");
                    registro.alterarSenha(emailAcesso, sc.nextLine());
                 }else{
                    return;
                 }break;

                 case 6:
                    PlanoAlimentar planoAlimentar = new PlanoAlimentar();
                    planoAlimentar.listarRefeicao();break;

                case 7:
                    System.out.println("Obrigado volte sempre!");
                    System.exit(0);break;
            
                default:
                 System.out.println("Digite uma opção válida");
                    break;
            }
        }
    }else {
                System.out.println("Credenciais inválidas. Tente novamente.");
            }
        }

        if (alunoOUadm == 'd') {
            LocalDate dataNascimento = LocalDate.of(2005, 5, 16);
            //Adm administrador = new Adm();
            System.out.println("Administrador logado.");
            System.out.println("O que vo");

        }

        sc.close();
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