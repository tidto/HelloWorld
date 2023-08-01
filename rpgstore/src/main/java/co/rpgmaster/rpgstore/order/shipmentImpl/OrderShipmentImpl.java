package co.rpgmaster.rpgstore.order.shipmentImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.rpgmaster.rpgstore.connect.DataSource;
import co.rpgmaster.rpgstore.order.shipment.OrderShipment;
import co.rpgmaster.rpgstore.order.shipment.OrderVO;

public class OrderShipmentImpl implements OrderShipment {
	private DataSource source = DataSource.getInstance();
	private Connection connect;
	private PreparedStatement psmt;
	private ResultSet rs;

	@Override
	public List<OrderVO> orderList() { // 출입고 히스토리 조회
		String sql = "SELECT * FROM SHIPPING S RIGHT JOIN INVENTORY I USING(ITEM_NAME) ORDER BY ORDER_DATE DESC";
		List<OrderVO> orders = new ArrayList<OrderVO>();
		OrderVO ovo;
		try {
			connect = source.getConnection();
			psmt = connect.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				ovo = new OrderVO();
				ovo.setOrderNo(rs.getInt("order_no"));
				ovo.setShipping(rs.getString("shipping"));
				ovo.setItemName(rs.getString("item_name"));
				ovo.setOrderEach(rs.getInt("order_each"));
				ovo.setOrderDate(rs.getDate("order_date"));
				orders.add(ovo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return orders;
	}

	@Override
	public int itemInbound(OrderVO ovo) { // 입고목록 작석
		int in = 0;
		String sql = "INSERT INTO SHIPPING VALUES(?, ? ,? , ?, ?)";
		try {
			connect = source.getConnection();
			psmt = connect.prepareStatement(sql);

			psmt.setInt(1, ovo.getOrderNo());
			psmt.setString(2, "입고");
			psmt.setString(3, ovo.getItemName());
			psmt.setInt(4, ovo.getOrderEach());
			psmt.setDate(5,ovo.getOrderDate());
			in = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return in;
	}

	@Override
	public int itemOutbound(OrderVO ovo) { // 출고목록 작성
		int out = 0;
		String sql = "INSERT INTO SHIPPING VALUES(?, ? ,? , ?, ?)";
		try {
			connect = source.getConnection();
			psmt = connect.prepareStatement(sql);

			psmt.setInt(1, ovo.getOrderNo());
			psmt.setString(2, "판매");
			psmt.setString(3, ovo.getItemName());
			psmt.setInt(4, ovo.getOrderEach());
			psmt.setDate(5,ovo.getOrderDate());
			out = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return out;
	}

	@Override
	public int autoOrderNo () { // 다음번호 자동매김
		String sql = "SELECT NVL(MAX(ORDER_NO),0) AS AUTO_OD_NO FROM SHIPPING";
		int auto = 0;
		connect = source.getConnection();
		try {
			psmt = connect.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				auto = (rs.getInt("order_no")) + 1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return auto;
	}

	private void close() {
		try {
			if (rs != null)
				rs.close();
			if (connect != null)
				connect.close();
			if (psmt != null)
				psmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
