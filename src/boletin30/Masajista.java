package boletin30;

/**
 * @author raguiarperez
 */
public class Masajista extends SeleccionFutbol {

    private String titulacion;
    private int añosExperiencia;

    public Masajista(String titulacion, String nombre, String apellidos, int edad,int añosExperiencia, int id) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }
    

	// Constructor, getter y setter

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

	@Override
	public void entrenar() {
		System.out.println("Da asistencia en el entrenamiento (Clase Masajista)");
	}

	public void darMasaje() {
		System.out.println("Da un Masaje");
	}
}