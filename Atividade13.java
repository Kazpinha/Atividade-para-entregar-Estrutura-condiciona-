package Atividades;
import java.util.Scanner;
public class Atividade13 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double a,b,c,delta,x,x1,x2,raiz;
	System.out.println("infome o valor de a");
	a=sc.nextDouble();
	System.out.println("informe o valor de b");
	b=sc.nextDouble();
	System.out.println("informe o valor de c");
	c=sc.nextDouble();
	
	delta=(b*b)-4*a*c;

	raiz=Math.sqrt(delta);
	
	
	System.out.println("O valor de delta será: "+delta);
	if(delta<0) {System.out.println("não existe raiz real");}
	else if(delta==0) {
		x =(-b)/(2*a);
		System.out.println("existe somente um raiz real: "+ x);}
	else if (delta>0) {
		x1= (-b+raiz)/(2*a);
		x2= (-b-raiz)/(2*a);	
		System.out.println("existem duas raizes reais: ");}
	sc.close();}}