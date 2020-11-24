public class Main {
    public static void main(String[] args) throws Exception {
        Box b=new Box();
        Headphones p1 =new Headphones("Axom R5", 200);
        Charger p2 =new Charger("Redoll B6", 120);
        Phone p3 =new Phone("Redoll Yirna", 500, "Windows");
        Box b2=new Box();
        b.AddElement(b2);
        b.AddElement(p1);
        b.AddElement(p2);
        b.AddElement(p3);
        b2.AddElement(new Charger("Titanis", 90));
        b2.AddElement(new Charger("Henelloch Ry", 220));
        b2.AddElement(new Headphones("Missimo Steffan", 300));
        b.print();
        ProdStats stats = new ProdStats();
        b.accept(stats);
        stats.printStatistics();
    }
}


/*
Charger model: Titanis price: 90
Charger model: Henelloch Ry price: 220
Headphones model: Missimo Steffan price: 300
Headphones model: Axom R5 price: 200
Charger model: Redoll B6 price: 120
Phone model: Redoll Yirna price: 500 OS: Windows
Headphones: 0
Chargers: 0
Phones: 0

Process finished with exit code 0
*/