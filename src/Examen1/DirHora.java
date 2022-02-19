package Examen1;

import java.util.Scanner;

public class DirHora {

	public static void main(String[] args) {
		
		//Valida hora
		int hora,minuts; //Declaració dels 2 nombres enters per introduir la hora
		int min, time, time2, time3;//variables per guardar els calculs
		
		Scanner inputScanner = new Scanner (System.in);
		
		hora = inputScanner.nextInt();
		minuts = inputScanner.nextInt();
		
		if((hora>=0 && hora<=23)&&(minuts>=0 && minuts<=59)) {//Valida hora
			
			if(hora>=0 && hora<=6) {
				System.out.println("MATINADA");
			}else if(hora>6 && hora<=14) {
				System.out.println("MATI");
			}else if (hora>14 && hora<=20) {
				System.out.println("TARDA");
			}else if (hora>20 && hora<=23) {
				System.out.println("NIT");
			}
		
			min= (hora*60) + minuts;	//Transforma a minuts
			time = 1440-min;	//Temps restant
			time2 = time/60;	//Hores restants
			time3 = time%60;	//Minuts restants
			if(time2<10 && time3 <10)System.out.println("Queden 0"+time2+":0"+time3+" per finalitzar el dia");
			else if(time2<10)System.out.println("Queden 0"+time2+":"+time3+" per finalitzar el dia");
			else if(time3<10)System.out.println("Queden "+time2+":0"+time3+" per finalitzar el dia");
			else System.out.println("Queden "+time2+":"+time3+" per finalitzar el dia");
			//Si els minuts o les hores sol té una xifra, es posa un 0 al davant
			
		}else {
			System.out.println("L'hora que has introduit no son correctes");
		}

	}

}
