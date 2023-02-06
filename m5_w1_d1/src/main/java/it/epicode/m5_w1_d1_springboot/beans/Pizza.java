package it.epicode.m5_w1_d1_springboot.beans;

import java.util.ArrayList;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.epicode.m5_w1_d1_springboot.beans.Condimento;
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
@Component
@Scope("prototype")
public abstract class Pizza {

    private String nomePizza;
    private Condimento condimento;
    private double prezzo;
    protected ArrayList<String> listaIngr;
    private int calorie;
    
    
    
    public  ArrayList<String> IngredientsList() {
    	listaIngr = new ArrayList<String>();
        listaIngr.add("tomato");
        listaIngr.add("cheese");
        return listaIngr;
    }
    
   

    public double getPrezzoTot() {
        return (condimento !=null) ? prezzo + condimento.getPrezzo() : prezzo;
    }
    

}