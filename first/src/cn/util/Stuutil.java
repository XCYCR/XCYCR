package cn.util;

import cn.itfish.Students;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Properties;
import java.lang.String;

/**
 * @auther:果宁
 * @Date 2022/10/14 23:26
 * @since 1.0.0
 */
public class Stuutil {
    /*利用配置文件来进行添加学生*/

    private static String name;
    private static String gender;
    private static String weight;
    private static String higher;
    private static String hobby;
    /*添加一个学生仅仅作为测试，与本次作业无关*/
    public List<Students> addStudent(List<Students> list) {
        Properties pro = new Properties();
        ClassLoader classLoader = Stuutil.class.getClassLoader();
        URL res = classLoader.getResource("infor.Properties");
        String path = res.getPath();
        try {
            pro.load(new FileReader(path));
            name = pro.getProperty("name");
            gender = pro.getProperty("gender");
            weight = pro.getProperty("weight");
            higher = pro.getProperty("higher");
            hobby = pro.getProperty("hobby");
            Students stu = new Students(name,gender,weight,higher,hobby);
            list.add(stu);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    public boolean exit(String name,String gender,String weight,String higher,String hobby,List list){
        Students stu = new Students(name,gender,weight,higher,hobby);
        for (int i = 0; i < 10; i++) {
            if(stu.toString().equals(list.get(i).toString())){
                System.out.println(list.get(i));
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

}
