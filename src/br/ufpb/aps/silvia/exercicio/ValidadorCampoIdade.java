package br.ufpb.aps.silvia.exercicio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorCampoIdade implements ValidadorCampo{

	
	private String idade;

	public ValidadorCampoIdade(String idade) {
		this.idade = idade;
	}

	public boolean validarCampo(String txt) throws ValidadorCampoException {
		try{
			Integer.parseInt(txt);
			return true;
		}catch(NumberFormatException ex){
			throw new ValidadorCampoException("Idade iv�lida! Tem que ser maior que 0 e menor que 150");
		}
		
//		Pattern digito = Pattern.compile("+.\\d[0-9]+");
//		Matcher texto = digito.matcher (txt);
//
//		int idade = Integer.parseInt(txt);
//		
//		//verifica se existem apenas numeros no campo digitado
//		if (texto.matches()){
//			throw new IdadeInvalidaException ("ERRO: Idade deve conter apenas n�meros");
//		} else if (idade < 150){
//			throw new IdadeInvalidaException("ERRO: O valor m�ximo de Idade �: 150");
//		} else if (idade > 0){
//			throw new IdadeInvalidaException ("ERRO: Valor inv�lido");
//		} else {
//			System.out.println("OK");			
//		}
//		return false;
		
	
		        
		
		        }
	}



