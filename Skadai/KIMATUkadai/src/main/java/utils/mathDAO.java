package utils;

import java.sql.*;
import java.util.ArrayList;

public class mathDAO {
    static final String DB_URL = "jdbc:sqlite:keisan.db";


    static public void insert(mathBean math) {
        String sql = "INSERT INTO suugaku VALUES (?,?,?,?)";


        try (
                Connection con = DriverManager.getConnection(DB_URL);
                PreparedStatement pstmt = con.prepareStatement(sql);
        ) {
            pstmt.setInt(1, math.getHourlyRate());
            pstmt.setInt(2, math.getWeeklyHours());
            pstmt.setInt(3, math.getWeeksPerYear());
            pstmt.setInt(4, math.getAnnual_workweeks());


            pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    static public ArrayList<String> select(int user_id) {
        String sql = "SELECT isbn FROM books WHERE user_id = ?";
        ArrayList<String> result = new ArrayList<>();

        try (
                Connection con = DriverManager.getConnection(DB_URL);
                PreparedStatement pstmt = con.prepareStatement(sql);

        ) {
            pstmt.setInt(1, user_id);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    result.add(rs.getString("isbn"));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return result;
    }


    //削除
    static public void delete(String isbn) {
        String sql = "DERETE FROM maths WHERE isbn ?";

        String salt = GenerateHash.getSalt();

        try (
                Connection con = DriverManager.getConnection(DB_URL);
                PreparedStatement pstmt = con.prepareStatement(sql);
        ) {
            pstmt.setString(1, isbn);

            pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}