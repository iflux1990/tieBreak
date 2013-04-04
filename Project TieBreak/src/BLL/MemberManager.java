/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BE.Member;
import DAL.MemberDBManager;
import java.sql.SQLException;
import java.util.ArrayList;

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
    
}
