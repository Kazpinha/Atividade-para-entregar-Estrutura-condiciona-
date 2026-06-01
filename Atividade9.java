package Atividades;
import java.util.Scanner;
public class Atividade9 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int idade;
	System.out.println("digite a idade do eleitor");
	idade =sc.nextInt();
	if (idade<16) {System.out.println("não eleitor");}
	if(idade>18 && idade<65) {System.out.println("eleitor obrigatorio");}
	if (idade>16&& idade<18||idade>=65) {System.out.println("eleitor facultativo");}
	sc.close();}}