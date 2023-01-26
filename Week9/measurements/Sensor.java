package Week9.measurements;

public interface Sensor {
    boolean isOn();
    void on();
    void off();
    int measure();
}
