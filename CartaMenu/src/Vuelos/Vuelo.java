package Vuelos;

import java.util.Comparator;

public class Vuelo{
	private int numVuelo;
	private String destino;
	private Fecha fecha;
	private Hora hora;
	
	public Vuelo(){
		numVuelo=0;
		destino="";
		fecha=new Fecha();
		hora=new Hora();
	}
	
	public Vuelo(int numVuelo,String destino,Fecha fecha,Hora h){
		this.numVuelo=numVuelo;
		this.destino=destino;
		this.fecha=fecha;
		this.hora=h;
	}

	public int getNumVuelo() {
		return numVuelo;
	}

	public void setNumVuelo(int numVuelo) {
		this.numVuelo = numVuelo;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public Hora getHora() {
		return hora;
	}

	public void setHora(Hora hora) {
		this.hora = hora;
	}
	
	@Override
	public String toString() {
		return "Vuelo [nV:" + numVuelo + "\t D:" + destino
				+ "\t>>>\t" + fecha + "," + hora + "]";
	}
	
}
