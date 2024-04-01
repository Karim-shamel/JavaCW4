import java.util.*;


public class Property {

   // create a constructor to construct property objects,
    // and a list of methods to get and retrieve the property's information
    //
   //   Properties usually have the following type of information:
   /*
   • Street address
   • Expected sales price
   • Type of home (single-family residence, condo, etc.)
   • Size of property
   • Real estate taxes (annual)
   • Homeowner’s association dues (HOA)
    */

    String streetAddress;
    double expectedSalePrice;
    String homeType;
    float propertySize;
    double annualTaxes;
    double HOA;
    private static List<Property> properties = new ArrayList<>();

    public Property(String streetAddress, double expectedSalePrice, String homeType, float propertySize, double annualTaxes, double HOA) {
        this.streetAddress = streetAddress;
        this.expectedSalePrice = expectedSalePrice;
        this.homeType = homeType;
        this.propertySize = propertySize;
        this.annualTaxes = annualTaxes;
        this.HOA = HOA;
        properties.add(this);
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public double getExpectedSalePrice() {
        return expectedSalePrice;
    }

    public String getHomeType() {
        return homeType;
    }

    public float getPropertySize() {
        return propertySize;
    }

    public double getAnnualTaxes() {
        return annualTaxes;
    }

    public double getHOA() {
        return HOA;
    }

    public static List<Property> getProperties() {
        return properties;
    }
}
