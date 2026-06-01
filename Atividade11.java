package Atividades;
import java.util.Scanner;
public class Atividade11 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int mes;
	System.out.println("digite um numero corespondente a um mes do ano");
	mes =sc.nextInt();
	if(mes==1) {System.out.println("Janeiro");}
	if(mes==2) {System.out.println("Fevereiro");}
	if(mes==3) {System.out.println("Março");}
	if(mes==4) {System.out.println("Abril");}
	if(mes==5) {System.out.println("Maio");}
	if(mes==6) {System.out.println("Junho");}
	if(mes==7) {System.out.println("Julho");}
	if(mes==8) {System.out.println("Agosto");}
	if(mes==9) {System.out.println("Setembro");}
	if(mes==10) {System.out.println("Outubro");}
	if(mes==11) {System.out.println("Novembro");}
	if(mes==12) {System.out.println("Dezembro");}
	if(mes<1 || mes>12) {System.out.println("Invalido");}
	
	
	
sc.close();}}