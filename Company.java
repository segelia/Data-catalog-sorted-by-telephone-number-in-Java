package package1;

public class Company extends TelephoneEntry {
    private String name;
    private Address address;

    Company(String newName, Address newAddress) {
        name = newName;
        address = newAddress;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setAdress(String newCountry, String newRegion, String newCity, String newPostCode, String newStreetName,
            String newHouseNumber, String newCountryCode, String newLocalNumber) {
        address = new Address(newCountry, newRegion, newCity, newPostCode, newStreetName, newHouseNumber,
                newCountryCode, newLocalNumber);
    }

    @Override
    public String description() {
        return "Name: " + name + "\n" + "Address: " + address;
    }

}
