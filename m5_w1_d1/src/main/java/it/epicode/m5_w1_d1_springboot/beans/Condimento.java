package it.epicode.m5_w1_d1_springboot.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component("condimento")
@Scope("prototype")
public class Condimento {
	String nome;
	int calorie;
	double prezzo;
	
	
	@Override
	public String toString() {
		return getNome() + " Calorie: " + getCalorie()
				 + " Prezzo: " + getPrezzo();
	}
}
