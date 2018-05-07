package adsaufgabe1;

public interface ITiefensuche {

	/**
	 * Der Tiefensuchealgorithmus wird durchgefuehrt und dabei geprueft,
	 * zu welcher Klasse die Kante von indexQuelleDerKante zu 
	 * indexZielDerKante gehoert. Dabei wird die Methode "Expandiere" aus
	 * der Vorlesung zunaechst vom Knoten 0, dann vom Knoten 1 etc. gestartet.
	 * Die ausgehenden Kanten eines Knotens werden ebenfalls in der 
	 * aufsteigenden Reihenfolge gemaess der Knotennummer des Zielknotens
	 * abgearbeitet.
	 * 
	 * @param graph Zu pruefender Graph
	 * @param indexQuelleDerKante Ausgangsknoten der gesuchten Kante
	 * @param indexZielDerKante Zielknoten der gesuchten Kante
	 * @return Klassifikation der Kante bzw. Klasse KeineKante, falls die Kante im Graphen nicht existiert
	 */
	public Kantentyp kantenStatus(IGraph graph, 
			int indexQuelleDerKante, int indexZielDerKante);
}
