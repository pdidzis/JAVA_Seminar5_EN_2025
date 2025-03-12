package lv.venta.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
	
	
	


}