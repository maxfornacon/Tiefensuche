package adsaufgabe1;

public class Tiefensuche_MaximilianFornacon implements ITiefensuche {
	public static int anzKnoten, zeit;
	public static boolean[] istBekannt;
	public static int[] entdeckt;
	public static int[] fertig;
	public static Integer[] vorgaenger;
	
	public Tiefensuche_MaximilianFornacon() {
		
	}
	public static void expand(IGraph graph, int u ) {
		istBekannt[u] = true;
		zeit++;
		entdeckt[u] = zeit;
		System.out.println(u + " entdeckt: " + entdeckt[u]);
		for (int v = 0; v < anzKnoten && graph.anfrageKante(u, v) == true; v++) {
			if (!istBekannt[v]) {
				u = vorgaenger[v];
				expand(graph, v);
			}
		}
		zeit++;
		fertig[u] = zeit;
		System.out.println(u + " fertig: " + fertig[u]);
	}
	
	@Override
	public Kantentyp kantenStatus(IGraph graph,	int indexQuelleDerKante, int indexZielDerKante) {
		if (graph.anfrageKante(indexQuelleDerKante, indexZielDerKante)) {
			anzKnoten = graph.anfrageKnotenanzahl();
			istBekannt = new boolean[anzKnoten];
			entdeckt = new int[anzKnoten];
			fertig = new int[anzKnoten];
			vorgaenger = new Integer[anzKnoten];
			
			for (int u = 0; u < anzKnoten; u++) {
				istBekannt[u] = false;
				entdeckt[u] = 0;
				fertig[u] = 0;
				vorgaenger[u] = null;
			}
			zeit = 0;
			for (int u = 0; u < anzKnoten; u++) {
				if (!istBekannt[u]) {
					expand(graph, u);
				}
			}
			System.out.println("Knoten " + indexQuelleDerKante + ": ("+ entdeckt[indexQuelleDerKante] + "," + fertig[indexQuelleDerKante] + ")");
			System.out.println("Knoten " + indexZielDerKante + ": ("+ entdeckt[indexZielDerKante] + "," + fertig[indexZielDerKante] + ")");

		} else {
			return Kantentyp.KeineKante;
		}
		return null;
	}

}
