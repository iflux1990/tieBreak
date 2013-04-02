/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BE.Member;
import DAL.MemberDBManager;

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

    public Member addMember()
    {
        return mdb.addMember();
    }
    
}
