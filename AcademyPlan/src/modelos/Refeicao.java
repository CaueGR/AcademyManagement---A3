package modelos;

public class Refeicao {
	private String name;
	private String descricao;
	private Double calorias;
	
	public Refeicao(String name, String descricao, Double calorias) {
		super();
		this.name = name;
		this.descricao = descricao;
		this.calorias = calorias;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getCalorias() {
		return calorias;
	}

	public void setCalorias(Double calorias) {
		this.calorias = calorias;
	}

	@Override
	public String toString() {
		return "Refeicao [name=" + name + ", descricao=" + descricao + ", calorias=" + calorias + "]";
	}
	
	
}
