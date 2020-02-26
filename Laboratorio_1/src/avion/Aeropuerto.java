package avion;

public class Aeropuerto {
	private final AvionI avion;

	public Aeropuerto(AvionI avion) {
		this.avion = avion;
		
	}

	public void takingOff() {
		System.out.println("Despegando: " + avion.tipo());
	}
}
