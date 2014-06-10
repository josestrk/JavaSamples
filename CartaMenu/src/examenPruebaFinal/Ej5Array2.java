package examenPruebaFinal;
/**
 * 5.	Dado un array de tamaño TAM y n elementos, diseñar una 
 * función que elimine el mayor y el menor elemento del array.
 * Y si están repetidos se eliminarán todas las apariciones. 
 * @author Jose
 *
 */
public class Ej5Array2 {
	public static void main(String[] args){
		int[] ar={6,7,3,2,5,8,4,3,6,1,2,8,4,3,6,1,2,8,4,3,6,1,2};
		int n=ar.length;
		mostrar(ar);
		eliminoMym(ar);
		mostrar(ar);
	}
	
	//eliminar mayor y meno del array
	
	
	private static void eliminoMym(int[] ar) {
		int mi=0;//buscar pekeño sumo 1º como min y max
		int ma=0;//buscar mayor
		//recorrer array comparando por arriba y por abajo con mi ma
		for(int i=0;i<ar.length;i++){
			if(ar[mi]<=ar[i]){
				mi=i;
			}
			if(ar[ma]>ar[i]){
				ma=i;
			}
		}
		//encuentro los mayores y menores y recorro para borrar
		borrar(ar[mi],ar[ma],ar);
	}

	private static void borrar(int p,int m,int[] ar) {
		int i,aux=0;
		for(i=0;i<ar.length;i++){
			if(ar[i]==p || ar[i]==m){
				for(int j=i;j<ar.length;j++){
					if(j+1==ar.length)
						ar[j]=0;
					else
						ar[j]=ar[j+1];
				}
				i--;
			}
		}
		
	}

	private static void  mostrar(int[] ar) {
		System.out.println();
		for(int i=0;i<ar.length;i++){
			System.out.print(ar[i]+"|");
		}
	}	
	
}
