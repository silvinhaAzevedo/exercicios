package br.ufpb.aps.silvia.exercicio;

import java.util.ArrayList;

import java.util.LinkedList;


public class Formulario {
	private LinkedList<CampoDecorator>campos;
	private String descricao;
	
	
	public Formulario(String descricao){
		this.descricao = descricao;
		this.campos = new LinkedList<CampoDecorator>();
	}
	
	public void addCampo(CampoDecorator c) {
		this.campos.add(c);
		
	}
	
	
	public String getDescricao(){
		return descricao;

}

	public int getQtdeCampos(int Qtdecampos) {
		return campos.size();
	}

	public void listarCamposDecorator() {
		for (CampoDecorator c: campos) {
			System.out.println(c.toString());
		}
}
}
