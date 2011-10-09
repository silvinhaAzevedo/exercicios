package br.ufpb.aps.silvia.exercicio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public  class ValidadorCampoIdade implements ValidadorCampo{
	private int tamanhoMax;
	private int tamanhoMin;
	
	


	public ValidadorCampoIdade(int tmax, int tmin ){
		this.tamanhoMax = 150;
		this.tamanhoMin = 0;
	}
		


	public boolean validarCampo(String txt) throws ValidadorCampoException {
		
		
		try{
			int txt2  = Integer.parseInt(txt);
			if(txt2>=150){
				throw new ValidadorCampoException("Erro!  voce n�o ultrapassou a idade permitida que � 150 tente novamente.");
			} else
				if (txt2 <= 0){
					throw new ValidadorCampoException ("> ERRO: Valor inv�lido");
				}
				
				} catch(NumberFormatException ex){
			throw new ValidadorCampoException(" Idade deve conter apenas n�meros!");
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
//			throw new IdadeInvalidaException ("ERRO: Idade deve conter apenas n�meros");
//		} else if (idade < 150){
//			throw new IdadeInvalidaException("ERRO: O valor m�ximo de Idade �: 150");
//		} else if (idade > 0){
//			throw new IdadeInvalidaException ("ERRO: Valor inv�lido");
//		} else {
//			System.out.println("OK");			
//		}
//		return false;
		
	
		        
		
		        

	
	//public boolean validarCampo(String nome) throws ValidadorCampoException {
		// TODO Auto-generated method stub
		//return false;
	


