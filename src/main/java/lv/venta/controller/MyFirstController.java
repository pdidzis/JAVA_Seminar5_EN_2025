package lv.venta.controller;

import java.util.ArrayList;
import java.util.Arrays;
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
		
		@GetMapping("/shoppingcart") // localhost:8080/shoppingcart
		public String getControllerShopingCart(Model model) {
			ArrayList<Product> shoppingCart = new ArrayList<Product>(
					Arrays.asList(
					new Product("Apple", 2.99f, "Green , healthy", 15),
					new Product("Milk", 1.4f, "Fresh , healthy", 30))
					);
			//Product testApple = new Product("Apple", 2.99f, "Green , healthy", 15);
			//Product testMilk = new Product("Milk", 1.4f, "Fresh , healthy", 30);
			
			//shoppingCart.addAll(Arrays.asList(testApple, testMilk));
			model.addAttribute("box", shoppingCart);
			
			return "shopping-cart"; 
		}
		
			
		
	
	//TODO
		//delcare controller function as get
		//create arraylist for prodcuts
		//add some products in the arraylist
		//save arraylist in the box
		//specify the html what will be showed
		//create html file
		// test controller


}