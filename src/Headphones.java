public class Headphones implements Element{
    String nume;
    int price;
    public Headphones(String nu, int pr){
        nume=nu;
        price=pr;
    }
    public void print(){
        System.out.println("Headphones model: "+this.nume+" price: "+this.price+" ");
    }
    public void accept(Visitor visitor){
        visitor.visit(this);
    }

}
