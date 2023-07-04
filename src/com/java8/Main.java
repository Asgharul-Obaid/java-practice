package com.java8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

  public class Main
{
    public static void main(String a[])
    {
        String url = "jdbc:mysql://localhost:3306/file";
        String user = "root";
        String pass = "root";
        Scanner k = new Scanner(System.in);
        System.out.println("enter name");
        String name = k.next();
        System.out.println("enter roll no");
        int roll = k.nextInt();
        System.out.println("enter class");
        String cls =  k.next();
        String sql = "insert into student1 values('"+name+"',"+roll+",'"+cls+"')";
        Connection con=null;
        try
        {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            con = DriverManager.getConnection(url,user,pass);
            Statement st = con.createStatement();
            int m = st.executeUpdate(sql);
            if (m>0)
                System.out.println("inserted successfully : "+sql);
            else
                System.out.println("insertion failed");
            con.close();
        }
        catch(Exception ex)
        {
            System.err.println(ex);
        }
    }
}