package EjerciciosHoja2;

import java.util.Scanner;


public class Ej2 {

	public static void main(String[] args) {
		int[] a;
		int[] b;
		int opc=1,tam=100,n;
		a= new int[100];
		b= new int[100];
		
		Scanner tcl= new Scanner(System.in);
		
		do {
		System.out.println("\t Seleccione lo que desea hacer a continuacion:");
		for(int j=1;j<10;j++){
			System.out.print("Pulse "+j+" Ejercicio "+j+":");
		}
		System.out.print("\n opcion:");
		opc=tcl.nextInt();
			switch(opc){
			case 1: System.out.println("Introdiuce numero n del que desea saber divisores:");n=tcl.nextInt(); ejer1(a,n);break;
			case 2: System.out.println("Introdiuce numero n del que desea saber divisores primos1:");n=tcl.nextInt(); ejer2(a,n);break;
			case 3: System.out.println("Se crean 100 números aleatorios y dirá si están repetidos");ejer3(a, tam);;break;
			case 4:
				System.out.println("Indique tamaño del array al que asociarle numeros random:");
				tam=tcl.nextInt();
				a= new int[tam];
				RellenarArrayRandom(a,tam);
				MostrarArray(a,tam);
				System.out.println("\n\n"+PrimerElementoMayor(a));
				System.out.println(PrimeraCima(a));
				TodasCimas(a);
				break;
			case 5:
				System.out.println("Indique tamaño a introducir en el array:");
				n=tcl.nextInt();
				RellenarArray(a,n);
				RellenarArray(b,n);
				if(Circular(a,b,n)==true){
					System.out.println("Son Circularmente iguales");
				}else{
					System.out.println("No son Circularmente iguales");
				}
				
				break;
			case 6:
				System.out.println("Indique numeros a introducir en el array:");
				n=tcl.nextInt();
				RellenarArray(a,n);
				CambiarPosicionNum(a,n);
				MostrarArray(a,n);
				break;
			case 7:
				System.out.println("Indique cantidad de numeros primos(<100)");
				n=tcl.nextInt();
				RellenarArrayHasta(a,n);
				CribaErastotenes(a,n);
				MostrarArrayCero(a,n);
				break;
			case 8:
				System.out.println("Indique numeros a introducir en el array:");
				n=tcl.nextInt();
				RellenarArray(a,n);
				Capicua(a,n);
				
				break;
			case 9:System.out.println("OPCION CREADA EN CLASE, SE COPIA MAÑANA");
				break;
			default:
				System.out.println("\tELIJE UNA OPCION DEL 1 AL 9");
			
			}
		}while(opc!=0);
		
	}

	

	private static boolean primo(int pi) {
		int i=2;
		while(i<pi){
			if(pi%i==0){
				return false;
			}
			i++;
		}
		return true;
	}
	
	
	public static void ejer1(int[] a, int n) {
		int i,j=0;
		for(i=1;i<=n;i++){
			if(n%i==0){
				a[j]=i;
				j++;
			}
		}
		MostrarArray(a,j);
	}
	
	public static void ejer2(int[] a, int n) {
		int i,j=0;
		for(i=1;i<=n;i++){
			if(n%i==0 && primo(i)){
				a[j]=i;
				j++;
			}
		}
		MostrarArray(a,j);
	}
	
	private static void ejer3(int[] a,int tam) {
		int rep;
		RellenarArrayRandom(a, tam);
		MostrarArray(a,tam);
		rep=repetidos(a);
		if(rep==-1){
			System.out.println("\nNo hay ninguno repetido");
		}else
		{
			System.out.println("\nRepetido en pos:"+rep+" con "+repetidos(a,rep));
		}
			
	}
	
	private static int repetidos(int[] a) {
		for(int i=0;i<a.length;i++){
			
			for(int j=i+1;j<a.length;j++){
				if(a[j]==a[i]){
					return i;
				}
			}
		}
		return -1;
		
	}
	
	private static int repetidos(int[] a,int prm) {
		for(int i=prm;i<a.length;i++){
			
			for(int j=i+1;j<a.length;j++){
				if(a[j]==a[i]){
					return j;
				}
			}
		}
		return -1;
		
	}
	
	
	
	
	private static void MostrarArrayCero(int[] a, int n) {
		for(int i=0;i<n;i++){
			if(a[i]==0){
				
			}else{
				System.out.print(a[i]+"-");
			}		
		}
	}

	private static void Capicua(int[] a, int n) {
		for(int i=0;i<n;i++){
			if(a[i]==CambiarNum(a[i])){
				System.out.println("El numero "+a[i]+" es capicua:");
			}else{
				System.out.println("El numero "+a[i]+" NO es capicua:");
			}
		}
	}

	private static int CambiarNum(int n) {
		int i=10,a=1,b=0;
		int k=n;
		while(k>1){
			k=k/i;
			a=a*10;
		}
		while(n>1){
			a/=10;
			b+=(n%i)*a;
			n=n/i;
		}
		return b;
	}

	private static void CribaErastotenes(int[] a, int n) {
		int i,j;
		for(i=2;i<n;i++){
			for(j=i;j<n;j++){
				if(a[j]%i==0){
					Eliminar(a,j,n);
				}
				
			}
		}
	}



	private static void Eliminar(int[] a, int j, int n) {
		for(int i=j;i<n;i++){
			a[i]=a[(i+1)];
		}
	}



	private static void RellenarArrayHasta(int[] a, int n) {
		for(int i=0,j=1;i<n;i++,j++){
			a[i]=j;			
		}
	}



	private static void CambiarPosicionNum(int[] a, int n) {
		int i=0,aux;
		int b=n-1;
		while(i<=(b/2)){
			aux=a[i];
			a[i]=a[b-i];
			a[b-i]=aux;
			i++;
		}
	}



	private static boolean Circular(int[] a, int[] b, int n) {
		int aux=0;
		int k=0,coincide=0;
		
		for(int j=0;j<n;j++){
			if(a[0]==b[j]){
				aux=j;
				
				while(k<n){
					if(aux==n){
						aux=0;
					}
					if(a[k]!=b[aux]){
						return false;
					}else{
						coincide++;
					}
					if(coincide==n){
						return true;
					}
					k++;
					aux++;
				}
				
			}
		}
		
		return false;
	}



	private static void TodasCimas(int[] a) {
		if(a[0]>a[1]){
			System.out.println("0");
		}
		
		for(int i=1;i<(a.length-1);i++){
			if(a[i]>a[i+1] && a[i]>a[i-1]){
				System.out.print(i+"-");
			}
		}
		
		int b=a.length;
		if(a[b-1]>a[b-2]){
			System.out.println(b);
		}
	}

	private static int PrimeraCima(int[] a) {
		if(a[0]>a[1]){
			return 0;
		}
		
		for(int i=0;i<a.length;i++){
			if(a[i]>a[i+1] && a[i]>a[i-1]){
				return i;
			}
		}
		
		int b=a.length;
		if(a[b-1]>a[b-2]){
			return (b-1);
		}
		return -1;
		
	}

	private static int PrimerElementoMayor(int[] a) {
		for(int i=0;i<a.length;i++){
			if(a[i]>a[i+1]){
				return i;
			}
		}
		return -1;
		
	}

	public static void MostrarArray(int[] a, int n) {
		for(int i=0;i<n;i++){
			System.out.print(a[i]+"-");			
		}
		
	}

	public static void RellenarArrayRandom(int[] a, int tam) {
		for(int i=0;i<tam;i++){
			a[i]=(int) (Math.random()*60);			
		}
		
		
	}
	
	private static void RellenarArray(int[] a, int n) {
		Scanner tecla=new Scanner(System.in);
		for(int i=0;i<n;i++){
			System.out.println("Intro num pos"+(i+1)+":");
			a[i]=tecla.nextInt();			
		}
		
	}
}
