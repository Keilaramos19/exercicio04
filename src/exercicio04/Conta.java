package exercicio04;

public class Conta {
	
	private int numeroDaConta;
	private String titular;
	private double saldo;
	
	public Conta(int numeroDaConta,String titular) {
		this.numeroDaConta=numeroDaConta;
		this.titular=titular;
	}
	
	public Conta(int numeroDaConta,String titular,double depInicial) {
		this.numeroDaConta=numeroDaConta;
		this.titular=titular;
		deposito(depInicial);
	}
	
	public Integer getNumero() {
		return numeroDaConta;
		
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular=titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void deposito(double quantia) {
		saldo+=quantia;
	}
	public void retirar(double quantia) {
		saldo-=quantia+5.0;
	}
	@Override
	public String toString() {
		return "Conta"
				+numeroDaConta
				+",Titular: "
				+titular
				+", Saldo: $"
				+String.format("%.2f",saldo);
	}
}
