package Week9.moving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing{
    private int capacity;
    private List<Thing> things;

    public Box(int maximumCapacity) {
        this.capacity = maximumCapacity;
        things = new ArrayList<>();
    }

    public boolean addThing(Thing thing){
        if(thing.getVolume() <= this.capacity) {
            this.things.add(thing);
            this.capacity -= thing.getVolume();
            return true;
        }
        return false;
    }

    public int getVolume(){
        int boxCapacity = 0;
        for (Thing thing:this.things) {
            boxCapacity += thing.getVolume();
        }
        return boxCapacity;
    }

    @Override
    public String toString() {
        StringBuilder content = new StringBuilder();
        for (Thing thing:this.things) {
            content.append("\t").append(thing.toString()).append("\n");
        }
        return content.toString();
    }
}
