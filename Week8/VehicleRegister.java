package Week8;

import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<>();
    }

    public boolean add(RegistrationPlate plate, String owner){
        if(!this.owners.containsKey(plate)){
            this.owners.put(plate, owner);
            return true;
        } else {
            return false;
        }
    }

    public String get(RegistrationPlate plate){
        return this.owners.getOrDefault(plate, null);
    }

    public boolean delete(RegistrationPlate plate){
        if(this.owners.containsKey(plate)){
            this.owners.remove(plate);
            return true;
        } else {
            return false;
        }
    }

    public HashMap<RegistrationPlate, String> getOwners() {
        return owners;
    }

    public void printRegistrationPlates(){
        for (RegistrationPlate plate:this.owners.keySet()) {
            System.out.println("Numberplate : " + plate);
        }
    }

    public void printOwners(){
        ArrayList<String> owners = new ArrayList<String>();
        for (RegistrationPlate plate:this.owners.keySet()) {
            String owner = this.owners.get(plate);
            if(!owners.contains(owner)){
                owners.add(owner);
            }
        }

        for (String owner : owners) {
            System.out.println("Owner : " + owner);
        }
    }
}
