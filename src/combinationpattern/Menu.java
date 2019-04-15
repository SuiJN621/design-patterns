package combinationpattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Sui
 * @date 2018/7/9 17:57
 */
public class Menu extends MenuComponent{

    private List<MenuComponent> childs;

    private String name;

    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
        this.childs = new ArrayList<>();
    }

    @Override
    public void add(MenuComponent menuComponent) {
        if(menuComponent != null) {
            childs.add(menuComponent);
        }
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        childs.remove(menuComponent);
    }

    @Override
    public MenuComponent get(int i) {
        return childs.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription(){
        return description;
    }

    @Override
    public void print(){
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("-------------------");

        Iterator<MenuComponent> iterator = childs.iterator();
        while(iterator.hasNext()){
            iterator.next().print();
        }
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(childs.iterator());
    }
}
