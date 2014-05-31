
public class Sandwich extends Receta implements FastFoodeable {
	private Tiempo tiempoTreparacion;
	private boolean isVegetariano;
	private Preparacion tipoPreparacion; 
	
	public Sandwich(){
		super();//se llama al creador de receta
	}

	@Override
	public Tiempo tiempoPreparacion() {
		// Se establece este metodo por la interfaz fastfoodeable 'sinhacer's
		return this.getPasosPreparacion().TiempoTotal();
	}

	@Override
	public boolean isVegetariano() {
		// Se establece este metodo por la interfaz fastfoodeable 'sinhacer'
		return false;
	}

	@Override
	public Preparacion tipoPreparacion() {
		// Se establece este metodo por la interfaz fastfoodeable 'sinhacer'
		return Preparacion.CRUDO;
	}
	
}
