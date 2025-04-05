package SecondaProva;

import java.util.ArrayList;

public class Squadra {

	private String nomeSquadra;
	private ArrayList<Personaggio> listaPersonaggi;
	private float puntiFatti;
	private String nomeLeader;
	
	public Squadra() {}
	
	public Squadra(String nomeSquadra, float puntiFatti, String nomeLeader)throws Exception {
		setNomeSquadra(nomeSquadra);
		setNomeLeader(nomeLeader);
		puntiFatti = 0.0f;
	}

	public String getNomeSquadra() {
		return nomeSquadra;
	}

	public void setNomeSquadra(String nomeSquadra)throws Exception{
		if(nomeSquadra.isBlank() || nomeSquadra.length() > 25) {
			throw new Exception("Il nome deve avere caratteri minori di 25 e non può essere vuoto!");
		}
		
		this.nomeSquadra = nomeSquadra;
	}

	public void aggiungiPersonaggio(Personaggio p) {
		listaPersonaggi.add(p);
	}

	public String getPersonaggi() {
		StringBuilder personaggi = new StringBuilder("{\n");
		for(Personaggio p: listaPersonaggi) {
			personaggi.append("+ " + p.getNome() + "\n");  
		}
		personaggi.append("}");
		
		return personaggi.toString();
	}

	public float getPuntiFatti() {
		return puntiFatti;
	}

	public void aggiungiPunti(float puntiFatti)throws Exception{
		if(puntiFatti < 1 || puntiFatti > 100) {
			throw new Exception("I punti guadagnati devono essere compresi tra 1 e 100");
		}
	}

	public String getNomeLeader() {
		return nomeLeader;
	}

	public void setNomeLeader(String nomeLeader)throws Exception {
		if(nomeLeader.isBlank() || nomeLeader.length() > 25) {
			throw new Exception("Il nome deve avere caratteri minori di 25 e non può essere vuoto!");
		}
		
		this.nomeLeader = nomeLeader;
	}
	
	
}
