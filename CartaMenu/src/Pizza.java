
public class Pizza extends Receta implements FastFoodeable {
	
	public Pizza(){
		super();//se llama al creador del que hereda, es decir, el creador de Receta
	}
	
	@Override
	public Tiempo tiempoPreparacion() {
		// Se establece este metodo por la interfaz fastfoodeable 'sinhacer'
		return this.getPasosPreparacion().TiempoTotal();
	}

	@Override
	public boolean isVegetariano() {
		// Se establece este metodo por la interfaz fastfoodeable'sinhacer'
		return true;
	}

	@Override
	public Preparacion tipoPreparacion() {
		// Se establece este metodo por la interfaz fastfoodeable'sinhacer'
		return Preparacion.AL_HORNO;
	}
	
}
