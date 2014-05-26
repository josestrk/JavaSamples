
public class Sandwich extends Receta implements FastFoodeable {
	
	public Sandwich(){
		super();//se llama al creador de receta
	}

	@Override
	public Tiempo tiempoPreparacion() {
		// Se establece este metodo por la interfaz fastfoodeable 'sinhacer's
		return null;
	}

	@Override
	public boolean isVegetariano() {
		// Se establece este metodo por la interfaz fastfoodeable 'sinhacer'
		return false;
	}

	@Override
	public Preparacion tipoPrearacion() {
		// Se establece este metodo por la interfaz fastfoodeable 'sinhacer'
		return null;
	}
	
}
