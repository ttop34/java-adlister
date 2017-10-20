import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{

    private Connection connection;

    public MySQLAdsDao() throws SQLException {
        connection = DriverManager.getConnection(
                Config.getUrl(), Config.getPassword(), Config.getUser());
    }

    @Override
    public List<Ad> all() {
        String query = "SELECT * FROM users";

        List<Ad> ads = new ArrayList<>();

        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()){
                ads.add(
                        new Ad(rs.getLong("id"), rs.getString("title"), rs.getString("description"))
                );

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        Long id = 0L;
        String query = String.format(
                "INSERT INTO ads(user_id, title, description) values ('%d','%s','%s')" ,
                1, ad.getTitle(), ad.getDescription()
        );

        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            // In order to get the users id you can do the following:
            ResultSet rs = stmt.getGeneratedKeys();
            if(rs.next()){
                id = rs.getLong(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return id;
    }

}
