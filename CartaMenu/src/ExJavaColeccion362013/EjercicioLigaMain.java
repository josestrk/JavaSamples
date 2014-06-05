package ExJavaColeccion362013;

public class EjercicioLigaMain {
	public static void main(String args[]){
		Liga l=new Liga();
		
		Resultado r2=new Resultado(10,3,2,12,20);
		Resultado r3=new Resultado(15,4,2,14,10);
		Resultado r4=new Resultado(12,5,4,12,23);
		
		Conjunto c1=new Conjunto();
		c1.put(1, "casillas");c1.put(5, "ro");c1.put(7, "cr");
		Conjunto c2=new Conjunto();
		c2.put(7, "rivaldo");c2.put(8, "rivaldo");c2.put(10, "ldo");
		Conjunto c3=new Conjunto();
		c3.put(8, "rivaldo");c3.put(3, "rivaldo");c3.put(10, "ldo");
		
		
		Equipo e1=new Equipo("Madrid",new Resultado(),c1);
		Equipo e2=new Equipo("A.Madrid",r2,c2);
		Equipo e3=new Equipo("Barça",r3,c3);
		Equipo e4=new Equipo("Españo",r4,c3);
		
		l.add(e1);l.add(e2);l.add(e3);l.add(e4);
		
		l.visualizar(new CompararNumF());
		
		try {
			c1.anadirFichaje(7, "LuisSuarez");
			
		} catch (ImposibleFichaje e) {
			System.out.println("Introduce de nuevo el numero no se puede fichar");
		}
		
		l.visualizar(new CompararNumF());
		
		try {
			c1.anadirFichaje(8, "LuisSuarez");
			System.out.println("Fichaje correcto");
		} catch (ImposibleFichaje e) {
			System.out.println("Introduce de nuevo el numero no se puede fichar");
		}
		
		l.visualizar(new CompararNumF());
		
		System.out.println("______________________________ por puntos");
		
		l.visualizar(new CompararPuntos());
		
	}
}
