import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        HotDrinkVendingMachine hdvm = new HotDrinkVendingMachine();
        Product tea = new HotDrink ("Tea", 250, 60, 50);
        Product coffee = new HotDrink("Coffee", 150, 90, 80);
        Product cocoa = new HotDrink("Cocoa", 150, 80, 100);
        Product hotWine = new HotDrink("Mulled Wine", 300, 80, 150);
        LinkedList<Product> l = new LinkedList<>();
        l.add(tea);
        l.add(coffee);
        l.add(cocoa);
        l.add(hotWine);

        
        hdvm.putProduct(l);

        Iterator<Product> iterator = hdvm.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(hdvm.getProduct());
        System.out.println(hdvm.getProduct());
        System.out.println(hdvm.getProduct());
        System.out.println(hdvm.getProduct());
    }
}