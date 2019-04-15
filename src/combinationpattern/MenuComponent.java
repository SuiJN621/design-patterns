package combinationpattern;

import java.util.Iterator;

/**
 * @author Sui
 * @date 2018/9/3 20:37
 */
public abstract class MenuComponent {

    public void add(MenuComponent menuComponent){

    }

    public void remove(MenuComponent menuComponent){

    }

    public MenuComponent get(int i){
        return null;
    }

    public String getName(){
        return null;
    }

    public double getPrice(){
        return 0.0;
    }

    public boolean isVegetarian(){
        return false;
    }

    public String getDescription(){
        return null;
    }

    public void print(){

    }

    public Iterator createIterator(){
        return null;
    }
}
