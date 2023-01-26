package Week8;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex9 {
    public static void main(String[] args) {
        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        ArrayList<RegistrationPlate> finnish = new ArrayList<>();
        finnish.add(reg1);
        finnish.add(reg2);
        finnish.add(reg3);

//        RegistrationPlate new = new RegistrationPlate("FI", "ABC-123");
//        if (!finnish.contains(new)) {
//            finnish.add(new);
//        }

        System.out.println("Finnish: " + finnish);

        HashMap<RegistrationPlate, String> owners = new HashMap<>();
        owners.put(reg1, "Siim");
        owners.put(reg2, "Tanel");
        owners.put(reg3, "Kevin");

        System.out.println("owners:");
        System.out.println(owners.get(new RegistrationPlate("FI", "ABC-123")));
        System.out.println(owners.get(new RegistrationPlate("D", "B WQ-431")));

        VehicleRegister register = new VehicleRegister();

        register.add(reg1, "Siim");
        register.add(reg2, "Tanel");
        register.add(reg3, "Kevin");

        register.printRegistrationPlates();

        register.printOwners();
    }
}
