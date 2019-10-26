package storyG.No15_observer.obser3;

import java.util.Observer;
import java.util.Vector;

public class Observable <T> {
	private boolean changed = false;
	private Vector<Observer<T>> obs;
	
	public Observable() {
        obs = new Vector<>();
    }
	
	public synchronized void addObserver(Observer<T> var1) {
		if (var1 == null) {
			throw new NullPointerException();
		} else {
			if (!this.obs.contains(var1)) {
				this.obs.addElement(var1);
			}

		}
	}

	public synchronized void deleteObserver(Observer<T> arg) {
		this.obs.removeElement(arg);
	}

	public void notifyObservers() {
		this.notifyObservers((T) null);
	}

	public void notifyObservers(T arg) {
		Vector<Observer<T>> arrLocal;
		synchronized (this) {
			if (!this.changed) {
				return;
			}

			arrLocal = (Vector<Observer<T>>)obs.clone();
			this.clearChanged();
		}

		for(Observer<T> observer : arrLocal	) {
			observer.update(this, arg);
		}

	}

	public synchronized void deleteObservers() {
		this.obs.removeAllElements();
	}

	public synchronized void setChanged() {
		this.changed = true;
	}

	protected synchronized void clearChanged() {
		this.changed = false;
	}

	public synchronized boolean hasChanged() {
		return this.changed;
	}

	public synchronized int countObservers() {
		return this.obs.size();
	}
	public interface Observer<T> {
		void update(Observable<T> o, T arg);
	}
}
