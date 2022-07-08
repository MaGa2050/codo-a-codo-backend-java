package oop;

public class FabricaDeAutos {

	public static void main(String[] args) {

		//crear primer objeto de cla clase AUto
		Auto fiatUno = new Auto();
		
		//quiero saber la velocidad del auto cuando es creado
		
		//fiatUno.encender();
		fiatUno.encender();
		fiatUno.acelerar();
		
		fiatUno.apagar();
		System.out.println(fiatUno.getMarca());
		
		
		//String marcaAuto = fiatUno.marca();
		//System.out.println(marcaAuto);
		//cuando pongo aquí fiatUno.velocidad me dice que en le main no está velocidad
		//fiatUno.velocidad();
		//System.out.println(fiatUno.anio());
		
		System.out.println("fin");
	}

}
 