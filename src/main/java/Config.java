public class Config {
    private static final String url = "jdbc:mysql://localhost/adlister_db";
    private static final String password = "adlister_pwd";
    private static final String user = "adlister_user";


    public static String getUrl() {
        return url;
    }

    public static String getPassword() {
        return password;
    }

    public static String getUser() {
        return user;
    }


}
