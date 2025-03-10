/**
 * An interface for a class to observe an Observable class. Requires the
 * Observer to implement an update method to handle notifications from the
 * Observable.
 * 
 *
 */
public interface Observer {
	void update(Object theObserved);
}
