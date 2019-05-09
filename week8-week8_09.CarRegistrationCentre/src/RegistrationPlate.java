
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }

        RegistrationPlate compared = (RegistrationPlate) object;

        if (regCode == null || !regCode.equals(compared.regCode)) {
            return false;
        }

        if (country == null | !country.equals(compared.country)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        if (regCode == null || country == null) {
            return 1;
        }

        return regCode.hashCode() + country.hashCode();
    }
}
