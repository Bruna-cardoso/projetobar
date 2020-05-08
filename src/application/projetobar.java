package application;

import java.util.Locale;
import java.util.Scanner;

public class projetobar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cerveja, refri, espeto;
		char sexo;
		double consumo, conta, couvert, ingresso;
		
		System.out.println("Sexo: ");
		sexo = sc.next().charAt(0);
		
		System.out.println("Quantidade de cervejas: ");
		cerveja = sc.nextInt();
		
		System.out.println("Quantidade de refrigerantes: ");
		refri = sc.nextInt();
		
		System.out.println("Quantidade de espetinhos: ");
		espeto = sc.nextInt();
		
		if (sexo == 'F') {
			ingresso = 8.0;
		}
		else {
			ingresso = 10.0;
		}
		
		consumo = (cerveja * 5.0) + (refri * 3.0) + (espeto * 7.0);
		
		if (consumo > 30.0) {
			couvert = 0.0;
			conta = consumo + ingresso + couvert;
			System.out.println("RELATÓRIO:");
			System.out.printf("Consumo: R$ %.2f%n", consumo);
			System.out.println("Isento de Couvert");
			System.out.printf("Ingresso: R$ %.2f%n", ingresso);
			System.out.println();
			System.out.printf("Valor a pagar: R$ %.2f%n", conta);
		}
		else {
			couvert = 4.0;
			conta = consumo + ingresso + couvert;
			System.out.println("RELATÓRIO:");
			System.out.printf("Consumo: R$ %.2f%n", consumo);
			System.out.printf("Couvert: R$ %.2f%n", couvert);
			System.out.printf("Ingresso: R$ %.2f%n", ingresso);
			System.out.println();
			System.out.printf("Valor a pagar: R$ %.2f%n", conta);
		}
		
		
		sc.close();
	}

}
