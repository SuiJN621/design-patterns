package observerpattern.observer;

import observerpattern.subject.Subject;

/**
 * @author Sui
 * @date 2018/6/17 21:55
 */
public interface Observer {

    void update(Subject subject);
}
