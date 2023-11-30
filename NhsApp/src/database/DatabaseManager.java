package database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseManager {
	public static double[] getLatLong(String postcode) {
        String query = "SELECT latitude, longitude FROM bangorpostcodes WHERE postcode = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, postcode);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                double latitude = resultSet.getDouble("latitude");
                double longitude = resultSet.getDouble("longitude");
                return new double[]{latitude, longitude};
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

	public boolean checkPostcode(String postcode) {
        double[] latLong = getLatLong(postcode);
        return latLong != null;
    }

    // Add your other database-related methods here if needed

}
