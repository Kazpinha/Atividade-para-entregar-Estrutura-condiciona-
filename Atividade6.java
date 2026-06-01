package Atividades;
import java.util.Scanner;
public class Atividade6 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double altura,imc,peso;
	
	
	System.out.println("Digite seu peso em kg");
	peso = sc.nextDouble();
	System.out.println("Digite sua altura");
	altura =sc.nextDouble();
	imc=peso/(altura*altura);
	if (imc<20) {
	System.out.println("Abaixo do peso");}
	else if (imc>20 &&imc<25) {
	System.out.println("peso normal");}
	else if (imc>25 &&imc<30) {
	System.out.println("sobre peso");}	
	else if (imc>30 &&imc<40) {
	System.out.println("obeso");}
	else if (imc>=40 ) {
		System.out.println("obeso motbido");}
	sc.close();}}
	