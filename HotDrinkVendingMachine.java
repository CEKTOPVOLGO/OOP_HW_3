import java.util.Iterator;
import java.util.LinkedList;

public class HotDrinkVendingMachine implements VendingMachine, Iterable<Product> {

    private LinkedList<Product> hotDrink;    

    @Override
    public Product getProduct() {        
        return hotDrink.pollLast();
    }

    @Override
    public void putProduct(LinkedList<Product> item) {
        this.hotDrink = item;        
    }

    @Override
    public Iterator<Product> iterator() {        
        //throw new UnsupportedOperationException("Unimplemented method 'iterator'");
        return new HotDrinkIterator(0, hotDrink);
    }

}
