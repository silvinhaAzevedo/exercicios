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
	

	public void validarCampo(String valor) throws ValorInvalidoException,nomeInvalidoException {
	
		if (txt.length() > max)
			throw new ValorInvalidoException("o tamanho maximo do nome é" +max); 
		else
			
		
		 txt = "silvia";  
		
		 
		if (txt.matches("^[a-zA-ZÁÂÃÀÇÉÊÍÓÔÕÚÜáâãàçéêíóôõúü]*$"))  //valida se o texto tem apenas letras
	   System.out.println("Só tem letras.");  

	else 
		
		if (txt.matches("^[0-9]*$")) //verifica se no texto tem digitos ou apenas letras
			throw new nomeInvalidoException("nome inválido contém numeros");
		
		
		
		 
	
			
	}
	
	}
	
	


