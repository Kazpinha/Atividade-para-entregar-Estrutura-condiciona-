package Atividades;
import java.util.Scanner;
public class Atividade10 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int semana;
	System.out.println("digite um numero corespondente a um dia da semana");
	semana =sc.nextInt();
	if(semana==1) {System.out.println("Domingo");}
	if(semana==2) {System.out.println("Segunda");}
	if(semana==3) {System.out.println("Terça");}
	if(semana==4) {System.out.println("Quarta");}
	if(semana==5) {System.out.println("Quinta");}
	if(semana==6) {System.out.println("Sexta");}
	if(semana==7) {System.out.println("Sabado");}
	if(semana<1 || semana>7) {System.out.println("Invalido");}
	
	
	
sc.close();}}