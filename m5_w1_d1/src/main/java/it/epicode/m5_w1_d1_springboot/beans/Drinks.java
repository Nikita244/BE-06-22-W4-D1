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
@Component("drinks")
@Scope("prototype")
public class Drinks {

	String nome;
	double litri;
	int volume;
	int calorie;
	double prezzo;
	
	
	@Override
	public String toString() { 
		return getNome() + " " + getLitri() + "l " + (getVolume() != 0 ? getVolume() + "% " : "") + " Calorie: " + getCalorie()
				 + " Prezzo: " + getPrezzo();
	}
}
