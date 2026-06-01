package Atividades;
import java.util.Scanner;
public class Atividade12 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num1, num2,sinal;
	System.out.println("informe o primeiro número");
	num1 =sc.nextInt();
	System.out.println("infirme o segundo número");
	num2 = sc.nextInt();
	System.out.println ("escolha um sinal");
	System.out.println ("1- Somar");
	System.out.println ("2- Subtrair");
	System.out.println ("3- multiplicar");
	System.out.println ("4- dividir");
	System.out.println ("5- sair");
	sinal=sc.nextInt();
	if(sinal==1) {System.out.println(num1+num2);}
	if(sinal==2) {System.out.println(num1-num2);}
	if(sinal==3) {System.out.println(num1*num2);}
	if(sinal==4) {System.out.println(num1/num2);}
	if(sinal==5) {System.out.println("Saindo");}
sc.close();}}