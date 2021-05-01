
package observer;

/**
 *
 * @author Heloiza
 */
public interface Subject {
    public void addSubject(Observer o);
    public void removeSubject(Observer o);
    public void notifyObservers();
}
