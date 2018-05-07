package adsaufgabe1;

public class TestProgramm {

	public TestProgramm() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Graph g = new Graph(4);
		g.setzeKante(0, 2);
		g.setzeKante(3, 0);
		g.setzeKante(1, 3);
		g.setzeKante(2, 1);
		g.setzeKante(2, 3);
		boolean erfolgreich = true;
		ITiefensuche t = new Tiefensuche_MaximilianFornacon();
		if (t.kantenStatus(g, 3, 0)!=Kantentyp.Rueckwaertskante) {
			erfolgreich = false;
			System.out.println("Fehler! (3,0) ist Rueckwaertskante");
		} else
			System.out.println("Kante (3,0) wurde richtig erkannt");
		if (t.kantenStatus(g, 2, 1)!=Kantentyp.Baumkante) {
			erfolgreich = false;
			System.out.println("Fehler! (2,1) ist Baumkante");
		} else	
			System.out.println("Kante (2,1) wurde richtig erkannt");
		if (t.kantenStatus(g, 0, 3)!=Kantentyp.KeineKante) {
			erfolgreich = false;
			System.out.println("Fehler! (0,3) muss als KeineKante gemeldet werden");
		} else
			System.out.println("Nichtexistenz der Kante (0,3) wurde richtig erkannt");
		if (erfolgreich) 
			System.out.println("\nTestfall: erfolgreich");
		else
			System.out.println("\nTestfall: FEHLGESCHLAGEN");
	}

}
