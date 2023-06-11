public class HotDrink extends Product {

    private int temp;
    private long price;

    public HotDrink(String name, int volume, int temp, long price) {
        super(name, volume);
        this.temp = temp;
        this.price = price;

    }

    

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "HotDrink {" + "name='" + name + "\'" + ", volume = " + volume + ", temp = " + temp + ", price = " + price + "}";
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public int getVolume() {
        return super.volume;
    }

    @Override
    public void setName(String name) {
        super.name = name;

    }

    @Override
    public void setVolume(int price) {
        super.volume = volume;

    }



    public long getPrice() {
        return price;
    }



    public void setPrice(long price) {
        this.price = price;
    }

}
