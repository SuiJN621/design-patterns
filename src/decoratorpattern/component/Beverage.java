package decoratorpattern.component;

/**
 * @author Sui
 * @date 2018/6/17 23:56
 */
public abstract class Beverage {

    protected String description = "unknown beverage";

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
