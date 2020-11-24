import java.util.ArrayList;

public class Box implements Element{
    protected ArrayList<Element> elements = new ArrayList<>();
    public Box(){
    }
    public void AddElement(Element elm){
        elements.add(elm);
    }
    public void print(){
        for(Element i : elements){
            i.print();
        }
    }
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
