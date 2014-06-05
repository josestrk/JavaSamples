package examenPruebaFinal;


public class Ej2Cola {
		private Object [] cola;
		private int cabeza;
		private int fin;
		
		public Ej2Cola(){
			cola = new Object[20];
			cabeza=-1;
			fin=-1;
		}
		public boolean add(Object o) {
			// TODO Auto-generated method stub
			
			
				if (this.isEmpty()){  //si esta vacia
					cabeza++;
					fin++;
					cola[fin]=o;
			         return true;
				}else {
					if(this.isFull()==false){ //si no esta llena
						if (fin < this.cola.length-1){
							fin++;
							cola[fin]=o;
							return true;
						}else {
							fin=0;
							cola[fin]=o;
							return true;
						}
					}else{
						return false;   //si esta llena
					}
				}
				
			
		}

		/* (non-Javadoc)
		 * @see pilascolas.Coleccion#remove()
		 */
		public Object remove() {
			// TODO Auto-generated method stub
			Object o;
			if (this.isEmpty())    //si esta vacia
			    return null;
			else{
				if (cabeza==fin){  //si es el último elemento
					o=cola[cabeza];
					cabeza =-1;
					fin=-1;
				}else{    //en cualquier otro caso
				   o= cola[cabeza]; 
				   cabeza++; 
				   if (cabeza==this.cola.length){   //si cabeza sale del array pero no esta vacia
					cabeza=0;
				   }
				}
			}
			return o;
				
			
			
		}

		
		public boolean isEmpty() {
			if (cabeza==-1 && fin==-1)
				return true;
			else
			// TODO Auto-generated method stub
			return false;
		}
		
		public boolean isFull() {
			// TODO Auto-generated method stub
			if(fin == cola.length-1 &&  cabeza ==0)
			  return true;
			else if (fin+1 ==cabeza) 
				return true;
			else 
				return false;
		}
		public String toString(){
			String s="COLA: ";
			Ej2Cola aux = new Ej2Cola();
			Object o;
			while (this.isEmpty()==false){
				o=this.remove();
				s= s+ o +"-";
				aux.add(o);
			}	
			while (aux.isEmpty()==false){  
				o=aux.remove();
				this.add(o);
			}	
			return s;
		}


}
