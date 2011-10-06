package br.ufpb.aps.silvia.exercicio;

import java.util.Scanner;

public class Principal {
	
	

	public static void main (String args[]) throws Exception{

	
	
		int opcao = 0;
		
		Scanner menu = new Scanner(System.in); 
		Fachada fachada = new Fachada();
		
		
        int  op = 1;
        while (opcao != 3){
        	System.out.println("------Cadastrar Usuário-------\n");
        	System.out.print("[1] Cadastrar\n");
            System.out.print("[2] Listar itens cadastrados\n");
            System.out.print("[3] Sair\n");
            
            op = Integer.parseInt(menu.nextLine());
        
        	switch (op){
        	
        	case 1:
        		try{
        			Campo c = new Campo();
        				System.out.println("digite seu nome:\n");
        				String nome = menu.nextLine();
        				c.setNome(nome);
        				System.out.println("digite seu email:\n");
        				String email = menu.nextLine();
        				c.setEmail(email);
        				System.out.println("digite sua idade:\n");
        				String idade = menu.nextLine();
        				c.setIdade(idade);
        				
        				fachada.inserirNovoCampo(c);
        				}
        			catch (Exception ex) {
						
        				System.out.println("Erro: " + ex.getMessage());
        			}
        			
        			break;
        			
        	 case 2:
        		 
        	fachada.listarCampos(); break;
        	
        	 case 3:
 				System.out.println("finalizado!\n");
                 
                 
           
        	}
        		}
	}
}
           

        
        


