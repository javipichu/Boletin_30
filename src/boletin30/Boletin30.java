
package boletin30;

import java.util.ArrayList;

/**
 * @author raguiarperez
 */
public class Boletin30 {
// ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a la que pertenezca el objeto
    public static ArrayList integrantes = new ArrayList();

    public static void main(String[] args) {
            
        SeleccionFutbol Guardiola= new Entrenador("vicente","Del Bosque",60,1,2678);
        SeleccionFutbol iniesta = new Futbolista("Interior Derecho","Andres", "Iniesta", 29,6,2679);
	SeleccionFutbol raulMartinez = new Masajista("Licenciado en Fisioterapia","Raúl", "Martinez",19,1,2630);

		integrantes.add(Guardiola);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);

		// CONCENTRACION
		System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.concentrarse();
		}

		// VIAJE
		System.out.println("nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.viajar();
		}

		// ENTRENAMIENTO
		System.out.println("nEntrenamiento: Todos los integrantes tienen su función en un entrenamiento (Especialización)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.entrenar();
		}

		// PARTIDO DE FUTBOL
		System.out.println("nPartido de Fútbol: Todos los integrantes tienen su función en un partido (Especialización)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.jugarPartido();
		}

		// PLANIFICAR ENTRENAMIENTO
		System.out.println("nPlanificar Entrenamiento: Solo el entrenador tiene el método para planificar un entrenamiento:");
		System.out.print(delBosque.getNombre() + " " + delBosque.getApellidos() + " -> ");
		((Entrenador) delBosque).planificarEntrenamiento();

		// ENTREVISTA
		System.out.println("nEntrevista: Solo el futbolista tiene el método para dar una entrevista:");
		System.out.print(iniesta.getNombre() + " " + iniesta.getApellidos() + " -> ");
		((Futbolista) iniesta).entrevista();

		// MASAJE
		System.out.println("nMasaje: Solo el masajista tiene el método para dar un masaje:");
		System.out.print(raulMartinez.getNombre() + " " + raulMartinez.getApellidos() + " -> ");
		((Masajista) raulMartinez).darMasaje();

	}
}