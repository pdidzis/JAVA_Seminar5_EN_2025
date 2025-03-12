package lv.venta.model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Product {
	//1.variables
	private long id;  //TODO AutoIncreament from DB
	private String title;
	private float price;
	private String description;
	private int quantity;
	//2.getters - lombok
	//3.setters - lombok
	//4.no argument constructor
	//5.argument constructors
	public Product(String inputTitle, float inputPrice, String inputDescription, int inputQuantity) {
		setTitle(inputTitle);
		setPrice(inputPrice);
		setDescription(inputDescription);
		setQuantity(inputQuantity);
	}
	//6. toString function - lombok
	//7, other functions (if it is neccessary)
	

}
