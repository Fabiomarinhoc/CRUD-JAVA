package ProjetoAcademia1;

public abstract class Pacotes {

	protected String plano;
	
	

	public Pacotes(String plano2) {
		// TODO Auto-generated constructor stub
	}


	public String getPlano() {
		return plano;
	}

	public void setPlano(String plano) {
		this.plano = plano;
	}

	public void cat(String cat) {
		if (cat.equals("a")) {
			this.setPlano("A");

		} else if (cat.equals("b")) {
			this.setPlano("B");

		}else {
			this.setPlano("Plano inválido");
		}

	}

}
