package br.ufpb.aps.silvia.exercicio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorCampoEmail implements ValidadorCampo{
	
	

	public void validarCampo(String nome) throws EmailInvalidoException {
		
		//Definir a sequencia de caracteres padr√o de e-mail
		Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
		
		//Combina a string dada com o padr√o
		Matcher m = p.matcher(nome);
		
		 //Verificar se a comparaÁao È verdadeira
		boolean matchFound = m.matches();
	      if (matchFound)
	        System.out.println("OK");
	      else
	        throw new EmailInvalidoException("E-mail invalido! Digite novamente.");
	      
	      
	   }

	    


	}
	
	
