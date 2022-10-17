package cn.Require;

import cn.itfish.Students;
import cn.util.Stuutil;

import java.util.List;
import java.util.Scanner;

/**
 * @auther:果宁
 * @Date 2022/10/15 12:52
 * @since 1.0.0
 */
public class require {
    /*
    * 11是按照姓名查找指定的人
    * 12是按照爱好查找指定的人
    */
    public boolean require11(List<Students> list){
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入学生的姓名！");
        String name11 = sc.next();
        for (int i = 0; i < 10; i++) {
            if(list.get(i).getName().equals(name11)){
                System.out.println(list.get(i));
                flag++;
            }
        }
        if(flag==0)
            return false;
        else
            return true;
    }
    public boolean require12(List<Students> list){
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入学生的爱好！");
        String hobby1 = sc.next();
        for (int i = 0; i < 10; i++) {
            if(list.get(i).getHobby().equals(hobby1)){
                System.out.println(list.get(i));
                flag++;
            }
        }
        if(flag==0)
            return false;
        else
            return true;
    }
    public boolean require2(Stuutil stuu, List list){
        System.out.println("依次输入姓名，性别，体重，身高，爱好！");
        Scanner sc = new Scanner(System.in);
        String names = sc.next();
        String genders = sc.next();
        String weights = sc.next();
        String highers = sc.next();
        String hobbys = sc.next();
        boolean flag = stuu.exit(names,genders,weights,highers,hobbys,list);
        if(flag){
            System.out.println("存在");

        }else{
            System.out.println("不存在");
        }
        return true;
    }
}
