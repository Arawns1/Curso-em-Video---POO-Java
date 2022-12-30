package entities;

public class Gafanhoto extends Pessoa {
	private String login;
	private int totAssistido;

	public Gafanhoto(String nome, int idade, char sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totAssistido = 0;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getTotAssistido() {
		return totAssistido;
	}
	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}
	
	public void viuMaisUm() {
		this.totAssistido++;
	}
	
	public String toString() {
		return "Nome: " + this.getNome() + "\n" +
			   "Idade: " + this.getIdade() + "\n" +
			   "Sexo: " + this.getSexo() + "\n" +
			   "Total Assistido: " + this.getTotAssistido() + "\n" +
			   "Experiência: " + this.getExperiencia();
	}
}
