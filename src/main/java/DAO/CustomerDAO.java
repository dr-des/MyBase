package DAO;

import logic.*;

import java.sql.SQLException;
import java.util.Collection;

public interface CustomerDAO {
    public void addCustomerByName(String name) throws SQLException;
    public void addCustomerByPhone(String phone) throws SQLException;
    public void updateCustomer(String name, String phone, String info) throws SQLException;
    public String getCustomerInfo(int id) throws SQLException;
    public String getCustomerInfoByName(String name) throws SQLException;
    public String getCustomerInfoByphone(String phone) throws SQLException;
}
