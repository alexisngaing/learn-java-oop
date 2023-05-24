package Observer;

public abstract class Observer {
    private Subject model;

    public Observer (Subject mod) {
        model = mod;
        // Observers mendaftar ke Subject
        model.attach(this);
    }

    public abstract void update(int val);
}
