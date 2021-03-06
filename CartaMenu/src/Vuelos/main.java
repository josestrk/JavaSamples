package Vuelos;

import java.util.Comparator;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Vuelo[] t1=new Vuelo[50];
		int orden;
		boolean p=false;
		Scanner tlc=new Scanner(System.in);
		t1[0]=new Vuelo(100, "Madrid", new Fecha(2,3,2014), new Hora(2,13));
		t1[1]=new Vuelo(200, "Barcelona", new Fecha(5,3,2014), new Hora(5,13));
		t1[2]=new Vuelo(300, "Caceres", new Fecha(15,2,2014), new Hora(3,13));
		t1[3]=new Vuelo(400, "Alcon", new Fecha(5,3,2014), new Hora(15,13));
		
		muestra(t1,4);
		do{
			try{
				System.out.println("VUELOS\n\nElije m�todo de ordenaci�n:\n1.Por numero de Vuelo"+
				"\n2.Por destino\n3.por Fecha&Hora\nOPCION:");
				orden=tlc.nextInt();
				switch (orden) {
				case 1:
					numVuelo numVuelo = new numVuelo();
					ordenar(numVuelo,t1,4);
					break;
				case 2:
					Destino destino = new Destino();
					ordenar(destino,t1,4);
					break;
				case 3:
					FyH fh = new FyH();
					ordenar(fh,t1,3);
					break;	
				default:
					throw new ExceptionRango();
				}
				
				muestra(t1,4);
			}catch(ExceptionRango e){
				System.out.println("Se sali� del rango permitido. Fin de programa");
				p=true;
			}
		}while(!p);	
		
	}
	public static void muestra(Vuelo[] t1,int n){
		for(int i=0;i<n;i++){
			System.out.println(t1[i].toString());
		}	
	}
	// Muy importante metodo de ordenaci�n con COMPARATOR

	public static void ordenar(Comparator c,Vuelo[] a1,int n){
		int i,j;
		Vuelo aux=null;
		for(i=0;i<n;i++){
			for(j=0;j<n-i-1;j++){
				if(c.compare(a1[j], a1[j+1])==1){
					aux=a1[j];
					a1[j]=a1[j+1];
					a1[j+1]=aux;
				}
			}
		}
	}
}
