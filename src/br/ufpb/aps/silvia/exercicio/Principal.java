package br.ufpb.aps.silvia.exercicio;

import java.util.Scanner;

public class Principal {
	
	

	public static void main (String args[]) throws Exception{

		Usuario u = new Usuario();
		
		u.cadastrarUsuario();
	
		int opcao = -1;
        while (opcao != 0){
            System.out.println("---- Sistema de cadastro ----\n");
            System.out.print("[1] Cadastrar\n");
            System.out.print("[2] Listar itens cadastrados\n");
            System.out.print("[0] Sair\n");
            Scanner menu = new Scanner(System.in);
            opcao = menu.nextInt();
          
        
            switch (opcao) {
                case 1:
                    u.cadastrarUsuario();

                    //Verificar se irá cadastrar ou finalizar
                    Scanner opcaoCadastro = new Scanner(System.in);
                    System.out.println("[C]ontinua ou [F]inaliza?");
                    int cadastro = opcaoCadastro.nextInt();

                    switch (cadastro) {
                       case 'c':
                           Usuario u1 = new Usuario();
                           u1.cadastrarUsuario();
                            break;
                        case 'f':
                            System.out.println("Até logo!");
                            System.exit(0);
                    }

                    break;

                case 2:
                    System.out.println("Listar usuarios Cadastrsdos");
                    break;


            }
            }
   	
	}

}
