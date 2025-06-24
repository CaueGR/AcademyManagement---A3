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
import entities.Treinador;

public class Program {
    	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Registro registro = new Registro();
        Aluno aluno;
        
        System.out.println("Olá, seja bem vindo! Você é aluno? (S/N) ");
        char alunoOUadm = sc.next().charAt(0);
        if (alunoOUadm == 's') {


        linha();
        System.out.println("Já possui o cadastro? (S/N)");
        linha();
        
        char possuiCadastro = sc.next().charAt(0);
        
        

        if(possuiCadastro == 'S' || possuiCadastro == 's') {
            System.out.println("Certo! Vamos fazer login, qual seu acesso?");
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String dataString = "09/16/2006";
        	LocalDate dataNascimento = LocalDate.parse(dataString, formato);
            String name = "Aluno Teste";
            int telefone = 51942137;
            long longTelefone = telefone;
            int cpf = 456806986;
            long longCpf = cpf;
            int cep = 36465;

            aluno = new Aluno(name,dataNascimento, longTelefone, longCpf, cep); 

        }else{
            linha();
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
            
             aluno = new Aluno(nome,dataNascimento, telefone, cpf, cep); 
            
          linha();
          System.out.println();
          System.out.println("email: ");
          String email = sc.next();
          sc.nextLine(); // limpa o \n

          System.out.println("Senha: ");
          String senha = sc.next();
          System.out.println("Confrime a senha: ");
          String confirmaSenha = sc.next();

          linha();

          boolean confirmacao = false;

        while(!confirmacao){
          System.out.println("Qual o plano desejado?\n1- Básico\n2- Prime\n3- Vip ");
          int opcaoPlano = sc.nextInt();
          if(opcaoPlano == 1){
            linha();

            PlanoAcademia planoBasico = new PlanoAcademia("Básico" , 100.00, "O plano Básico é ideal para quem quer dar o pontapé inicial sem pesar o bolso!");
            System.out.println(planoBasico);

            linha();
            System.out.println("1- Confirmar\n2- Voltar");
            int confirmaPlano = sc.nextInt();
            if(confirmaPlano == 1){
                aluno.setPlanoAcademia(planoBasico);
                confirmacao = true;
            }
          }else if(opcaoPlano == 2){
            linha();

            PlanoAcademia planoPrime = new PlanoAcademia("Prime" , 120.00, "Essa opção é para quem não tem medo de desafios!");
            System.out.println(planoPrime);

            linha();
            System.out.println("1- Confirmar\n2- Voltar");
            int confirmaPlano = sc.nextInt();
            if(confirmaPlano == 1){
                aluno.setPlanoAcademia(planoPrime);
                confirmacao = true;
            }
          }else if(opcaoPlano == 3){
            linha();

            PlanoAcademia planoVip = new PlanoAcademia("Vip" , 140.00, "O nível máximo que você pode alcançar, para quem sabe onde quer chegar!");
            System.out.println(planoVip);

            linha();
            System.out.println("1- Confirmar\n2- Voltar");
            int confirmaPlano = sc.nextInt();
            if(confirmaPlano == 1){
                aluno.setPlanoAcademia(planoVip);
                confirmacao = true;
            }
          }
        }

          registro.cadastrarUsuario(email, senha);
          registro.confirmarSenha(confirmaSenha, senha);
        }

          boolean valido = false;
          while (!valido) {
        
          
          linha();
          sc.nextLine(); // limpa o \n

          System.out.println("Email: ");
          String emailAcesso = sc.nextLine();

          sc.nextLine(); // limpa o \n
          System.out.println("Senha: ");
          String senhaAcesso = sc.nextLine();
          
          linha();

          
          Login login = new Login(registro);

          if(login.autenticar(emailAcesso, senhaAcesso)){
            valido = true;
            int opcaoPrincipal = 0;
            while(opcaoPrincipal != 7){

            System.out.printf("Bem vindo %s! O que deseja fazer?" , aluno.getName());

            System.out.println("\n1- Agendar consulta com treinador");
            System.out.println("2- Agendar treino");
            System.out.println("3- Visualizar plano de treino");
            System.out.println("4- Verificar Plano da Academia");
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
                    linha();
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
                                                linha();
                 }else if(treinoCompleto == 'N' || treinoCompleto == 'n'){
                    System.out.println("Qual treino específico deseja?\n1- Costas\n2- Peito\n3- Membros Superiores\n4- Pernas\n5- Ombros\n6- Abdômen");
                    int opcaoTreino = sc.nextInt();
                    
                    switch(opcaoTreino){
                        case 1: 
                        linha();
                        System.out.println("1. Puxada alta pegada aberta (barra ou frente) - Repetições: 4x8-10\r\n" + //
                                            "2. Remada curvada com barra (ou cavalinho) - Repetições: 4x8-10\r\n" + //
                                            "3. Remada baixa na máquina ou triângulo - Repetições: 3x10-12\r\n" + //
                                            "");
                                            linha();break;
                        case 2:
                        linha();
                        System.out.println("1. Supino reto com barra - Repetições: 4x8-10\r\n" + //
                                            "2. Supino inclinado com halteres - Repetições: 4x8-10\r\n" + //
                                            "3. Crucifixo máquina ou voador - Repetições:  3x10-12\r\n" + //
                                                        "");
                                                        linha();break;
                        case 3:
                        linha();
                        System.out.println("1. Rosca direta barra EZ - Repetições: 4x8-10\r\n" + //
                                            "2. Rosca alternada com halteres (em pé) -  Repetições:3x10-12\r\n" + //
                                            "3. Rosca martelo (ou na corda) - Repetições: 3x10-12\r\n" + //
                                            "4. Mergulho entre bancos (ou paralelas assistidas) -  Repetições:3x10-12\r\n" + //
                                            "5. Tríceps testa com barra EZ - Repetições: 3x8-10\r\n" + //
                                            "6. Tríceps na corda -  Repetições:3x12-15 (foco em contração)\r\n" + //
                                                        "");
                                                        linha();break;
                        case 4:
                        linha(); 
                        System.out.println("1. Agachamento livre (ou guiado se necessário) - Repetições: 4x8-10\r\n" + //
                                                "2. Leg press 45° - Repetições: 4x10-12\r\n" + //
                                                 "3. Cadeira extensora - Repetições: 3x12-15 (isometria no topo)\r\n" + //
                                                "4. Stiff com halteres - Repetições: 4x10-12 (foco no posterior)\r\n" + //
                                                "5. Mesa flexora - Repetições: 3x10-12\r\n" + //
                                                "6. Panturrilha sentado ou em pé - Repetições: 4x15-20\r\n" + //
                                                                "");
                                                                linha();break;
                        case 5:
                        linha(); 
                        System.out.println("1. Desenvolvimento com halteres ou máquina - Repetições: 4x8-10\r\n" + //
                                                "2. Elevação lateral com halteres - Repetições: 4x12-15\r\n" + //
                                                "3. Elevação frontal com barra ou anilha - Repetições: 3x12\r\n" + //
                                                                "");
                                                                linha();break;
                        case 6:
                        linha();
                        System.out.println("1. Prancha abdominal - Repetições: 3x 30 a 60 segundos\r\n" + //
                                            "2. Abdominal na máquina ou crunch no solo - Repetições: 3x15-20\r\n" + //
                                            "3. Abdominal remador - Repetições: 3x15\r\n" + //
                                            "4. Prancha lateral (cada lado) - Repetições: 3x30 seg\r\n" + //
                                            "5. Abdominal com polia alta (cabo/corda) - Repetições: 3x15\r\n" + //
                                                        "");
                                                        linha();break;
                        default:
                        System.out.println("Opção inválida!");                                                                                                                                                     
                    }
                 }break;
                 case 4:
                 linha();
                    System.out.printf("Seu plano atual é %s no valor de " + aluno.getPlanoAcademia().getPrice() + " reais mensais! ",aluno.getPlanoAcademia().getName());
                    System.out.println("\n");
                    linha(); break;

                case 5:
                linha();
                 System.out.println("Nome: " + aluno.getName());
                 System.out.println("CEP: " + aluno.getCep());
                 System.out.println("Email:" + registro.getEmails());
                 System.out.println("Senha: " + registro.getSenhas());
                 System.out.println("CPF: " + aluno.getCpf());
                 System.out.println("Telefone: " + aluno.getTelefone());
                 System.out.println("Data de Nascimento: " + aluno.getDataNascimento());
                 linha();

                 System.out.println("Digite a opção desejada: (Para alterar os outros valores entre em contato com a sua unidade de cadastro)\n1- Alterar Email\n2- Alterar Senha\n3- Sair");
                 int opcaoDadosPessoais = sc.nextInt();
                 sc.nextLine(); // limpa o \n


                 if(opcaoDadosPessoais == 1){
                    linha();
                    System.out.println("Digite o novo email: ");
                    registro.alterarEmail(emailAcesso, sc.nextLine());;

                 }else if(opcaoDadosPessoais == 2){
                    linha();
                    System.out.println("Digite a nova senha: ");
                    registro.alterarSenha(emailAcesso, sc.nextLine());
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



    }else if (alunoOUadm == 'n') {

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

            boolean validado = false;
            while (!validado){
                
            System.out.println("Digite seu número de acesso: ");
            int numeroAcesso = sc.nextInt();
            sc.nextLine(); // limpa o \n

            System.out.println("Digite sua senha de acesso: ");
            String senhaAdm = sc.nextLine();
            sc.nextLine(); // limpa o \n

            Adm adm = new Adm(nome, dataNascimento, telefone, cpf, cep, numeroAcesso, senhaAdm);
            
            if(adm.autenticacao(numeroAcesso, senhaAdm)){
                validado = true;
            }

            }
            
            System.out.println("Administrador logado.");
            int opcaoPrincipal = 0;
            while(opcaoPrincipal != 4){
            System.out.println("Olá, seja bem vindo! O que você deseja fazer? ");
            System.out.println("1- Cadastrar Treinador\n2- Visualizar Lista de Alunos\n3- Editar Planos\n4- Sair");
             opcaoPrincipal = sc.nextInt();

            switch (opcaoPrincipal) {
                case 1:
                     System.out.print("Nome: ");
        	sc.nextLine();
        	String nomeTreinador = sc.nextLine();
        	
        	
        	System.out.print("Data de nascimento (dd/MM/yyyy): ");
        	String dataStringTreinador = sc.nextLine();

        	System.out.print("Telefone: ");
        	Long telefoneTreinador = sc.nextLong();
        	sc.nextLine(); // limpa o \n deixado pelo nextInt()

        	System.out.print("CPF: ");
        	Long cpfTreinador = sc.nextLong();
        	sc.nextLine(); // limpa o \n

        	System.out.print("CEP: ");
        	Integer cepTreinador = sc.nextInt();
        	sc.nextLine(); // limpa o \n

            System.out.println("Qual a especialização? ");
            String especializacao = sc.nextLine();
            sc.nextLine(); // limpa o \n

            System.out.println("Qual a disponibilidade? ");
            String disponibilidade = sc.nextLine();
            sc.nextLine(); // limpa o \n
        	DateTimeFormatter formatoTreinador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        	LocalDate dataNascimentoTreinador = LocalDate.parse(dataString, formato);

            Treinador treinador = new Treinador(nomeTreinador, dataNascimentoTreinador, telefoneTreinador, cpfTreinador, cepTreinador, especializacao, disponibilidade);
                    break;
            
                    case 2: 
                    System.out.println();

                    break;

                    case 3:
                    
                default:
                    break;
               }
            }     
        }
    
        sc.close();
    }

    public static void linha() {
        System.out.println("==================================================");
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