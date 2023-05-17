// import java.util.ArrayList;

public class TestOrder {
    public static void main(String[] args){
        Item item1 = new Item("mocha",4.15);
        Item item2 = new Item("latte",3.35);
        Item item3 = new Item("drip coffee",2.99);
        Item item4 = new Item("capuccino",3.50);

        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

        System.out.println(order1);
        System.out.println(order1.total);

        order2.items.add(item1);
        order2.total += item1.price;
        System.out.printf("Name: %s\n",order2.name);
        System.out.printf("Total: %s\n",order2.total);

        order3.items.add(item4);
        order3.total += item4.price;
        System.out.printf("Name: %s\n",order3.name);
        System.out.printf("Total: %s\n",order3.total);

        order4.items.add(item2);
        order4.total += item2.price;
        System.out.printf("Name: %s\n",order4.name);
        System.out.printf("Total: %s\n",order4.total);

        order1.ready = true;
        System.out.printf("Name: %s\n",order1.name);
        System.out.printf("Ready: %s\n",order1.ready);

        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += item2.price*2;
        System.out.printf("Name: %s\n",order4.name);
        System.out.printf("Total: %s\n",order4.total);

        order2.ready = true;
        System.out.printf("Name: %s\n",order2.name);
        System.out.printf("Ready: %s\n",order2.ready);
    }
}
