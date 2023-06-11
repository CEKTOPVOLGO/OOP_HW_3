import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        HotDrinkVendingMachine hdvm = new HotDrinkVendingMachine();
        Product tea = new HotDrink ("Tea", 100, 60);
        Product coffee = new HotDrink("Coffee", 200, 90);
        Product cocoa = new HotDrink("Cocoa", 150, 80);
        Product hotWine = new HotDrink("Mulled Wine", 300, 80);
        LinkedList<Product> l = new LinkedList<>();
        l.add(tea);
        l.add(coffee);
        l.add(cocoa);
        l.add(hotWine);        

        //List<Product> list = hdvm.getProduct().collect(Collectors.toList());
        l.sort((w1, w2)-> Long.compare(w1.price, w2.price));
        //Collection.sort(l);
        System.out.println(l);

        hdvm.putProduct(l);

        Iterator<Product> iterator = hdvm.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //List<Product> list = ((Collection<Product>) hdvm.getProduct()).stream().sorted().collect(Collectors.toList());
        //System.out.println(list);

        //System.out.println(hdvm.getProduct());
        //System.out.println(hdvm.getProduct());
        //System.out.println(hdvm.getProduct());
        //System.out.println(hdvm.getProduct());
    }
}