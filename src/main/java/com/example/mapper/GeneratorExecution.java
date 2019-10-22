package com.example.mapper;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.*;

public class GeneratorExecution {
    public static void generator(){

        List<String> warnings=new ArrayList<String>();
        try {
//		导入配置表mybatis-generator.xml
            File configFile=new File("C:\\Users\\Administrator\\Desktop\\Oracle\\MavenDemo\\src\\main\\java\\resources\\mybatis\\mybatis-generator.xml");
//		解析
            ConfigurationParser cp=new ConfigurationParser(warnings);
            Configuration config=cp.parseConfiguration(configFile);
//		是否覆盖
            DefaultShellCallback dsc=new DefaultShellCallback(true);
            MyBatisGenerator mg=new MyBatisGenerator(config, dsc, warnings);
            mg.generate(null);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * @param args
     */
//    public static void main(String[] args) {
//        GeneratorExecution.generator();
//        System.out.println("done!");
//    }

}

