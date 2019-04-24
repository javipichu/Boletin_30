package boletin30;

/**
 *
 * @author raguiarperez
 */
public class Entrenador extends SeleccionFutbol {

    private int idFederacion;
    // Constructor

    public Entrenador(String nombre, String apellidos, int edad,int idFederacion, int id) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }
        

   
        
       // getter y setter

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

	@Override
	public void entrenar() {
		System.out.println("Dirige un entrenamiento (Clase Entrenador)");

	}

	@Override
	public void jugarPartido() {
		System.out.println("Dirige un Partido (Clase Entrenador)");
	}

	public void planificarEntrenamiento() {
		System.out.println("Planificar un Entrenamiento");
	}
}
	