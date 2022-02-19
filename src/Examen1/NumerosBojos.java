package Examen1;

import java.util.Scanner;

public class NumerosBojos {

	public static void main(String[] args) {

		int a,b; //Declaració dels 2 nombres enters
		int res1= 0,res3 =0;
		double res2= 0;
		
		Scanner inputScanner = new Scanner (System.in);
		
		a = inputScanner.nextInt();
		b = inputScanner.nextInt();
				
		if(a!=b &&(a%2==0 && b%2==0)) {		//Si els 2 son parells i diferents es fa una divisió entera
			if(a==0 || b==0) {//Si un nombre es 0, la divisió sera 0
				res1 =0;
			}
			else	{ //Si son diferents a 0, es fa l'operació
				res1= a/b;
			}
			System.out.println(res1);
		}
		else if(a%2!=0 && b%2!=0) {	//Si els 2 son senars, resta el valor més gran menys el petit
			if(a>b) {
				res1= a-b;
			}else {
				res1= b-a;
			}
			System.out.println(res1);
			
		}
		
		if (a>10 || b>10) {	//Si qualsevol es més gran a 10, es fa el residu de dividir el gran pel petit
			if(a==0 || b==0) {//Si un nombre es 0, la divisió sera 0
				res2 =0;
			}else {
				if(a>b) {
					res2= a%b;
				}else {
					res2= b%a;
				}
			}
			
			System.out.println(res2);		
			
		}

		if(a<20 && b<20) {//Si son més petits a 20, es multipliquen
			res3 = a*b;
			System.out.println(res3);
		}

			
	}

}
