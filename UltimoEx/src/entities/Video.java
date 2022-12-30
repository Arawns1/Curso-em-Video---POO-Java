package entities;

public class Video implements AcoesVideo{
	
	private String titulo;
	private int avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	
	
	
	public Video(String titulo) {
		this.titulo = titulo;
		this.avaliacao = 0;
		this.reproduzindo = false;
	}
	

	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAvaliacao() {
		return avaliacao;
	}


	public int getViews() {
		return views;
	}
	
	public void setViews(int views) {
		this.views = views;
	}

	public void setAvaliacao(int avaliacao) {
		int nova;
		nova = ((this.avaliacao + avaliacao) / this.views);
		this.avaliacao = nova;
	}



	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}



	public int getCurtidas() {
		return curtidas;
	}

	public boolean isReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}



	@Override
	public void play() {
		this.reproduzindo = true;
		
	}

	@Override
	public void pause() {
		this.reproduzindo = false;
		
	}

	@Override
	public void like() {
		this.curtidas++;
		
	}
	
	@Override
	public String toString() {
		return "Titulo do video: " + this.getTitulo() + "\n" +
				" * Avaliação: " + this.getAvaliacao() + "\n" +
				" * Curtidas: " + this.getCurtidas() + "\n" +
				" * Views: " + this.getViews() ;
	}
}
