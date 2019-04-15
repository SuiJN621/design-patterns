package combinationpattern;

import java.util.Iterator;

/**
 * @author Sui
 * @date 2018/9/4 10:28
 */
public class NullIterator implements Iterator {

    @Override
    public void remove() {

    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
