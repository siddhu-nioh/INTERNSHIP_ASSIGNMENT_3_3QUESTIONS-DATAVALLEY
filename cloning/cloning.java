class Organization implements Cloneable {
    private int organizationCode;
    private String organizationName;
    private String organizationAddress;

    public Organization(int code, String name, String address) {
        this.organizationCode = code;
        this.organizationName = name;
        this.organizationAddress = address;
    }

    public void printDetails() {
        System.out.println("Organization Code: " + organizationCode);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Organization Address: " + organizationAddress);
    }
   /**
     * @return int return the organizationCode
     */
    public int getOrganizationCode() {
        return organizationCode;
    }

    /**
     * @param organizationCode the organizationCode to set
     */
    public void setOrganizationCode(int organizationCode) {
        this.organizationCode = organizationCode;
    }

    /**
     * @return String return the organizationName
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * @param organizationName the organizationName to set
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /**
     * @return String return the organizationAddress
     */
    public String getOrganizationAddress() {
        return organizationAddress;
    }

    /**
     * @param organizationAddress the organizationAddress to set
     */
    public void setOrganizationAddress(String organizationAddress) {
        this.organizationAddress = organizationAddress;
    }

    @Override
    public String toString() {
        return "Organization [organizationCode=" + organizationCode + ", organizationName=" + organizationName
                + ", organizationAddress=" + organizationAddress + "]";
    }

    

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class cloning {
    public static void main(String[] args) {
        Organization org1 = new Organization(1001, "ABC Corp", "123 Main St");

        // Cloning org1 to org2 clone () is used for copying of object and any changes to the cloned object effects the original one
        Organization org2 = null;
        try {
            org2 = (Organization) org1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("Original Object:");
        org1.printDetails();

        System.out.println("\nCloned Object:");
        org2.printDetails();
    }



}
