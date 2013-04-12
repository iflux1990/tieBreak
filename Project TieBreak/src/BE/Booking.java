/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

/**
 *
 * @author Daniel
 */
public class Booking
{
    private final int id;
    private String date;
    private String timeSlot;
    private int memberId;
    private int courtNr;
    public Booking(int id, String date, String timeSlot, int memberId, int courtNr)
    {
        this.id = id;
        this.date = date;
        this.timeSlot = timeSlot;
        this.memberId = memberId;
        this.courtNr = courtNr;
        
    }

    /**
     * @return the id
     */
    public int getId()
    {
        return id;
    }

    /**
     * @return the date
     */
    public String getDate()
    {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date)
    {
        this.date = date;
    }

    /**
     * @return the timeSlot
     */
    public String getTimeSlot()
    {
        return timeSlot;
    }

    /**
     * @param timeSlot the timeSlot to set
     */
    public void setTimeSlot(String timeSlot)
    {
        this.timeSlot = timeSlot;
    }

    /**
     * @return the memberId
     */
    public int getMemberId()
    {
        return memberId;
    }

    /**
     * @param memberId the memberId to set
     */
    public void setMemberId(int memberId)
    {
        this.memberId = memberId;
    }

    /**
     * @return the courtNr
     */
    public int getCourtNr()
    {
        return courtNr;
    }

    /**
     * @param courtNr the courtNr to set
     */
    public void setCourtNr(int courtNr)
    {
        this.courtNr = courtNr;
    }
    
}
