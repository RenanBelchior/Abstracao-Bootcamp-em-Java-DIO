package Abstra��oBootcampEmJava;

public abstract class Conteudo {

	protected static final double XP_PADRAO = 10;
    
	private String titulo;
	private String descri�ao;
	
	
	public abstract double calcularXp();


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDescri�ao() {
		return descri�ao;
	}


	public void setDescri�ao(String descri�ao) {
		this.descri�ao = descri�ao;
	}
	
	
}
