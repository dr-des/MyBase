package DAO;

import logic.*;

import java.sql.SQLException;
import java.util.Collection;

public interface CartridgeDAO {
    public void addCartridge(Cartridge cartridge) throws SQLException;
    public Collection getCartridge(int check) throws SQLException;
}
