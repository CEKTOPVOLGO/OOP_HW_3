public abstract class Product implements Comparable<Product>{
    protected String name;
    protected long price;

    
    public Product(String name, long price) {
        this.name = name;
        this.price = price;
    }
    public abstract String getName();
    public abstract void setName(String name);
    public abstract long getPrice();
    public abstract void setPrice(long price);

    
    
}
