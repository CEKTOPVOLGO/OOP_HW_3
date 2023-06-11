public abstract class Product {
    protected String name;
    protected int volume;

    
    public Product(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }
    public abstract String getName();
    public abstract void setName(String name);
    public abstract int getVolume();
    public abstract void setVolume(int volume);
    
    
}
