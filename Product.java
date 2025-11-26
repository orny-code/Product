package OOP;

public class Product {
     String productName;
     double price;
     int quantity;

     Product(  String productName, double price, int quantity){
         this.productName=productName;
         this.price=price;
         this.quantity=quantity;
     }

    double calculatePrice(){
         return price*quantity;
    }

    public void displayInfo(){
        System.out.println("Product Name is: " +productName);
        System.out.println("Price is: " +price);
        System.out.println("Quantity is: " +quantity);
        System.out.println("Total price is: "+calculatePrice() );

    }

    public static void main(String[] args){
         Product p1 = new Product("Mobile", 10.5, 4);
         p1.displayInfo();

    }
}

