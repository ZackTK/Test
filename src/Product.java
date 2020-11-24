public class Product implements Element{
    String nume;
    public Product(String nu){
        nume=nu;
    }
    public void print(){
            System.out.println("Product: "+this.nume);
        }



}
