package com.curso.v0;

public class CompuLinux {

	String version;

	public CompuLinux(String version) {
		this.version = version;
	}

	public void encender() {
		System.out.println("Compu Linux: "+version+
				" Encendida.");
		
	}
	
}
