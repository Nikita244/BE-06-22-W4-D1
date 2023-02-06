package it.epicode.m5_w1_d1_springboot.beans;

import java.util.ArrayList;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component("salami")
@Scope("prototype")
public class SalamiPizza extends Pizza{
	
	public SalamiPizza(String name, Condimento c, int calorie, double prezzo) {
		setNomePizza(name); 
		setCondimento(c);
		setCalorie(calorie);
		setPrezzo(prezzo);
	}
	
	private ArrayList<String> addMore(){
		ArrayList<String> lista = IngredientsList();
		lista.add("salami");
		
		return lista;
	}

	
	@Override
	public String toString() {
		return getNomePizza() + " " + addMore().toString() + " Calorie: " + getCalorie()
				 + " Prezzo: " + getPrezzo();
	}

}
