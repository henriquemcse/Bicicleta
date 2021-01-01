/**
 * 
 */

/**
 * @author chdut
 *
 */
public class ClasseBicicleta {
	int ns;
	String marca;
	String modelo;
	int aro;
	int cor;

	String Cor(int c) {

		switch (c) {
		case 1:
			return "Vermelho";
		case 2:
			return "Azul";
		case 3:
			return "Verde";
		default:
			return "Prata";
		}

	}

	String Genero(boolean g) {
		if (g) {
			return "Homem";
		} else {
			return "Mulher";
		}

	}

	String Marca(boolean m) {
		if (m) {
			return "Monark";
		} else {
			return "Caloi";
		}

	}

}
