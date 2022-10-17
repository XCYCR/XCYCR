package cn.util;

import cn.Require.require;
import cn.itfish.Students;

import java.util.List;
import java.util.Scanner;

/**
 * @auther:果宁
 * @Date 2022/10/15 17:23
 * @since 1.0.0
 */
public class operatemenu {
    public void menu(require re, List<Students> list,Stuutil stuu){
        System.out.println("选择操作");
        System.out.println("输入11按照姓名查找学生!");
        System.out.println("输入12按照爱好查找学生们!");
        System.out.println("输入22查看学生是否存在？！");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a){
            case 11:
                boolean flag = re.require11(list);
                if(!flag){
                    System.out.println("不存在！");
                }
                break;
            case 12:
                boolean flag1 = re.require12(list);
                if(!flag1){
                    System.out.println("不存在！");
                }
                break;
            case 22: re.require2(stuu,list);
        }
    }
}
