/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BE.Booking;
import DAL.BookingDBManager;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class BookingManager
{
    
    private BookingDBManager bdb;
    
    public BookingManager()
    {
        
    }
    
    public ArrayList<Booking> getByCourt(int courtNr) throws SQLException
    {
        return bdb.getByCourt(courtNr);
    }
    
    public ArrayList<Booking> getByDate(String date) throws SQLException
    {
        return bdb.getByDate(date);
    }
    
}
