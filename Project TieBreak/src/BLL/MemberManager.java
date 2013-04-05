/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BE.Member;
import DAL.MemberDBManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import sun.util.calendar.Gregorian;

/**
 *
 * @author MikeZJ
 */
public class MemberManager
{
    private static MemberManager instance = null;
    private MemberDBManager mdb = null;

    public MemberManager() throws Exception
    {
        mdb = new MemberDBManager();
    }

    public void addMember(Member m) throws SQLException
    {
        mdb.addMember(m);
    }
    
    public ArrayList<Member> showAll() throws SQLException
    {
        return mdb.showAll();
    }
    
    public void removeMember(int id) throws SQLException
    {
        mdb.removeMember(id);
    }
    
    public void setNewSeason() throws SQLException
    {
        if((Calendar.MONTH)+1 == 4 || (Calendar.MONTH)+1 == 10 )
        {
            mdb.newSeason();
        }
    }

    public void updateContigent(int ID) throws SQLException
    {
       mdb.updateContigent(ID);
    }

    public void updateMember(Member update, int ID)throws SQLException
    {
        mdb.updateMember(update, ID);
    }
}
