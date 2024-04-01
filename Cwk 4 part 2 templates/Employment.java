public class Employment {
    // Create a constructor to initialize Employment objects.
    // and create a list of methods to get and retrieve the Employment's information.
    // Information about the Employment usually contains the following:
    /*
   • Name of current employer, phone, and street address
   • Length of time at current employer
   • Position/title
   • Salary including overtime, bonuses, or commissions
    * */

    String employerName;
    String phoneNumber;
    String address;
    String workingDuration;
    String position;
    double totalSalary;

    public Employment(String employerName, String phoneNumber, String address, String workingDuration, String position, double totalSalary) {
        this.employerName = employerName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.workingDuration = workingDuration;
        this.position = position;
        this.totalSalary = totalSalary;
    }

    public String getEmployerName() {
        return employerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getWorkingDuration() {
        return workingDuration;
    }

    public String getPosition() {
        return position;
    }

    public double getTotalSalary() {
        return totalSalary;
    }
}
