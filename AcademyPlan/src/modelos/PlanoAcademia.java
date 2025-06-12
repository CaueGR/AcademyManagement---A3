package modelos;

public class PlanoAcademia {
	private String name;
	private Double price;
	private String descricao;
	
	public PlanoAcademia(String name, Double price, String descricao) {
		this.name = name;
		this.price = price;
		this.descricao = descricao;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "PlanoAcad [name=" + name + ", price=" + price + ", descricao=" + descricao + "]";
	}
	
	
	
}
