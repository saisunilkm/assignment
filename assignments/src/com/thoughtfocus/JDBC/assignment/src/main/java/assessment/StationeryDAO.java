package assessment;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class StationeryDAO {
	public boolean insertStationaryDTO(StationeryDTO stationarydto){
		String sql = "insert into StationaryDTO values(?,?,?,?,?,?)";
		try {
			PreparedStatement ps = GetConnection.getConnection().prepareStatement(sql);
			
			ps.setString(1, ("Omkar"));
			ps.setString(2,("Staionary"));
			ps.setString(3,("classmate"));
			ps.setDouble(4,(30.00));
			ps.setString(5,("ten books"));
			ps.setLong(6,(254945));
			
			return ps.executeUpdate()>0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		
		
	}
	public boolean DeleteBySerialNumber(long SerialNumber) {
		String sql = "delete from StationaryDTO where SerialNumber=?";
		try {
			PreparedStatement ps = GetConnection.getConnection().prepareStatement(sql);
			ps.setLong(6,SerialNumber);
			
			return ps.executeUpdate()>0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean updatePriceByBrandName(double price, String BrandName) {
		String sql ="update StationaryDTO set price=? where BrandName=?";
		return false;
	}
	public List<StationeryDTO>getAllByName(String Name){
		return null;
	}

}
