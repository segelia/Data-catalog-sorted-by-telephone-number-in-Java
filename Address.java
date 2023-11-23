package package1;

public class Address {
    private String country;
    private String region;
    private String city;
    private String postCode;
    private String streetName;
    private String houseNumber;
    TelephoneNumber telephoneNumber;

    Address(String newCountry, String newRegion, String newCity, String newPostCode, String newStreetName,
            String newHouseNumber, String newCountryCode, String newLocalNumber) {

        country = newCountry;
        region = newRegion;
        city = newCity;
        postCode = newPostCode;
        streetName = newStreetName;
        houseNumber = newHouseNumber;
        telephoneNumber = new TelephoneNumber(newCountryCode, newLocalNumber);
    }

    public TelephoneNumber getTelephoneNumber() {
        return telephoneNumber;
    }

    public String toString() {
        return "\n" + "Country: " + country + "\n" + "Region: " + region + "\n" + "City: " + city + "\n" + "Post code: " + postCode + "\n"
                + "Street name: " + streetName + "\n" + "House number: " + houseNumber + "\n" + "Telephone number: "
                + telephoneNumber;
    }
}
