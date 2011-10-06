package br.ufpb.aps.silvia.exercicio;

//teste
class Campo {
	private String nome;
	private String email;
	private String idade;
	private ValidadorCampo vc;
	private String erro;
	private String msg;

	public Campo() {
		

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws Exception {
		vc = new ValidadorCampoTexto(nome);
		if (vc.validarCampo(nome))
			this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws Exception {
		vc = new ValidadorCampoEmail();
		if (vc.validarCampo(email))
			this.email = email;

	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) throws Exception {
		vc = new ValidadorCampoIdade();
		if (vc.validarCampo(idade))
			this.idade = idade;
	}

	public String toString() {
		return "Nome:" +  this.nome + "\n" + "Email:" + this.email + "\n" +  "Idade:" + this.idade;
	}

	public boolean validar(String msg) throws Exception {
		try {
			vc.validarCampo(this.msg);
			return true;
		} catch (ValidadorCampoException e) {
			this.erro = e.getMessage();
			return false;
		}
	}

}
