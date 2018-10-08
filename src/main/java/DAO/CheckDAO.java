package DAO;

import logic.Check;

import java.sql.SQLException;
import java.util.Date;

public interface CheckDAO {
    void AddCheck()throws SQLException;
    Check GetCheckById(int id)throws SQLException;
    Check GetCheckByCustomer(int customer) throws SQLException;
    Check GetCheckByDate(Date date) throws SQLException;
    Check GetCheck(int customer, Date date) throws SQLException;

}
