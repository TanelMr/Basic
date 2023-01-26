package Week9.measurements;

public class Thermometer implements Sensor{
    private boolean isOn;
    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void on() {
        this.isOn = true;
    }

    @Override
    public void off() {
        this.isOn = false;
    }

    @Override
    public int measure(){
        if(this.isOn){
            return (int)(Math.round(Math.random() * -30 + Math.random() * 30));
        } else {
            throw new IllegalStateException("Thermometer can measure if it is on");
        }
    }
}
