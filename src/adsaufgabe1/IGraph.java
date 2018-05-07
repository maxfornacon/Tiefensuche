package adsaufgabe1;

public interface IGraph {

	/**
	 * Getter zur Abfrage, ob eine Kante im Graphen existiert. Dabei sind 
	 * die Indizes der Knoten in der Menge {0,...,(n-1)} fuer einen Graph
	 * mit n Knoten.
	 * @param von Index des Startknotens der Kante
	 * @param nach Index des Zielknotens der Kante
	 * @return	Information, ob diese Kante existiert
	 */
	public abstract boolean anfrageKante(int von, int nach);

	/**
	 * Getter fuer die Anzahl der Knoten
	 * @return Anzahl der Knoten im Graphen
	 */
	public abstract int anfrageKnotenanzahl();

}
