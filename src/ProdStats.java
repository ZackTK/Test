public class ProdStats implements Visitor{
    int headphones=0,chargers=0,phones=0;
    @Override
    public void visit(Box b) {
    }
    @Override
    public void visit(Headphones p1) {
        headphones=headphones+p1.price;
    }
    @Override
    public void visit(Charger p2) {
        chargers=chargers+p2.price;
    }
    @Override
    public void visit(Phone p3) {
        phones=phones+p3.price;
    }
    public void printStatistics(){
        System.out.println("Headphones: "+headphones+"\nChargers: "+chargers+"\nPhones: "+phones);
    }
}
