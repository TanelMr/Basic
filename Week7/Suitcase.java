package Week7;

import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Thing> things;
    private int weightLimit;

    public Suitcase(int weightLimit) {
        this.weightLimit = weightLimit;
        this.things = new ArrayList<>();
    }

    public void addThing(Thing thing){
        int currentWeight = this.totalWeight();
        if(currentWeight + thing.getWeight() <= this.weightLimit) {
            this.things.add(thing);
        }
    }

    @Override
    public String toString() {
        String languageControl = "";
        if(this.things.size() == 0) {
            languageControl =  "empty";
        } else if (this.things.size() == 1) {
            languageControl = this.things.size() + " thing";
        } else {
            languageControl = this.things.size() + " things";
        }
        return languageControl + " (" + this.totalWeight() + " kg)";
    }

    public void printThings(){
        for (Thing thing :this.things) {
            System.out.println(thing);
        }
    }

    public int totalWeight(){
        int currentWeight = 0;
        for (Thing currentThing :this.things) {
            currentWeight += currentThing.getWeight();
        }
        return currentWeight;
    }

    public Thing heaviestThing(){
        Thing heaviest = new Thing("", 0);
        for (Thing thing : this.things) {
            if (thing.getWeight() > heaviest.getWeight()){
                heaviest = thing;
            }
        }
        if(this.things.size() == 0) return null;
        System.out.println(heaviest);
        return heaviest;
    }

    public ArrayList<Thing> getThings() {
        return things;
    }
}
