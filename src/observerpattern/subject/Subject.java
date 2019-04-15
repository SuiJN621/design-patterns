package observerpattern.subject;

import observerpattern.observer.Observer;

/**
 * @author Sui
 * @date 2018/6/17 21:46
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}