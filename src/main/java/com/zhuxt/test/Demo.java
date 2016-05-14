package com.zhuxt.test;

import com.sun.org.apache.regexp.internal.RE;

import java.io.InputStream;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * 国际化资源绑定测试
 * Created by zhuxt on 16-5-14.
 */
public class Demo {

    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        InputStream in = Demo.class.getResourceAsStream("/conf_en_US.properties");
        properties.load(in);
        in.close();
        //key
        String key = "name";
        String name = properties.getProperty(key);
        System.out.println("name = " + name);

//        ResourceBundle rb = ResourceBundle.getBundle("conf",new Locale("en","US"));
        ResourceBundle rb = ResourceBundle.getBundle("conf");
        System.out.println("name: " + rb.getString("name"));
        System.out.println("message: " + rb.getString("message"));

        Locale locale_zh = new Locale("zh", "CN");
        ResourceBundle rb_zh = ResourceBundle.getBundle("conf", locale_zh);
        System.out.println(rb.getString("name"));

        Locale locale_en = new Locale("en", "US");
        ResourceBundle rb_en = ResourceBundle.getBundle("conf", locale_en);
        System.out.println(rb.getString("name"));

    }


}
