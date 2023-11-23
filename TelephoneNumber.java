package package1;
public class TelephoneNumber implements Comparable<TelephoneNumber> {
    private String countryCode;
    private String localNumber;

    TelephoneNumber(String countryCode, String localNumber) {
        this.countryCode = countryCode;
        this.localNumber = localNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getLocalNumber() {
        return localNumber;
    }

    public String toString() {
        return countryCode + " " + localNumber;
    }

    public String telephoneNumberDescription() {
        return "+" + countryCode + " " + localNumber;
    }

    @Override
    public int compareTo(TelephoneNumber other) {

        // The integer should be negative if the current object is less than the specified object (other), 
        // zero if they are equal, 
        // and positive if the current object is greater.

        int countryCodeComparison = this.countryCode.compareTo(other.countryCode);

        if (countryCodeComparison == 0) {
            return this.localNumber.compareTo(other.localNumber);
        }

        return countryCodeComparison;
    }
}