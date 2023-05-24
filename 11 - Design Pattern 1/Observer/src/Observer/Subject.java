package Observer;

import java.util.*;
public class Subject {
    private Vector<Observer> views;
    private int value;

    public Subject() {
        views = new Vector<Observer>();
    }

    public void attach (Observer obs) {
        views.add(obs);
    }

    public void notifyObserver(int val) {
        for (int i=0; i < views.size(); i++)
            views.elementAt(i).update(val);
    }

    public void setState(int val) {
        value = val;
        notifyObserver(val);
    }
}
