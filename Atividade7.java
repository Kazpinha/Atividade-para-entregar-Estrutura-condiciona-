package Atividades;
import java.util.Scanner;
public class Atividade7 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double salario,ajuste;
	System.out.println("digite seu salario");
	salario= sc.nextDouble();
	if (salario<1000.00) {
	ajuste = salario*0.3+(salario);

	System.out.println("o seu salario ajustado será: "+ ajuste);}
	else if (salario>1000) {
		System.out.println("Você não recebera ajuste");
	}
	sc.close();}}