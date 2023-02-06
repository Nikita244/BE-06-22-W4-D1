package it.epicode.m5_w1_d1_springboot.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component("pizzamargherita")
@Scope("prototype")
public class PizzaMargherita extends Pizza{
	
	public PizzaMargherita (String name, Condimento c,int calorie, double prezzo) {
		setNomePizza(name); 
		setCondimento(c);
		setCalorie(calorie);
		setPrezzo(prezzo);
		
	}
	
	@Override
	public String toString() {
		return getNomePizza() + " " + IngredientsList().toString() + " Calorie: " + getCalorie()
				 + " Prezzo: " + getPrezzo();
	}



}