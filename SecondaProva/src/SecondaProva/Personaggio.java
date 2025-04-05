package SecondaProva;

public class Personaggio {

	private int vita;
	private boolean stato;
	private String nome;
	
	public Personaggio() {}
	
	public Personaggio(int vita, boolean stato, String nome)throws Exception{
		setVita(vita);
		setStato(stato);
		setNome(nome);
		}
	
	public void setVita(int vita) throws Exception{
		if(vita<0) {
			throw new Exception("La vita deve essere superiore a -1!");
		}else {
			this.vita = vita;
		}
	}
	
	public void setStato(boolean stato) {
		this.stato = stato;
	}
	
	public void setNome(String nome)throws Exception {
		if(nome.isBlank() || nome.length() > 25) {
			throw new Exception("Il nome deve avere caratteri minori di 25 e non può essere vuoto!");
		}else {
			this.nome = nome;
		}
	}
	
	
	public int getVita() {
		return this.vita;
	}
	
	public boolean getStato() {
		return this.stato;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String toString() {
		return "{ Vita: " + getVita() + "; Stato: " + getStato() + "; Nome: " + getNome() + " }";
	}
	
}
