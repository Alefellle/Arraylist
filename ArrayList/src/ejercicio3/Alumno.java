package ejercicio3;

public class Alumno {
	private  String  Nombre;
	private Double nota;
	
	
	public Alumno(String Nombre,Double nota) {
		super();
		this.Nombre = Nombre;
		this.nota = nota;
	}
	
	
	public  String getNombre() {
		return Nombre;
	}
	public  Double getNota() {
		return nota;
	}


	@Override
	public String toString() {
		return "Alumno [Nombre=" + Nombre + ", nota=" + nota + "]";
	}
	
	

}
