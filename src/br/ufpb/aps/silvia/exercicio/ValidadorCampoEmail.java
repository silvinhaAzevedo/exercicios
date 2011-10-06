package br.ufpb.aps.silvia.exercicio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorCampoEmail implements ValidadorCampo{
	
	public ValidadorCampoEmail(){
		
		
	}
	
			
	public boolean validarCampo(String nome) throws ValidadorCampoException {
	        //verifica o tamanho do email 
	        if (nome.length() > 20)
	            throw new ValidadorCampoException("Quantidade de caracteres acima do permitido para o campo: (Email).\n" +
	                                              "O limite máximo é de 20 caracteres.");
	        
	        for (int i = 0; i < nome.length(); i++) // verifica cada indice do nome digitado se apresenta o @ e se tiver lança uma exceção. ex: si@lvia
	            if (nome.charAt(i) == '@' && i != 0 && i != (nome.length()-1))
	                return true;
	        
	        throw new ValidadorCampoException("O email informado não é válido! Verifique se vc não esqueçeu\n" +
	                                          "de colocar o operador '@' e tente novamente.");
	    }

		
		
		
		
		
		
		
		// cria um texto digitado regular
				//Pattern digitoSimbolo = Pattern.compile("@.+$.+!.+#.+\\d[a-z]*");
				// corresponde a expressão regular à string
				//Matcher textoSimbolo = digitoSimbolo.matcher (nome);
				
				//Pattern digitoNumero = Pattern.compile(".+\\d[0-9]*");
				//Matcher textoNumero = digitoNumero.matcher (nome);
				
				// verifica se o texto digitado cotém os caracteres
				//if (textoSimbolo.matches()){
					//throw new ValidadorCampoException("ERRO: E-mail invalido");
				//} else if (textoNumero.matches()){
					//throw new ValidadorCampoException("ERRO: E-mail inválido");
				//} else {
					//System.out.println("OK");
				//}
						
		   
		   
	}

	    
	
	
