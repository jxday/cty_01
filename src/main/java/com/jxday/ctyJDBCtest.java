package com.jxday;

import java.sql.*;


/**
 * 〈JDBC连接测试〉
 *
 * @author cty
 * @ClassName ctyJDBCtest
 * @create 2019-11-10 19:43
 * @Version 1.0.0
 */
public class ctyJDBCtest {
    public static void main(String[] args) throws Exception{
        test1();
    }
    public static void test(){
        Connection conn = null;
        String sql;
        String url = "jdbc:mysql://localhost:3306/sqltest?user=root&password=cnmcnm123123&useUnicode=true&characterEncoding=UTF-8&useSSL=false";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("加载驱动类");

            conn = DriverManager.getConnection(url);
            if (!conn.isClosed()) {
                System.out.println("数据库连接成功");
            }
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("数据库驱动没有安装");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("数据库连接失败");
        }
    }

    public static void test1(){
        Connection con;
        //jdbc驱动
        String driver="com.mysql.jdbc.Driver";
        //这里我的数据库是cxxt
        String url="jdbc:mysql://localhost:3306/sqltest";
        String user="study1";
        String password="jxday1";
        try {
            //注册JDBC驱动程序
            Class.forName(driver);
            //建立连接
            con = DriverManager.getConnection(url, user, password);
            if (!con.isClosed()) {
                System.out.println("数据库连接成功");
            }
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("数据库驱动没有安装");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("数据库连接失败");
        }
    }
}
