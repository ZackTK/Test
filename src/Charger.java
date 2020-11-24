public class Charger implements Element{
    String nume;
    int price;
    public Charger(String nu, int pr){
        nume=nu;
        price=pr;
    }
    public void print(){
            System.out.println("Charger model: "+this.nume+" price: "+this.price+" ");
    }
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}


