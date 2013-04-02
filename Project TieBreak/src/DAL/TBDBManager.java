/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.FileReader;
import java.util.Properties;

/**
 *
 * @author Daniel
 */
public class TBDBManager
{
    private SQLServerDataSource dataSource;

    public TBDBManager() throws Exception
    {
        Properties props = new Properties();
        props.load(new FileReader("Connectioninfo.cfg"));

        dataSource = new SQLServerDataSource();

        dataSource.setServerName(props.getProperty("SERVER"));
        dataSource.setPortNumber(Integer.parseInt(props.getProperty("PORT")));
        dataSource.setDatabaseName(props.getProperty("DATABASE"));
        dataSource.setUser(props.getProperty("USER"));
        dataSource.setPassword(props.getProperty("PASSWORD"));
    }
}
