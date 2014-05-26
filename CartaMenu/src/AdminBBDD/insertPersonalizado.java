package AdminBBDD;

import java.util.Scanner;

public class insertPersonalizado {

	public static void main(String[] args) {
		int i=0;
		boolean a=true;
		String[] s;
		String escaner;
		s=new String[200];
		
		System.out.println("Introduzca tabla");
		Scanner sca=new Scanner(System.in);
		s[i]=sca.next();//con esto nos hemos guardado en primera posicion el nombre de la tabla
		i++;
		
		while(a){
			System.out.println("Introduzca Nombre de fila Si desea salir? (S/N)");
			escaner=sca.next();
			if(escaner.equals("S") || escaner.equals("s") ){
				a=false;
			}else{
				s[i]=escaner;//con esto nos hemos guardado en primera posicion el nombre de la tabla
				i++;
			}
			
		}
		
		
		for(int j=1; j<i;j++){
			System.out.println("INSERT INTO "+s[0]+" VALUES (IdEstacion.NEXTVAL"+s[j]+");");
		}
		
		
	}

}
