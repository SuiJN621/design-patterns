package combinationpattern;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author Sui
 * @date 2018/9/3 20:55
 */
public class CompositeIterator implements Iterator {

    private Stack<Iterator> stack = new Stack<>();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public void remove() {

    }

    @Override
    public boolean hasNext() {
        if(stack.empty()){
            //栈为空 返回false
            return false;
        } else {
            //栈不为空 取顶端
            Iterator peek = stack.peek();
            if(peek.hasNext()){
                return true;
            } else {
                stack.pop();
                return hasNext();
            }
        }
    }

    @Override
    public MenuComponent next() {
        if(hasNext()){
            Iterator peek = stack.peek();
            MenuComponent next = (MenuComponent) peek.next();
            stack.push(next.createIterator());
            return next;
        } else {
            return null;
        }
    }
}
