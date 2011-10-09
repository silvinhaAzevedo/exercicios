package br.ufpb.aps.silvia.exercicio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorCampoEmailDecorator extends ValidadorCampoDecorator{
	
	public ValidadorCampoEmailDecorator(ValidadorCampoDecorator componente){
		super(componente);
		}
	
			
	public boolean validarCampo(String nome) throws ValidadorCampoException {
		
		super.validarCampo(nome);
	        //verifica o tamanho do email 
	        if (nome.length() > 20)
	            throw new ValidadorCampoException("Quantidade de caracteres acima do permitido para o campo: (Email).\n" +
	                                              "O limite máximo é de 20 caracteres tente novamente. \n");
	        
	        for (int i = 0; i < nome.length(); i++) // verifica a localização do @ e se tiver no inicio ou no final  lança uma exceção. ex: @silvia
	            if (nome.charAt(i) == '@' && i != 0 && i != (nome.length()-1))
	                return true;
	        
	        throw new ValidadorCampoException("O email informado não é válido! Não pode inicial com @ "
	                                          +"nem terminar com '@'. Tente novamente.\n");
	    }

		
		
		
		
		
		
		
		
		   
		   
	}

	    
	
	
