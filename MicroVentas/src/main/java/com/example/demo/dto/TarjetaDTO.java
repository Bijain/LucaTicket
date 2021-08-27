package com.example.demo.dto;

public class TarjetaDTO {

	private String numero;
	private double saldo;
	
	public TarjetaDTO() {
		super();
	}

	public TarjetaDTO(String numero, double saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "TargetaDTO [numero=" + numero + ", saldo=" + saldo + "]";
	}
}
