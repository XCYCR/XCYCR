package cn.itfish;

import javax.naming.Name;
import java.util.*;

/**
 * @auther:果宁
 * @Date 2022/10/14 23:25
 * @since 1.0.0
 */
public class createlist {
    public createlist() {
    }
    public List packet(){
        Students stu1 = new Students("邢晨宇","男","140","178","羽毛球");
//        Map<Integer,Students> map = new HashMap<>();
//        map.put(1,stu1.getName());
        Students stu2 = new Students("魏一杰","男","120","170","羽毛球");
        Students stu3 = new Students("让某","女","130","185","篮球");
        Students stu4 = new Students("李嘉笑","男","130","175","羽毛球");
        Students stu5 = new Students("黄彬","男","120","170","球");
        Students stu6 = new Students("周惠君","男","160","180","乒乓球");
        Students stu7 = new Students("张永超","男","162","178","跑步");
        Students stu8 = new Students("申明轩","男","110","180","熬夜");
        Students stu9 = new Students("僵尸","未知","100","170","吃脑子");
        Students stu10 = new Students("小狗","母","60","30","吃***");
        List<Students> list = new ArrayList<Students>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        list.add(stu5);
        list.add(stu6);
        list.add(stu7);
        list.add(stu8);
        list.add(stu9);
        list.add(stu10);
        return list;
    }
}
