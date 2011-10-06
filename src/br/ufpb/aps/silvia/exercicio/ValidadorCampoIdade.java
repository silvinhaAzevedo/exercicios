package br.ufpb.aps.silvia.exercicio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorCampoIdade implements ValidadorCampo{

	
	

	public ValidadorCampoIdade() {
		
	}

	public boolean validarCampo(String txt) throws ValidadorCampoException {
		
		
		try{
			int txt2  = Integer.parseInt(txt);
			if(txt2>150){
				throw new ValidadorCampoException("Erro! Verifique se vc não ultrapassou a idade permitida que é 150 tente novamente.");
			}
				
			
		} catch(NumberFormatException ex){
			throw new ValidadorCampoException("Idade inválida!");
		}
		return true;
	}
}
		
//		Pattern digito = Pattern.compile("+.\\d[0-9]+");
//		Matcher texto = digito.matcher (txt);
//
//		int idade = Integer.parseInt(txt);
//		
//		//verifica se existem apenas numeros no campo digitado
//		if (texto.matches()){
//			throw new IdadeInvalidaException ("ERRO: Idade deve conter apenas números");
//		} else if (idade < 150){
//			throw new IdadeInvalidaException("ERRO: O valor máximo de Idade é: 150");
//		} else if (idade > 0){
//			throw new IdadeInvalidaException ("ERRO: Valor inválido");
//		} else {
//			System.out.println("OK");			
//		}
//		return false;
		
	
		        
		
		        

	
	//public boolean validarCampo(String nome) throws ValidadorCampoException {
		// TODO Auto-generated method stub
		//return false;
	


