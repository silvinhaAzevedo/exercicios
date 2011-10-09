package br.ufpb.aps.silvia.exercicio;



public class ValidadorCampoDecorator implements ValidadorCampo {

private ValidadorCampoDecorator componente;
	
	public ValidadorCampoDecorator(ValidadorCampoDecorator componente){
		this.componente = componente;
	}
	
	public ValidadorCampoDecorator(ValidadorCampo componente2) {
		// TODO Auto-generated constructor stub
	}

	public boolean validarCampo (String txt) throws ValidadorCampoException{
		return componente.validarCampo(txt);
	}
		
	
}

