package Atividades;
import java.util.Scanner;
public class Atividade5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double altura,ideal;
	char sexo;
	
	System.out.println("Digite seu sexo M ou H");
	sexo = sc.next().charAt(0);
	System.out.println("Digite sua altura");
	altura =sc.nextDouble();
	if (sexo !='M' && sexo!= 'H') {System.out.println("Invalido");}
	else if (sexo=='H') {
	ideal=(72.7*altura)-58;
	System.out.println("o seu peso ideal é "+ ideal);}
	else if (sexo =='M') {
	ideal =(62.1*altura)-44.7;
	System.out.println("o seu peso ideal é "+ ideal);}
	sc.close();}}