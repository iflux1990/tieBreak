/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BE.Booking;
import BE.Member;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

/**
 *
 * @author Daniel
 */
public class BookingDBManager
{

    private SQLServerDataSource dataSource;

    public BookingDBManager() throws Exception
    {
        {
            Properties props = new Properties();
            props.load(new FileReader("ConnectionInfo.cfg"));

            dataSource = new SQLServerDataSource();

            dataSource.setServerName(props.getProperty("SERVER"));
            dataSource.setPortNumber(Integer.parseInt(props.getProperty("PORT")));
            dataSource.setDatabaseName(props.getProperty("DATABASE"));
            dataSource.setUser(props.getProperty("USER"));
            dataSource.setPassword(props.getProperty("PASSWORD"));
        }
    }

    public ArrayList<Booking> getByCourt(int courtNr) throws SQLException
    {
        Connection con = dataSource.getConnection();
        String sql = "SELECT * FROM booking WHERE courtNr = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, courtNr);

        ResultSet rs = ps.executeQuery();

        ArrayList<Booking> bookings = new ArrayList<>();

        while (rs.next())
        {
            int id = rs.getInt("id");
            String date = rs.getString("date");
            String timeSlot = rs.getString("timeSlot");
            int memberId = rs.getInt("memberId");
            int court = rs.getInt("courtNr");


            Booking b = new Booking(id, date, timeSlot, memberId, court);
            bookings.add(b);
        }
        return bookings;
    }

    public ArrayList<Booking> getByDate(String date) throws SQLException
    {
        Connection con = dataSource.getConnection();
        String sql = "SELECT * FROM booking WHERE date = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, date);

        ResultSet rs = ps.executeQuery();

        ArrayList<Booking> bookings = new ArrayList<>();

        while (rs.next())
        {
            int id = rs.getInt("id");
            date = rs.getString("date");
            String timeSlot = rs.getString("timeSlot");
            int memberId = rs.getInt("memberId");
            int court = rs.getInt("courtNr");


            Booking b = new Booking(id, date, timeSlot, memberId, court);
            bookings.add(b);
        }
        return bookings;
    }

    public ArrayList<Booking> getByDateAndTime(String date, String time) throws SQLException
    {
        Connection con = dataSource.getConnection();
        String sql = "SELECT * FROM booking WHERE date = ? AND timeSlot = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, date);
        ps.setString(2, time);

        ResultSet rs = ps.executeQuery();

        ArrayList<Booking> bookings = new ArrayList<>();

        while (rs.next())
        {
            int id = rs.getInt("id");
            date = rs.getString("date");
            String timeSlot = rs.getString("timeSlot");
            int memberId = rs.getInt("memberId");
            int court = rs.getInt("courtNr");


            Booking b = new Booking(id, date, timeSlot, memberId, court);
            bookings.add(b);
        }
        return bookings;
    }
}
