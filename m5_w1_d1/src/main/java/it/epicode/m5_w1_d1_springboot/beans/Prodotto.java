package it.epicode.m5_w1_d1_springboot.beans;

public abstract class Prodotto {
	
	String nome = "";
	double prezzo = 0.00;

	public String getNome() {
		return nome;
	}

	public double getPrezzo() {
		return prezzo;
	}
	
	
}
