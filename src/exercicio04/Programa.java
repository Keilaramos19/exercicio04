package exercicio04;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		Conta cont;
			
		System.out.print("O Numero da Conta:");
		Integer numeroDaConta= sc.nextInt();
			
		System.out.print("O Titular da Conta:");
		sc.nextLine();
		String titular=sc.nextLine();
			
		System.out.println("Titular da Conta: (y/n)");
		char confirma=sc.next().charAt(0);
			
			
		if (confirma=='y') {
			System.out.println("Deposito Incial:");
			double depInicial=sc.nextDouble();
			cont= new Conta(numeroDaConta,titular,depInicial);
		}
		else {
			cont=new Conta(numeroDaConta,titular);
			}
			System.out.println();
			System.out.println("Dados da Conta:");
			System.out.println(cont);
			
			System.out.println();
			System.out.print("Digite o valor do deposito:");
			double deposito=sc.nextDouble();
			cont.deposito(deposito);
			
			System.out.print("Atualização dos Dados da Conta:");
			System.out.print(cont);
			
			System.out.println();
			System.out.print("Digitar um valor de retirada:");
			double retirarValor=sc.nextDouble();
			cont.retirar(retirarValor);
			System.out.println("Atualização dos Dados da Conta:");
			System.out.println(cont);
			
			sc.close();

		}

}


