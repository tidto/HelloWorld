package co.rpgmaster.rpgstore.item.handleImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.rpgmaster.rpgstore.connect.DataSource;
import co.rpgmaster.rpgstore.item.handle.ItemHandle;
import co.rpgmaster.rpgstore.item.handle.ItemVO;

public class ItemHandleImpl implements ItemHandle {
	private DataSource source = DataSource.getInstance();
	private Connection connect;
	private PreparedStatement psmt;
	private ResultSet rs;
	

	@Override
	public int itemInventoryAdd(ItemVO ivo) { // 아이템 새로 추가
		int plus = 0;
		String sql = "INSERT INTO ITEM VALUES(?,?,?,?,?)";
		try {
			connect = source.getConnection();
			psmt = connect.prepareStatement(sql);
			
			psmt.setInt(1, ivo.getItemNo()); 
			psmt.setString(2, ivo.getItemName());
			psmt.setString(3, ivo.getItemType());
			psmt.setInt(4, ivo.getItemPrice());
			psmt.setInt(5, ivo.getItemPieces());
			plus = psmt.executeUpdate(); 
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return plus;
	}

	private void close() {
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (connect != null)
				connect.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
//
	@Override
	public int itemEscalation(ItemVO ivo) { // 아이템 물가변동 가격수정
		String sql = "UPDATE ITEM SET ITEM_PRICE = ? WHERE ITEM_NO = ?";
		int flation = 0;
		try {
			connect = source.getConnection();
			psmt = connect.prepareStatement(sql);
			psmt.setInt(1, ivo.getItemPrice());
			psmt.setInt(2, ivo.getItemNo());
			flation = psmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return flation;
	}

	@Override
	public int itemFree(ItemVO ivo) { // 아이템 단종
		int free = 0;
		String sql = "DELETE FROM ITEM WHERE ITEM_NO = ?";
		try {
			connect = source.getConnection();
			psmt = connect.prepareStatement(sql);
			psmt.setInt(1, ivo.getItemNo());
			free = psmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return free;
	}

	@Override
	public int itemInbound(ItemVO ivo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int itemOutbound(ItemVO ivo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
