package instrumentos;

import java.util.ArrayList;
import java.util.Iterator;

public class Orquesta {

	private ArrayList <InstrumentoDeViento> vientos;
	private ArrayList <InstrumentoDeCuerdas> cuerdas;
	
	public Orquesta() {
		this.cuerdas = new ArrayList <InstrumentoDeCuerdas>();
		this.vientos = new ArrayList <InstrumentoDeViento>();
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList <InstrumentoDeCuerdas> getCuerdas() {
		ArrayList<InstrumentoDeCuerdas> nuevo = ((ArrayList <InstrumentoDeCuerdas>) this.cuerdas.clone());
		return nuevo;
	}
	
	public void setCuerdas(ArrayList <InstrumentoDeCuerdas> cuerdas) {
		this.cuerdas = cuerdas;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList <InstrumentoDeViento> getVientos(){
		ArrayList<InstrumentoDeViento> nuevo = ((ArrayList <InstrumentoDeViento>) this.vientos.clone());
		return nuevo;
	}
	
	public void setVientos(ArrayList <InstrumentoDeViento> vientos) {
		this.vientos = vientos;
	}
	
	public boolean add(InstrumentoDeCuerdas cuerda) {
		try {
			this.cuerdas.add(cuerda);
		}
		catch (Exception e){
			return false;
		}
		return true;
	}
	
	public boolean add(InstrumentoDeViento viento) {
		try {
			this.vientos.add(viento);
		}
		catch (Exception e){
			return false;
		}
		return true;
	}
	
	public void tocarVientos() {
		System.out.println("Tocando instrumentos de viento: ");
		Iterator <InstrumentoDeViento> vientos = this.vientos.iterator();
		while(vientos.hasNext()) {
			InstrumentoDeViento viento = vientos.next();
			System.out.println(viento.tocar()); 
		}
	}
	
	public void tocarCuerdas() {
		System.out.println("Tocando instrumentos de cuerda: ");
		Iterator <InstrumentoDeCuerdas> cuerdas = this.cuerdas.iterator();
		while(cuerdas.hasNext()) {
			InstrumentoDeCuerdas cuerda = cuerdas.next();
			System.out.println(cuerda.tocar());
		}
	}
	
	public void tocar() {
		System.out.println("Tocando todos los instrumentos de la orquesta: ");
		this.tocarVientos();
		this.tocarCuerdas();
	}
	
	public static void main(String[] args) {
		Orquesta orquesta = new Orquesta();
		
		Tuba tuba = new Tuba();
		Banjo banjo = new Banjo();
		Oboe oboe = new Oboe();
		Flauta flauta = new Flauta();
		Laud laud = new Laud();
		
		ArrayList <InstrumentoDeCuerdas> listaCuerdas = new ArrayList <InstrumentoDeCuerdas>();
		listaCuerdas.add(laud);
		listaCuerdas.add(banjo);
		
		ArrayList <InstrumentoDeViento> listaVientos = new ArrayList <InstrumentoDeViento>();
		listaVientos.add(oboe);
		listaVientos.add(tuba);
		listaVientos.add(flauta);
		
		orquesta.setCuerdas(listaCuerdas);
		orquesta.setVientos(listaVientos);
		
		orquesta.add(new Banjo());
		orquesta.add(new Laud());
		orquesta.add(new Tuba());
		orquesta.add(new Flauta());
		orquesta.add(new Oboe());

		orquesta.tocar();
	}

}
