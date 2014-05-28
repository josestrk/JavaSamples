package Diccionario;
public class Texto implements Traducible{
	private Nodo txtIni;
	
	public Texto(){
		this.txtIni=new Nodo();
	}
	
	public Texto(Palabra pl){
		this.txtIni=new Nodo();
		txtIni.setInfo(pl);
		txtIni.setSig(null);
	}
	
	public void add(Palabra p){
		while(txtIni.getSig()!=null){
			txtIni.getSig();
		}
		txtIni.setInfo(p);
		txtIni.setSig(null);
		
	}

	@Override
	public int traduce(Diccionario d) {
		int cont=0;
		cont=txtIni.getInfo().traduce(d);
		
		while(txtIni.getSig()!=null){
			cont+=txtIni.getInfo().traduce(d);
		}
		return cont;
	}

	@Override
	public double coste() {
		return 0.20;
	}
	
	public String toString(){
		String s="";
		while(txtIni.getSig()!=null){
			s=s+txtIni.getInfo();
			txtIni.getSig();
			
		}
		return s;
	}	
}
