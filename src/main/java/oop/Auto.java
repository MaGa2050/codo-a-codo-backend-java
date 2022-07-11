package oop;

//nombre clase
public class Auto {
//atributos de la clase	
	private String color;
	private int anio;
	private long serie;
	private String marca;
	private String modelo;
	private float velocidad;
	private float velocidadMaxima;
	private boolean encendido;
	
	private Motor motor;

	
	
	

	
	
	
	// constructor
	 public Auto() {
		this.setVelocidad(0);
		//anio = 2022;
		this.setAnio(2022);
		//this.setMarca("Sin Marca");
		//this.setModelo("Sin Modelo");
		this.setEncendido(false);
		this.setVelocidadMaxima(velocidadMaxima);
		this.setMotor(motor);

	}
	
	// metodos

	public void setMotor(Motor motor) {
		if(motor == null) {
			Motor motorInterno = new Motor("default", 100f);
			this.motor = motorInterno;
		}else {
			this.motor = motor;
		}
	}
	public Motor getMotor() {
		return this.motor;
	}
	 
	private void setAnio(int i) {
		
	}



	void encender() {
		if(!this.isEncendido()) {
		this.setEncendido(true);	
		System.out.println("Se encendió el auto");
		}else {
			System.out.println("Ya está encendido");
		}
	}

	void apagar() {
		if(this.isEncendido()) {
			//boolean isAlgo() Boolean getAlgo()
		//encendido = false;	
			this.setEncendido(false);
		System.out.println("Se apagó el auto");
		}
		else {
			System.out.println("Ya está apagado, no se puede apagar dos veces");
			}
	}

	public void acelerar() {
		if(this.isEncendido()) {
			if(this.getVelocidad() < this.getVelocidadMaxima()) {
				this.setVelocidad(this.getVelocidad() + 1) ;
			}else {
			System.out.println("No se puede superar la velocidad maxima");
		}
		}else {
			System.out.println("Debe enceder el auto");
		}

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public long getSerie() {
		return serie;
	}

	public void setSerie(long serie) {
		this.serie = serie;
	}
	public float setVelocidad() {
		return velocidad;
	}


	public float getVelocidad() {
		return velocidad;
	}

	private void setVelocidadMaxima(float velocidad) {
		if(velocidadMaxima < 0) {
			this.velocidad = 0;
		if(velocidadMaxima > 220)
		 {
			this.velocidad = 220;	
		}
	}
		
	}

	public float getVelocidadMaxima() {
		return velocidadMaxima;
	}

	private void setVelocidad(float velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public int getAnio() {
		return anio;
	}

	public String getModelo() {
		return modelo;
	}

	public void frenar() {
		if(this.isEncendido()) {
			if(this.getVelocidad()> 0) {
				this.setVelocidad(this.getvelocidad() - 1);
			}
		}

	}

	private int getvelocidad() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getMarca() {
		// byte < short < int < long < float < double
		//Byte < Short < Integer < Long < float < Double wrapper (envoltorio)
		// por defecto sus objetos son null, si no le damos un valor
		// String edad = '10' --- int edadInt = Integer.parseInt(edad);
		// if(marca == null)
		//	return "S/M";
		//return marca
		
		/*String aux = '';
		 * if(marca == null)
		 * aux = 'S/M';
		 * return aux;*/
		//en una sola linea
		return marca == null ? "" : marca; // nul - "" - algo ..... wrapper
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}

// alt + shift + s se abre menu



}





