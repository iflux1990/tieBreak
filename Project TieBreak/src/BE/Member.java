/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

/**
 *
 * @author Daniel
 */
public class Member
{
    private final int id;
    private String name;
    private String address;
    private int yearofbirth;
    private int phoneNr;
    private String email;
    private int licenseNr;
    /**
     *
     * @param id
     * @param name
     * @param yearofbirth
     * @param phoneNr
     * @param email
     * @param licenseNr
     */
    public Member(int id, String name, String address, int yearofbirth, int phoneNr, String email, int licenseNr)
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.yearofbirth = yearofbirth;
        this.phoneNr = phoneNr;
        this.email = email;
        this.licenseNr = licenseNr;
        
    }

    /**
     * @return the id
     */
    public int getId()
    {
        return id;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return the yearofbirth
     */
    public int getYearofbirth()
    {
        return yearofbirth;
    }

    /**
     * @param yearofbirth the yearofbirth to set
     */
    public void setYearofbirth(int yearofbirth)
    {
        this.yearofbirth = yearofbirth;
    }

    /**
     * @return the phoneNr
     */
    public int getPhoneNr()
    {
        return phoneNr;
    }

    /**
     * @param phoneNr the phoneNr to set
     */
    public void setPhoneNr(int phoneNr)
    {
        this.phoneNr = phoneNr;
    }

    /**
     * @return the email
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * @return the licenseNr
     */
    public int getLicenseNr()
    {
        return licenseNr;
    }

    /**
     * @param licenseNr the licenseNr to set
     */
    public void setLicenseNr(int licenseNr)
    {
        this.licenseNr = licenseNr;
    }

    /**
     * @return the address
     */
    public String getAddress()
    {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address)
    {
        this.address = address;
    }
}
