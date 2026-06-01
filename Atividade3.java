package Atividades;
import java.util.Scanner;
public class Atividade3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int nota1,nota2,nota3,media;
	
	System.out.println("Digite a primeira nota");
	nota1=sc.nextInt();
	System.out.println("Digite a segunda nota");
	nota2=sc.nextInt();
	System.out.println("Digite a terceira nota");
	nota3=sc.nextInt();
	media = (nota1+nota2+nota3)/3;
	System.out.println("a média das notas é: "+media);
	
	
	if(media >=0 && media<3) {System.out.println("reprovado");}
	else if(media<=3 && media >7) {System.out.println("exame");}
	else if (media >=7 &&media<=10) {System.out.println("aprovado");}
sc.close();}}
