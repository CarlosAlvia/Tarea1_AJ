package FuncionalidadNueva;

import java.util.ArrayList;

public class Funcion {
	private Estudiante estudiante;
	
	public void realizarRegistro() {
		ArrayList<String> materias=new ArrayList<>();
		materias.add("Matem�ticas Discretas RP");
		materias.add("Dise�o de Software <3");
		materias.add("Comunicaci�n");
		materias.add("�lgebra Lineal");
		estudiante.setMaterias(materias);
		System.out.println("Se ha registrado en 4 materias");
	}
	public void realizarCotizacionMaterias(){
		final int COSTO=50;
		if(!estudiante.getMaterias().isEmpty()){
			System.out.println("Debe cancelar $"+COSTO*estudiante.getMaterias().size()*estudiante.getISE());
		}else {
			System.out.println("Debe cancelar $0");
		}
	}
	public void realizarRetiroDeMateria(String materia) {
		if(estudiante.getMaterias().contains(materia)){
			estudiante.getMaterias().remove(materia);
			System.out.println("Se elimin� la materia");
		}else{
			System.out.println("No se encontr� la materia");
		}
	}
	public void realizarConsultaAPS() {
		System.out.println("Ha aprobado "+estudiante.getCantMateriasAP()+" materias");
	}
	public static void main(String[] args){
		Funcion f=new Funcion();
		f.estudiante=new Estudiante("David Jurado",20,3);
		f.realizarRegistro();
		f.realizarCotizacionMaterias();
		f.realizarRetiroDeMateria("Matem�ticas Discretas RP");
		f.realizarConsultaAPS();
	}
}
