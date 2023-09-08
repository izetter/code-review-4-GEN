import java.util.Scanner; // Importar el Scanner para leer la entrada del usuario

public class PiedraPapelTijeras {
	public static void main(String[] args) {

		// Poner nombre de variable descriptiva
		Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario

		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		String jugador1 = scanner.nextLine(); 	// Poner nombre de variable descriptiva y usar el Scanner

		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
		String jugador2 = scanner.nextLine(); 	// Poner nombre de variable descriptiva y usar el Scanner

		if (jugador1.equals(jugador2)) {
			System.out.println("Empate");
		} else {
			// Poner nombre de variables descriptivos
			// Usar una función cuya función, valga la redundancia, sea determinar el ganador
			int ganador = determinarGanador(jugador1, jugador2);
			if (ganador == 0) {
				System.out.println("Entrada no válida. Debes escribir 'piedra', 'papel' o 'tijeras'.");
			} else {
				System.out.println("Gana el jugador " + ganador);
			}
		}
	}

	// Función para determinar el ganador, regresa el número del jugador ganadro, cero si error
	public static int determinarGanador(String jugador1, String jugador2) {
		switch (jugador1) {
			case "piedra":
				return (jugador2.equals("tijeras")) ? 1 : 2;
			case "papel":
				return (jugador2.equals("piedra")) ? 1 : 2;
			case "tijeras":
				return (jugador2.equals("papel")) ? 1 : 2;
			default:
				return 0;
		}
	}
}