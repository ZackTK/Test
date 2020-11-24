public class Phone implements Element{
    String nume;
    int price;
    String OS;
    public Phone(String nu, int pr, String os){
        nume=nu;
        price=pr;
        OS=os;
    }
    public void print(){
        System.out.println("Phone model: "+this.nume +" price: "+this.price+" OS: "+this.OS+" ");
    }
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
