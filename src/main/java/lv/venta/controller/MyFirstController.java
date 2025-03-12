package lv.venta.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lv.venta.model.Product;

@Controller
public class MyFirstController {

		
		@GetMapping("/simple") //localhost:8080/simple
		public String getControllerSimple() {
			System.out.println("Simple Controller is called");
			return "simple-page";
			
		}
		
		
		
		@GetMapping("/data") //localhost:8080/data
		public String getControllerData(Model model) {
			Random rand = new Random();
			System.out.println("Data controller is called");
			String data = "Polats Didzis : " + rand.nextInt(0,11);
			model.addAttribute("box", data);
			return "data-page";
		}
		@GetMapping("/testproduct") // localhost:8080/testproduct
		public String getControllerSendProduct(Model model) {
			Product testProduct = new Product("Banana", 1.99f, "Eco, yellow, tropical", 5);
			model.addAttribute("box", testProduct);
			return "one-product-page"; //it will show an one-product-page.html with test product
			
			
		}
			
		
	
	//TODO
		//create new controler function as a get
		// create a new product
		//add this product in model
		//specify which html file should be 
		//create the html file
	


}