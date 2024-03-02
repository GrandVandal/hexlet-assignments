package exercise;

public class Address {
    // BEGIN
    @NotNull
    @MinLength(minLength = 4)
    // END
    private final String country;

    // BEGIN
    @NotNull
    // END
    private final String city;

    // BEGIN
    @NotNull
    // END
    private final String street;

    // BEGIN
    @NotNull
    // END
    private final String houseNumber;

    private final String flatNumber;

    Address(String country, String city, String street, String houseNumber, String flatNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
    }
}
