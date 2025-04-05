package SecondaProva;

public class Main {

	public static void main(String[] args) {

		
		try {
			
			Personaggio p1 = new Personaggio(100, false, "Carro");
			System.out.println("Giocatore uno -> " + p1.toString());

		
		}catch(Exception e) {
			System.out.println("Errore: " + e.getMessage());
		}
	
	}

}
