package Atividades;
import java.util.Scanner;
public class Atividade8 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int idade;
	System.out.println("digite a idade do nadador");
	idade = sc.nextInt();
	if (idade >0 &&idade<=7) {System.out.println("infantil");}
	else if (idade>=8 && idade <=10) {System.out.println("juvenil");}
	else if (idade>=11 && idade <=15) {System.out.println("adolescente");}
	else if (idade>=16 && idade <=30) {System.out.println("adulto");}
	else if (idade>30) {System.out.println("senior");}
	else if (idade <0) {System.out.println("idade invalida tente novamente");}
	sc.close();}}