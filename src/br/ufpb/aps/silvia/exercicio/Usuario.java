package br.ufpb.aps.silvia.exercicio;

import java.util.Scanner;

public class Usuario {
	
	public void cadastrarUsuario() throws Exception{
		
        Scanner s = new Scanner(System.in);
		
		Formulario f = new Formulario("cadastro PIBID");
		Campo c = new Campo("nome", new ValidadorCampoTexto(""));
		f.addCampo(c);
		System.out.println(c.getNome());
		String msg = s.nextLine();
		try {
			c.validar(msg);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
		
		Campo c1 = new Campo(" Email", new ValidadorCampoEmail());
		f.addCampo(c1);
		System.out.println(c1.getNome());
		String msg2 = s.nextLine();
		try{
			c1.validar(msg2);
			}catch (ValorInvalidoException e){
				System.out.println(e.getMessage());
			}
		
		Campo c2 = new Campo("idade", new ValidadorCampoIdade());
		f.addCampo(c2);
		System.out.println(c2.getNome());
		String msg3 = s.nextLine();
		try{
			c2.validar(msg3);
		} catch (ValorInvalidoException e){
			System.out.println(e.getMessage());
		}
		
		
		
		

	}

}
