package adsaufgabe1;

public class Graph implements IGraph {

	private boolean[][] adj;
	private int knotenanzahl;
	
	public Graph(int knotenanzahl) {
		this.knotenanzahl = knotenanzahl;
		adj = new boolean[knotenanzahl][];
		for (int i=0; i<knotenanzahl; i++)
			adj[i] = new boolean[knotenanzahl];
	}

	public void setzeKante(int von, int nach) {
		if (von>=0 && nach>=0 && von<knotenanzahl && nach<knotenanzahl)
			adj[von][nach] = true;
	}
	
	public void loescheKante(int von, int nach) {
		if (von>=0 && nach>=0 && von<knotenanzahl && nach<knotenanzahl)
			adj[von][nach] = false;
	}
	
	/* (non-Javadoc)
	 * @see adsaufgabe2.IGraph#anfrageKante(int, int)
	 */
	@Override
	public boolean anfrageKante(int von, int nach) {
		return adj[von][nach];
	}
	
	/* (non-Javadoc)
	 * @see adsaufgabe2.IGraph#anfrageKnotenanzahl()
	 */
	@Override
	public int anfrageKnotenanzahl() {
		return knotenanzahl;
	}
}
