package com.example.comtroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.*;

/**
 * @author Chingyu Mo
 * @create 2016-07-23-20:20
 */
// 注解标注此类为springmvc的controller，url映射为"/home"
@Controller
@RequestMapping("/home")
public class HomeController {
    //添加一个日志器
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    //映射一个action
    @RequestMapping("/index")
    public String index(Model model) throws SQLException, ClassNotFoundException {
        //输出日志文件
        logger.info("the first jsp pages");
        model.addAttribute("word","hello word.............." +
                "asd");
        System.out.println("封装的model="+model);
        System.out.println("封装的model=asddddddddddd");


        //orcl为oracle数据库中的数据库名，localhost表示连接本机的oracle数据库
        //1521为连接的端口号
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        //system为登陆oracle数据库的用户名
        String user="user_info";
        //manager为用户名system的密码
        String password="me";
        /* 连接数据库的方法 */

        //初始化驱动包
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //根据数据库连接字符，名称，密码给conn赋值
        Connection conn=DriverManager.getConnection(url, user, password);
        //测试能否与oracle数据库连接成功
        String sql = "SELECT * FROM test1";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        System.out.println("asd486461");
        while(rs.next()){
            model.addAttribute("username",rs.getString("username").toString());
            System.out.println(rs.getString("username").toString());
            System.out.println("asd486461");
        }
        rs.close();
        stmt.close();
        conn.close();
        //返回一个index.jsp这个视图
        return "index";
    }
}
