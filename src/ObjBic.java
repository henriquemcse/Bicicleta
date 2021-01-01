
public class ObjBic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClasseBicicleta minhaB;
		minhaB = new ClasseBicicleta();
		// minhaB.marca = "Monark";
		
		String teste = minhaB.Marca(false);
		System.out.println(teste);
			//System.out.println(minhaB.Marca);
		System.out.println(minhaB.Cor(2));
		System.out.println(minhaB.Genero(true));
		
		System.out.println(minhaB.ns = 111);
		System.out.println("*****************************");
	
		
		

		
		ClasseBicicleta suaB;
		
		suaB = new ClasseBicicleta();
		
		/*/
		System.out.println(suaB.marca = "Caloi");
		System.out.println(suaB.Genero(true));
		System.out.println(suaB.Cor(1));
		System.out.println(suaB.ns = 222);
		System.out.println(suaB.Cor(2));
		System.out.println("*****************************");
		/*
		minhaB = suaB;
		System.out.println(minhaB.marca);
		System.out.println(minhaB.ns);
		System.out.println();
		System.out.println("*****************************");
		*/
		
	}
}