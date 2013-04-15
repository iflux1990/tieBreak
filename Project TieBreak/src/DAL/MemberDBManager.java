/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BE.Member;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

/**
 *
 * @author MikeZJ
 */
public class MemberDBManager
{

    private SQLServerDataSource dataSource;

    public MemberDBManager() throws Exception
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

    public void addMember(Member m) throws SQLServerException, SQLException
    {

        try (Connection con = dataSource.getConnection())
        {
            String sql = "INSERT INTO member VALUES(?,?,?,?, ?,-1,0,0000,0)";

            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setString(1, m.getName());
            ps.setString(2, m.getAddress());
            ps.setInt(3, m.getYearofbirth());
            ps.setInt(4, m.getPhoneNr());
            ps.setString(5, m.getEmail());
            ps.setInt(6, m.getAccountType());



            int affectedRows = ps.executeUpdate();
            if (affectedRows == 0)
            {
                throw new SQLException("Unable to add member");
            }

            ResultSet keys = ps.getGeneratedKeys();
            keys.next();
            int id = keys.getInt(1);


        }
    }

    public ArrayList<Member> showAll() throws SQLServerException, SQLException
    {
        try (Connection con = dataSource.getConnection())
        {
            String sql = "SELECT * FROM member";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            ArrayList<Member> members = new ArrayList<>();

            while (rs.next())
            {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String address = rs.getString("address");
                int yearofbirth = rs.getInt("yearofbirth");
                int phoneNr = rs.getInt("phoneNr");
                String email = rs.getString("email");
                int licenseNr = rs.getInt("licenseNr");
                boolean isPaid = rs.getBoolean("isPaid");
                int accountType = rs.getInt("accountType");

                Member m = new Member(id, name, address, yearofbirth, phoneNr, email, licenseNr, isPaid, accountType);
                members.add(m);
            }
            return members;

        }

    }

    public void removeMember(int id) throws SQLException
    {
        Connection con = dataSource.getConnection();

        String sql = "DELETE FROM Member WHERE ID = ? ";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);

        int affectedRows = ps.executeUpdate();
        if (affectedRows == 0)
        {
            throw new SQLException("Unable to delete Member");
        }
    }

    public void newSeason() throws SQLException
    {
        {
            Connection con = dataSource.getConnection();

            String sql = "UPDATE Member SET isPaid = 0";

            PreparedStatement ps = con.prepareStatement(sql);

            int affectedRows = ps.executeUpdate();
            if (affectedRows == 0)
            {
                throw new SQLException("Unable to update isPaid");
            }
        }
    }

    public void updateContigent(int ID) throws SQLException
    {
          {
            Connection con = dataSource.getConnection();

            String sql = "UPDATE Member SET isPaid = 1 WHERE ID = ?";

            PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1, ID);

            int affectedRows = ps.executeUpdate();
            if (affectedRows == 0)
            {
                throw new SQLException("Unable to update isPaid");
            }
        }
    }
    
     public void updateMember(Member update, int id) throws SQLException
    {
          {
            Connection con = dataSource.getConnection();

            String sql = "UPDATE Member SET name = ?, address = ?, phoneNr = ?, email = ?, accountType = ?"
                    + " WHERE ID = ?";

            PreparedStatement ps = con.prepareStatement(sql);
             ps.setString(1, update.getName());
             ps.setString(2, update.getAddress());
             ps.setInt(3, update.getPhoneNr());
             ps.setString(4, update.getEmail());
             ps.setInt(5, update.getAccountType());
             ps.setInt(6, update.getId());
             

            int affectedRows = ps.executeUpdate();
            if (affectedRows == 0)
            {
                throw new SQLException("Unable to update isPaid");
            }
        }
    }
     
     public Member getByID(int ID)throws SQLException
        {
            Connection con = dataSource.getConnection();
            String sql = "SELECT * FROM member WHERE Id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ID);

            ResultSet rs = ps.executeQuery();

            if (rs.next())
            {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String address = rs.getString("address");
                int phoneNr = rs.getInt("phoneNr");
                String email = rs.getString("email");
                int accountType = rs.getInt("accountType");
               

                Member m = new Member(id, name, address, phoneNr, email, accountType);
                return m;
            }
            return null;
        }
     
     public Member matchIdPass(int ID) throws SQLException
     {
         Connection con = dataSource.getConnection();
            String sql = "SELECT * FROM member WHERE Id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ID);

            ResultSet rs = ps.executeQuery();

            if (rs.next())
            {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String address = rs.getString("address");
                int phoneNr = rs.getInt("phoneNr");
                String pass = rs.getString("pass");
                int accountType = rs.getInt("accountType");
               

                Member m = new Member(id, name, address, phoneNr, pass, accountType);
                return m;
            }
            return null;
         
     }
}
