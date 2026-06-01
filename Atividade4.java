package Atividades;
import java.util.Scanner;
public class Atividade4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x,y,z;
	System.out.println("digite um número pra o primeiro lado de um triangulo");
	x=sc.nextInt();
	System.out.println("digite um número pra o segundo lado de um triangulo");
	y=sc.nextInt();
	System.out.println("digite um número pra o terceiro lado de um triangulo");
	z=sc.nextInt();
	
	if(x<z+y && z<x+y && y<z+x ) {System.out.println("Você formou um triangulo");}
	else 
		System.out.println("Você não formou um triangulo");
	
sc.close();}}