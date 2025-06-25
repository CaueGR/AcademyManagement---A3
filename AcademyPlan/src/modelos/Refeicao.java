package modelos;

public class Refeicao {
	private String name;
	private String descricao;
	private Double calorias;
	private String horarioRefeicao;
	
	public Refeicao(String name, String descricao, Double calorias, String horarioRefeicao) {
		this.name = name;
		this.descricao = descricao;
		this.calorias = calorias;
		this.horarioRefeicao = horarioRefeicao;
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
		return "Refeição: " + name + "\n" +  "Descrição: " + descricao +  "\n"+  "Calorias: " + calorias;
	}
	
	
}
