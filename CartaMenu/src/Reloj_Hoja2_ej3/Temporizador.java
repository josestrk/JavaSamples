package Reloj_Hoja2_ej3;

public class Temporizador {
	public static void main(String args[]){
		Reloj r=new Reloj();
		System.out.println(r);
		try{
			System.out.println("Mostrar Incremento [cada 60']:");
			for(long i=0;i<3600;i++){
				if(i%60==0)
						System.out.println("UP:\t"+r);
				Thread.sleep(1000);	
				r.incrementar();
			}
			
			System.out.println("Mostrar Decrementado [cada 60']:");
			for(long i=0;i<3600;i++){
				if(i%60==0)		
					System.out.println("DOWN:\t"+r);
				Thread.sleep(1000);	
				r.decrementar();
			}
			
			System.out.println("FIN");
		} catch (InterruptedException ie) {

		}
	}
}
