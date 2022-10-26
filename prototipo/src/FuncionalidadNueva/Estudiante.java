package FuncionalidadNueva;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private int cantMateriasAP;
	private int ISE;
	private ArrayList<String> materias;
	
	public Estudiante(String nombre,int cantMatAP,int ISE){
		this.nombre=nombre;
		this.cantMateriasAP=cantMatAP;
		this.ISE=ISE;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantMateriasAP() {
		return cantMateriasAP;
	}

	public void setCantMateriasAP(int cantMateriasAP) {
		this.cantMateriasAP = cantMateriasAP;
	}

	public int getISE() {
		return ISE;
	}

	public void setISE(int iSE) {
		ISE = iSE;
	}

	public ArrayList<String> getMaterias() {
		return materias;
	}

	public void setMaterias(ArrayList<String> materias) {
		this.materias = materias;
	}
	
}
