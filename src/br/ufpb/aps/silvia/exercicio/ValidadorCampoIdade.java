package br.ufpb.aps.silvia.exercicio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorCampoIdade implements ValidadorCampo{

	
	public void validarCampo(String txt) throws IdadeInvalidaException {
		
	
		        int idade = Integer.parseInt(txt);

		        //Definir a sequencia de caracteres padr√o de numeros
		        Pattern p = Pattern.compile("[0-9]+");

		        //Combina a string dada com o padr√o
		        Matcher m = p.matcher(txt);

		        //Verificar se a comparaÁao verdadeira
		        boolean matchFound = m.matches();
		        if (matchFound) {
		            System.out.println("OK");
		        } else {
		            if ((idade < 0) || (idade >= 150)){
		                    throw new IdadeInvalidaException("Idade invalida!");
		            }
		
		
		        }
	}
}


