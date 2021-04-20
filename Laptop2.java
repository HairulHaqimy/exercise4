
import java.util.Scanner;

	public class Laptop2 {
		
			String brand;
			String colour;
			int quantity, storage;
			double price, totalprice;
			
			Scanner scan = new Scanner(System.in);
			
			Laptop2(){
				System.out.print("Please enter the laptop brand(Asus/Lenovo): ");
				this.brand = scan.nextLine();
				System.out.print("Please enter the laptop colour(black / silver): ");
				this.colour = scan.nextLine();
				System.out.print("Please enter the storage(16/8): ");
				this.storage = scan.nextInt();
				if (brand.equalsIgnoreCase("Asus")) {
					if (colour.equalsIgnoreCase("black")) {
						if (storage == 16) {
							this.price = 3000;
						}
						else if (storage == 8) {
							this.price = 2500;
						}
					}
					else if (colour.equalsIgnoreCase("silver")) {
						if (storage == 16) {
							this.price = 3000;
						}
						else if (storage == 8) {
							this.price = 2500;
						}
					}
				}
				else if (brand.equalsIgnoreCase("Lenovo")) {
					if (colour.equalsIgnoreCase("black")) {
						if (storage == 16) {
							this.price = 2800;
						}
						else if (storage == 8) {
							this.price = 2300;
						}
					}
					else if (colour.equalsIgnoreCase("silver")) {
						if (storage == 16) {
							this.price = 2800;
						}
						else if (storage == 8) {
							this.price = 2300;
						}
					}
				}
				System.out.print("Please enter the quantity: ");
				this.quantity = scan.nextInt();
				this.totalprice = this.price * this.quantity;
				System.out.println();
			}
			
			Laptop2(String brand, String colour, int quantity, int storage){
				this.brand = brand;
				this.colour = colour;
				this.storage = storage;
				if (brand.equalsIgnoreCase("Asus")) {
					if (colour.equalsIgnoreCase("black")) {
						if (storage == 16) {
							this.price = 3000;
						}
						else if (storage == 8) {
							this.price = 2500;
						}
					}
					else if (colour.equalsIgnoreCase("silver")) {
						if (storage == 16) {
							this.price = 3000;
						}
						else if (storage == 8) {
							this.price = 2500;
						}
					}
				}
				else if (brand.equalsIgnoreCase("Lenovo")) {
					if (colour.equalsIgnoreCase("black")) {
						if (storage == 16) {
							this.price = 2800;
						}
						else if (storage == 8) {
							this.price = 2300;
						}
					}
					else if (colour.equalsIgnoreCase("silver")) {
						if (storage == 16) {
							this.price = 2800;
						}
						else if (storage == 8) {
							this.price = 2300;
						}
					}
				}
				this.quantity = quantity;
				this.totalprice = this.price * this.quantity;
				System.out.println();
			}
			
	}
