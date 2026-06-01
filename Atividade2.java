package Atividades;
import java.util.Scanner;
public class Atividade2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int nota1,nota2,media;
	
	System.out.println("Digite a primeira nota");
	nota1=sc.nextInt();
	System.out.println("Digite a segunda nota");
	nota2=sc.nextInt();
	media = (nota1+nota2)/2;
	System.out.println("a média das notas é: "+media);
	if(media >=7) {System.out.println("aprovado");}
	else if(media<7) {System.out.println("reprovado");}
sc.close();}}
