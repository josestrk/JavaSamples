
public class Pizza extends Receta implements FastFoodeable {
	
	public Pizza(){
		super();//se llama al creador del que hereda, es decir, el creador de Receta
	}
	
	@Override
	public Tiempo tiempoPreparacion() {
		// Se establece este metodo por la interfaz fastfoodeable 'sinhacer'
		return null;
	}

	@Override
	public boolean isVegetariano() {
		// Se establece este metodo por la interfaz fastfoodeable'sinhacer'
		return false;
	}

	@Override
	public Preparacion tipoPrearacion() {
		// Se establece este metodo por la interfaz fastfoodeable'sinhacer'
		return null;
	}
	
}
