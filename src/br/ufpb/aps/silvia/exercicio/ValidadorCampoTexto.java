package br.ufpb.aps.silvia.exercicio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class ValidadorCampoTexto implements ValidadorCampo{
	
	private int max;
	private String txt;
	
	
	
	public ValidadorCampoTexto(String txt) {
		this.txt = txt;
		this.max =30;
	}
	

	public boolean validarCampo(String input) throws ValidadorCampoException {
		if (input.length() > this.max)
			throw new ValidadorCampoException("Quantidade de caracteres acima do permitido para o campo: (Nome) " +
					"O limite m�ximo � de 30 caracteres tente novamente. \n");
				
		else 
			
		for (int i = 0; i < input.length(); i++)
		    if (Character.isDigit(input.charAt(i)))
		       throw new ValidadorCampoException("O nome informado n�o � v�lido! Verifique se vc digitou " +
		                                         "algum n�mero e tente novamente.\n");    
		
		return true;
		
		
		
		
		
//		if (input.length() > max)
//			throw new ValidadorCampoException ("Quantidade de caracteres acima do permitido para o campo: (Nome). \n" + 
//		"o limite maximo � de 30 caracteres.");
//			 
//		else {
//			Pattern p = Pattern.compile("[a-z]*");
//			Matcher m = p.matcher(input);
//			
//			boolean matchFound = m.matches();
//			 if (matchFound == true)
//				 System.out.println("ok!");
//			 else
//				 throw new ValidadorCampoException("nome inv�lido");
//		}
		
			
		
	
	
	}
}
	
	


