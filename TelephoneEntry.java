package package1;

public abstract class TelephoneEntry {
    protected Address address;

    public abstract String description();

    public abstract Address getAddress();

    public abstract void setAdress(String newCountry, String newRegion, String newCity, String newPostCode,
            String newStreetName,
            String newHouseNumber, String newCountryCode, String newLocalNumber);
}