package ext;

import dao.IDAO;
import org.springframework.stereotype.Component;

import java.sql.*;
@Component("d_comp")
public class DaoImpl_V2 implements IDAO {
    String db = "spring_dummy_db";
    String user = "root";
    String pwd = "root";
    String url = "jdbc:mysql://localhost:3306/" + db;
    Connection cn = null;

    public DaoImpl_V2() throws SQLException, ClassNotFoundException {
       // Class.forName("mysql-connector-java-8.0.23");
        cn = DriverManager.getConnection(url, user, pwd);

    }

    @Override
    public double getValue() {
        Statement st = null;
        try {
            st = cn.createStatement();
            double val = 0;
            ResultSet rs = st.executeQuery("select value from dummy_table where id=0");
            while (rs.next()) {
                val = rs.getDouble("value");
            }
            return val;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return -1;
        }
    }
}
