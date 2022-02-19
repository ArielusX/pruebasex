package Examen1;

import java.util.Scanner;

public class CodisPostals {

	public static void main(String[] args) {
		
		String codi;
		String barri = null;	
		Scanner inputScanner = new Scanner (System.in);
		codi = inputScanner.nextLine();
		
		//Descarta codis no valids
		if(codi.equals("08201")||codi.equals("08202")||codi.equals("08203")||codi.equals("08204")||codi.equals("08205")||codi.equals("08206")||codi.equals("08207")||codi.equals("08208")) {
			switch (codi) {//Busca a quin barri pertany
			case "08201": barri = "Centre";break;
			case "08202": barri = "Torre Romeu"; break;
			case "08203": barri = "Eixample";break;
			case "08204": barri = "Creu de Barberà"; break;		
			case "08205": barri = "Gràcia";break;
			case "08206": barri = "Can Rull"; break;
			case "08207": barri = "Can'Oriac";break;
			case "08208": barri = "Creu Alta"; 
			}
			System.out.println(barri);
		}else {
			System.out.println("Codi no trobat");
		}

		

}
}
