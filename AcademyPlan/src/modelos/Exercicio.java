package modelos;

public class Exercicio {

    private String name;
    private String grupoMuscular;
    private Integer repeticoes;
    private Integer series;

    public Exercicio(String name, String grupoMuscular, Integer repeticoes, Integer series) {
        this.name = name;
        this.grupoMuscular = grupoMuscular;
        this.repeticoes = repeticoes;
        this.series = series;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrupoMuscular() {
        return grupoMuscular;
    }

    public void setGrupoMuscular(String grupoMuscular) {
        this.grupoMuscular = grupoMuscular;
    }

    public Integer getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(Integer repeticoes) {
        this.repeticoes = repeticoes;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

	@Override
	public String toString() {
		return "Exercicio: " + name + " \n" + " Grupo Muscular: " + grupoMuscular + " \n" + " Repeticoes: " + repeticoes + " \n" +" Series: " + series;
	}

 


}
