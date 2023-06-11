import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HotDrinkIterator implements Iterator<Product>{
    private int counter;
    private final LinkedList<Product> hotDrink;

    public HotDrinkIterator(int counter, LinkedList<Product>hotDrink){
        this.counter = counter;
        this.hotDrink = hotDrink;
    }

    @Override
    public boolean hasNext() {        
        return counter < this.hotDrink.size();
    }

    @Override
    public Product next() {
        if (!hasNext()){
            throw new RuntimeException("HOTWATER");
        }
        return hotDrink.get(counter++);
    }
    

}
