package package1;

public class Person extends TelephoneEntry {
    private String name;
    private String lastName;

    Person(String newName, String newLastName, Address newAddress) {
        name = newName;
        lastName = newLastName;
        address = newAddress;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public Address getAddress() {
        return address;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    @Override
    public void setAdress(String newCountry, String newRegion, String newCity, String newPostCode, String newStreetName,
            String newHouseNumber, String newCountryCode, String newLocalNumber) {
        address = new Address(newCountry, newRegion, newCity, newPostCode, newStreetName, newHouseNumber,
                newCountryCode, newLocalNumber);
    }

    @Override
    public String description() {
        return "Name: " + name + " Last name: " + lastName + " Address: " + address;
    }
}
