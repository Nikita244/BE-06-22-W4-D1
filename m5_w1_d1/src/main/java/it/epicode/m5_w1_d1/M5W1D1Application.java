package it.epicode.m5_w1_d1;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.epicode.m5_w1_d1_springboot.beans.Condimento;
import it.epicode.m5_w1_d1_springboot.beans.Drinks;
import it.epicode.m5_w1_d1_springboot.beans.Franchise;
import it.epicode.m5_w1_d1_springboot.beans.HawaiianPizza;
import it.epicode.m5_w1_d1_springboot.beans.PizzaMargherita;
import it.epicode.m5_w1_d1_springboot.beans.SalamiPizza;


@SpringBootApplication
public class M5W1D1Application {

	public static void main(String[] args) {
		SpringApplication.run(M5W1D1Application.class, args);
		
		//System.out.println("Hello World");
		makePizza();
	}
	public static void makePizza() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.scan("it.epicode.m5_w1_d1_springboot.beans");
        ctx.refresh();
  
        
        System.out.println(" ");
        System.out.println("*** PIZZAS ***");
        System.out.println(" ");
        //MARGHERITA
        PizzaMargherita p1 = (PizzaMargherita)ctx.getBean("pizzamargherita" , "Margherita" ,null, 1104, 4.99);
        
        //HAWAIIAN PIZZA
        HawaiianPizza p2 = (HawaiianPizza)ctx.getBean("hawaiian", "Hawaiian Pizza",null, 1024, 6.49 );
        
        //SALAMI PIZZA
        SalamiPizza p3 = (SalamiPizza)ctx.getBean("salami", "Salami Pizza", null, 1160, 5.99);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        
        
        System.out.println(" ");
        System.out.println("*** TOPPINGS ***");
        System.out.println(" ");
        Condimento cheese = (Condimento)ctx.getBean("condimento","Cheese", 92, 0.69);
        Condimento ham = (Condimento)ctx.getBean("condimento","Ham", 35, 0.99);
        Condimento Onions = (Condimento)ctx.getBean("condimento","Onions", 22, 0.69);
        Condimento Pineapple = (Condimento)ctx.getBean("condimento","Pineapple", 24, 0.79);
        Condimento Salami = (Condimento)ctx.getBean("condimento","Salami", 86, 0.99);
        ArrayList<Condimento> listaToppings = new ArrayList<Condimento>(Arrays.asList(cheese, ham, Onions, Pineapple, Salami  ));
        
        for(Condimento c : listaToppings) {
        	System.out.println(c.toString());
        }
        
        System.out.println(" ");
        System.out.println("*** DRINKS ***");
        System.out.println(" ");
        Drinks Lemonade = (Drinks)ctx.getBean("drinks","Lemonade", 0.33, null, 128, 1.29 );
        Drinks Water = (Drinks)ctx.getBean("drinks","Water", 0.50, null, 0, 1.29 );
        Drinks Wine = (Drinks)ctx.getBean("drinks","Wine", 0.75, 13, 607, 7.49 );
        ArrayList<Drinks> listaDrinks = new ArrayList<Drinks>(Arrays.asList(Lemonade, Water, Wine ));
        
        for(Drinks d : listaDrinks) {
        	System.out.println(d.toString());
        }
        
        System.out.println(" ");
        System.out.println("*** FRANCHISE ***");
        System.out.println(" ");
        Franchise Shirt = (Franchise)ctx.getBean("franchise", "Shirt", 21.99);
        Franchise Mug = (Franchise)ctx.getBean("franchise", "Mug", 4.99);
        ArrayList<Franchise> listaFranchise = new ArrayList<Franchise>(Arrays.asList(Shirt,Mug ));
        
        for(Franchise f : listaFranchise) {
        	System.out.println(f.toString());
        }
        
        
        ctx.close();
	}

}
