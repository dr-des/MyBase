package DAO;

import logic.*;

import java.sql.SQLException;
import java.util.Collection;

public interface CartridgeDAO {
    void addCartridge(Cartridge cartridge) throws SQLException;
    Collection getCartridge(int check) throws SQLException;
}
