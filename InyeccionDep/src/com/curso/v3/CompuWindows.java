package com.curso.v3;

public class CompuWindows  extends Computadora {

	public CompuWindows(String version) {
		super(version);
	}

	@Override
	public void encender() {
		System.out.println("Compu Windows: "+version+
				" Encendida.");
	}
	
}
