package Week7;

import java.util.ArrayList;

public class Container {
    private ArrayList<Suitcase> suitcases;
    private int weightLimit;

    public Container(int weightLimit) {
        this.weightLimit = weightLimit;
        this.suitcases = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase){
        int currentWeight = this.totalWeight();
        if(currentWeight + suitcase.totalWeight() <= this.weightLimit) {
            this.suitcases.add(suitcase);
        }
    }

    @Override
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }

    public int totalWeight(){
        int currentWeight = 0;
        for (Suitcase currentSuitcase :this.suitcases) {
            currentWeight += currentSuitcase.totalWeight();
        }
        return currentWeight;
    }

    public void printThings(){
        for (Suitcase currentSuitcase :this.suitcases) {
            for (Thing currentThing : currentSuitcase.getThings()) {
                System.out.println(currentThing);
            }
        }
    }

}
