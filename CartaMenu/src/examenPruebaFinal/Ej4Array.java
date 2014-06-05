package examenPruebaFinal;

/*
 * 4.	 Dado un array de número enteros números de tamaño TAM y n elementos, 
 * diseñar una función ordenar que ordene los elementos *  pares sin modificar 
 * los impares. Devolverá el número de pares y el número de intercambios realizados
 * 
 * 6	7	3	2	5	8	4	3	6	1	2
 * 2	7	3	2	5	4	6	3	6	1	8
 * */

public class Ej4Array {

	public static void main(String[] args){
		int[] ar={6,7,3,2,5,8,4,3,6,1,2};
		int n=ar.length;
		mostrar(ar);
		String s=ordenar(ar,n);
		mostrar(ar);
		System.out.println("\n"+s);
	}
	
	private static void  mostrar(int[] ar) {
		System.out.println();
		for(int i=0;i<ar.length;i++){
			System.out.print(ar[i]+"|");
		}
	}	
	public static String ordenar(int[] ar,int n){
		int c = 0,j,sc = 0,aux=0;
		String s="";
		
		for(int i=0;i<n;i++){
			if(ar[i]%2==0){
				c++;
				for(j=0;j<n;j++){
					if(ar[j]%2==0 && ar[i]<ar[j]){
						aux=ar[j];
						ar[j]=ar[i];
						ar[i]=aux;
						sc++;
					}
				}
			}
		}
		
		s="Pares:"+c+" Cambios:"+sc;
		return s;
	}
}
