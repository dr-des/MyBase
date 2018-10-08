package DAO;

import logic.*;

import java.sql.SQLException;
import java.util.Collection;

public interface CustomerDAO {
    void addCustomerByName(String name) throws SQLException;
    void addCustomerByPhone(String phone) throws SQLException;
    void updateCustomer(String name, String phone, String info) throws SQLException;
    String getCustomerInfo(int id) throws SQLException;
    String getCustomerInfoByName(String name) throws SQLException;
    String getCustomerInfoByphone(String phone) throws SQLException;
}
