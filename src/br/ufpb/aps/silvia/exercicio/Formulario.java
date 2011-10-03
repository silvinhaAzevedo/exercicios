package br.ufpb.aps.silvia.exercicio;

import java.util.ArrayList;
import java.util.LinkedList;


public class Formulario {
	private LinkedList<Campo>campos;
	private String descricao;
	
	
	public Formulario(String descricao){
		this.descricao = descricao;
		this.campos = new LinkedList<Campo>();
	}
	
	public void addCampo(Campo c) {
		this.campos.add(c);
		
	}
	
	
	public String getDescricao(){
		return descricao;

}
}
