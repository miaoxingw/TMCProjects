import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class VehicleRegister {
    private Map <RegistrationPlate, String> owners;

    public VehicleRegister() {
        owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        // Car already has an owner
        if (owners.containsKey(plate)) {
            return false;
        }

        owners.put(plate, owner);
        return true;
    }

    public String get(RegistrationPlate plate) {
        return owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        // No one owns the car
        if (!owners.containsKey(plate)) {
            return false;
        }

        owners.remove(plate);
        return true;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        List<String> alreadyPrinted = new ArrayList<String>();

        for (String owner : owners.values()) {
            if (!alreadyPrinted.contains(owner)) {
                System.out.println(owner);
                alreadyPrinted.add(owner);
            }
        }
    }
}