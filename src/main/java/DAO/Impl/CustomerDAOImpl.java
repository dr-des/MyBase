package DAO.Impl;

import DAO.CustomerDAO;

import java.sql.SQLException;

public class CustomerDAOImpl implements CustomerDAO {
    public void addCustomerByName(String name)  throws SQLException {
        throw new SQLException();
    }

    public void addCustomerByPhone(String phone)  throws SQLException{
        throw new SQLException();
    }

    public void updateCustomer(String name, String phone, String info)  throws SQLException{
        throw new SQLException();
    }

    public String getCustomerInfo(int id) throws SQLException {
        return null;
    }

    public String getCustomerInfoByName(String name) throws SQLException {
        return null;
    }

    public String getCustomerInfoByphone(String phone) throws SQLException {
        return null;
    }
}
