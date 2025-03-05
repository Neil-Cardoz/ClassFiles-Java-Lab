//StudentOperations.java

import java.sql.*;
import java.util.*;

public class StudentOperations {

    private static final String URL = "jdbc:mysql://localhost:3306/student_db" ;
    private static final String USER = "root" ;
    private static final String PASSWORD = "sit123" ;

    public static void insertStudent(){
        try (
                Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
                PreparedStatement stmt = conn.prepareStatement("INSERT into students (PRN , Name, Branch, Batch, CGPA) VALUES (?,?,?,?,?)")
                ) {
                        Scanner scan = new Scanner(System.in);
                        System.out.println("Enter PRN :");
                        int prn = scan.nextInt();
                        scan.nextLine();
                        System.out.println("Enter Name ");
                        String name = scan.nextLine();
                        System.out.println("Enter Branch ");
                        String branch = scan.nextLine();
                        System.out.println("Enter Batch ");
                        String batch = scan.nextLine();
                        System.out.println("Enter CGPA ");
                        float cgpa = scan.nextFloat();

                        stmt.setInt(1,prn);
                        stmt.setString(2,name);
                        stmt.setString(3,branch);
                        stmt.setString(4,batch);
                        stmt.setFloat(5,cgpa);

                        int numberRows = stmt.executeUpdate();
                        if (numberRows >= 1) {
                            System.out.println("Student Data Inserted");
                        }


        } catch (SQLException e) {
            System.out.println(e);

        }
    }




}
