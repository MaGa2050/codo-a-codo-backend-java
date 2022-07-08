package oop2;

import oop.Auto;

public class Main {

	public static void main(String[] args) {
		Auto auto = new Auto(Motor, "Motor");
		
		//quiero definir la marca de mi auto
		
		auto.setMarca("RENAULT");
		
		//auto.setVelocidadMaxima(100);
		auto.getColor();
		auto.getModelo();
		auto.getSerie();
		
		
		System.out.println(auto.getMarca()); //teclear sysout y presionar alt + space
		System.out.println(auto.getVelocidad());

	}

}



