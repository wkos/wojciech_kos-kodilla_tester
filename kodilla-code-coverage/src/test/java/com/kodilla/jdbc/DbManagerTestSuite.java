package com.kodilla.jdbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.AbstractMap;
import java.util.List;

class DbManagerTestSuite {
    private static DbManager dbManager;

    @BeforeAll
    public static void setup() throws SQLException {
        dbManager = DbManager.getInstance();
    }

    @Test
    void testConnect() {
        //Given
        //When
        //Then
        Assertions.assertNotNull(dbManager.getConnection());
    }

//    @Test
//    void testSelectUsers() throws SQLException {
//        //Given
//        //When
//        String sqlQuery = "SELECT * FROM USERS";
//        Statement statement = dbManager.getConnection().createStatement();
//        ResultSet rs = statement.executeQuery(sqlQuery);
//
//        //Then
//        int counter = 0;
//        while(rs.next()) {
//            System.out.println(rs.getInt("ID") + ", " +
//                    rs.getString("FIRSTNAME") + ", " +
//                    rs.getString("LASTNAME"));
//            counter++;
//        }
//        rs.close();
//        statement.close();
//        Assertions.assertEquals(5, counter);
//    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = getRowsCount(rs);
        insertUsers(statement);

        //When
        String sqlQuery = "SELECT * FROM USERS";
        statement = createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = getResultsCount(rs);
        int expected = count + 5;
        Assertions.assertEquals(expected, counter);

        rs.close();
        statement.close();
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {
        //Given
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = getRowsCount(rs);
        insertUsers(statement);
        int postsId = count + 5;

        countQuery = "select count(*) from " + "(select count(*) " +
                "from users " +
                "join posts on users.id = posts.user_id " +
                "group by user_id " +
                "having count(posts.user_id) >= 2) s";
        statement = createStatement();
        rs = statement.executeQuery(countQuery);
        int oldCount = getRowsCount(rs);
        insertPosts(statement, postsId);

        //When
        String sqlQuery = "select firstname, lastname " +
                "from users " +
                "join posts on users.id = posts.user_id " +
                "group by user_id " +
                "having count(posts.user_id) >= 2";
        statement = createStatement();
        rs = statement.executeQuery(sqlQuery);
        //Then
        int resultCount = getRowsCountFromQuery(rs);
        int expected = oldCount + 1;
        showQueryResult(rs);
        Assertions.assertEquals(expected, resultCount);

        rs.close();
        statement.close();
    }

    private Statement createStatement() throws SQLException {
        return dbManager.getConnection().createStatement();
    }

    private static final List<AbstractMap.SimpleEntry<String, String>> USERS = List.of(
            new AbstractMap.SimpleEntry<>("Zara", "Ali"),
            new AbstractMap.SimpleEntry<>("Otman", "Use"),
            new AbstractMap.SimpleEntry<>("Mark", "Boq"),
            new AbstractMap.SimpleEntry<>("Uli", "Wimer"),
            new AbstractMap.SimpleEntry<>("Oli", "Kosiw")
    );

    private void insertUsers(Statement statement) throws SQLException {
        for (AbstractMap.SimpleEntry<String, String> user : USERS) {
            statement.executeUpdate(
                    String.format("INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('%s', '%s')",
                            user.getKey(),
                            user.getValue()
                    )
            );
        }
    }

    private static int getResultsCount(ResultSet rs) throws SQLException {
        int counter = 0;
        while (rs.next()) {
            System.out.printf("%d, %s, %s%n",
                    rs.getInt("ID"),
                    rs.getString("FIRSTNAME"),
                    rs.getString("LASTNAME"));
            counter++;
        }
        return counter;
    }

    private static int getRowsCount(ResultSet rs) throws SQLException {
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(*)");
        }
        return count;
    }

    private static void showQueryResult(ResultSet rs) throws SQLException {
        while (rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + ", " + rs.getString("LASTNAME"));
        }
    }

    private static int getRowsCountFromQuery(ResultSet rs) throws SQLException {
        int counter = 0;
        while (rs.next()) {
            counter++;
        }
        return counter;
    }

    private void insertPosts(Statement statement, int id) throws SQLException {
        statement.executeUpdate(
                String.format("insert into posts(user_id, body) values ('%d', '%s')", id, "First extra post for user " + id
                )
        );
        statement.executeUpdate(
                String.format("insert into posts(user_id, body) values ('%d', '%s')", id, "Second extra post for user " + id
                )
        );
        statement.executeUpdate(
                String.format("insert into posts(user_id, body) values ('%d', '%s')", id, "Third extra post for user " + id
                )
        );
    }
}