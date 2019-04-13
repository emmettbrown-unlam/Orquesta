package instrumentos;

public abstract class InstrumentoDeCuerdas extends Instrumento {
		
	private int cantidadCuerdas;
	
	public void setCantidadCuerdas(int cantidadCuerdas) {
		this.cantidadCuerdas = cantidadCuerdas;
	}
	
	public int getCantidadCuerdas() {
		return this.cantidadCuerdas;
	}
	
}
