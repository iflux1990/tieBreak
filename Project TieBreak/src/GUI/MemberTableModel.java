/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BE.Member;
import BLL.MemberManager;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Daniel
 */
public class MemberTableModel extends AbstractTableModel
{

    private MemberManager mm;
    private final String[] header =
    {
        "Id", "Name", "Address", "Phone Nr", "E-mail", "Contigent is paid?"
    };
    private final Class[] columnTypes =
    {
        Integer.class, String.class, String.class, Integer.class, String.class, Boolean.class
    };
    private ArrayList<Member> members;

    public MemberTableModel()
    {
        try
        {
            mm = new MemberManager();
        }
        catch (Exception ex)
        {
            System.out.println("lol");
        }
    }
    MemberTableModel(ArrayList<Member> AllPersons)
    {
        fireTableDataChanged();
        members = AllPersons;
    }

    @Override
    public int getRowCount()
    {
        return members.size();
    }

    @Override
    public int getColumnCount()
    {
        return header.length;
    }

    @Override
    public Object getValueAt(int row, int col)
    {
        {
            Member m = members.get(row);
            switch (col)
            {
                case 0:
                    return m.getId();
                case 1:
                    return m.getName();
                case 2:
                    return m.getAddress();
                case 3:
                    return m.getPhoneNr();
                case 4:
                    return m.getEmail();
                case 5:
                    return m.isIsPaid();
            }
            return null;
        }
    }

    @Override
    public String getColumnName(int col)
    {
        return header[col];
    }

    @Override
    public Class<?> getColumnClass(int col)
    {
        return columnTypes[col];
    }

    @Override
    public boolean isCellEditable(int row, int col)
    {
        return (false);
    }
    
    public void setCollection(Collection<Member> list)
    {
        members = new ArrayList<>(list);
        fireTableDataChanged();
        System.out.println("jubii");
    }
}
