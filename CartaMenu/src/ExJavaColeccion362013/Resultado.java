package ExJavaColeccion362013;
/**
 * 
 * @author Jose
 * ej4
 * 
 */
public class Resultado {
	private int puntos;
	private int pG;private int pE;private int gF;private int gC;
	
	public Resultado(){
		puntos=0;
		pG=0;pE=0;gF=0;gC=0;
	}

	public Resultado(int puntos, int pG, int pE, int gF, int gC) {
		this.puntos = puntos;
		this.pG = pG;
		this.pE = pE;
		this.gF = gF;
		this.gC = gC;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getpG() {
		return pG;
	}

	public void setpG(int pG) {
		this.pG = pG;
	}

	public int getpE() {
		return pE;
	}

	public void setpE(int pE) {
		this.pE = pE;
	}

	public int getgF() {
		return gF;
	}

	public void setgF(int gF) {
		this.gF = gF;
	}

	public int getgC() {
		return gC;
	}

	public void setgC(int gC) {
		this.gC = gC;
	}

	@Override
	public String toString() {
		return "PTS:" + puntos + ", pG=" + pG + ", pE=" + pE
				+ ", gF=" + gF + ", gC=" + gC+"\n";
	}
	
	
	
}
