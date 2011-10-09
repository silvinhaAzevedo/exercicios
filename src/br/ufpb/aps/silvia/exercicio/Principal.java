package br.ufpb.aps.silvia.exercicio;

import java.util.Scanner;

public class Principal {
	
	

	public static void main (String args[]) throws Exception{

		int opcao = 0;
		
		Scanner menu = new Scanner(System.in); 
		Fachada fachada = new Fachada();
		
		
        int  op = 1;
        while (op != 3){
        	System.out.println("------Cadastrar Usuário-------\n");
        	System.out.print("[1] Cadastrar\n");
            System.out.print("[2] Listar itens cadastrados\n");
            System.out.print("[3] Sair\n");
            
            op = Integer.parseInt(menu.nextLine());
        
        	switch (op){
        	
        	case 1:
        		
        		String continuar = "C"; 

				while (continuar.equals("C")) { 
					try {
						CampoDecorator c = new CampoDecorator();
						System.out.println("digite seu nome:\n");
						String nome = menu.nextLine();
						c.setNome(nome);
						System.out.println("digite seu email:\n");
						String email = menu.nextLine();
						c.setEmail(email);
						System.out.println("digite sua idade:\n");
						String idade = menu.nextLine();
						c.setIdade(idade);
						System.out.println("digite seu login:\n");
						String login = menu.nextLine();
						c.setLogin(login);
						System.out.println("digite sua senha:\n");
						String senha = menu.nextLine();
						c.setSenha(senha);

						fachada.inserirNovoCampo(c);
					} catch (Exception ex) {

						System.out.println("Erro: " + ex.getMessage());
					}
					System.out.println("[C]ontinuar - [F]inalizar");  
					continuar = menu.nextLine();  
				}break;
        			
        	 case 2:
        		 
        	fachada.listarCampos(); break;
        	
        	 case 3:
 				System.out.println("finalizado!\n");
                 
                 
           
        	}
        		}
	}
}
           

        
        


