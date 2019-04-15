package combinationpattern;

import java.util.Iterator;

/**
 * @author Sui
 * @date 2018/7/9 17:34
 */
public class DinerMenuIterator implements Iterator {
    private MenuItem[] menuItems;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.length && menuItems[position] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }
}
