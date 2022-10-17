package cn.util;

import cn.Require.require;
import cn.itfish.Students;
import cn.itfish.createlist;
import cn.util.Stuutil;
import cn.util.operatemenu;

import javax.naming.Name;
import java.util.*;

import java.util.List;

/**
 * @auther:果宁
 * @Date 2022/10/15 0:20
 * @since 1.0.0
 */
public class test {
    public static void main(String[] args) {
        //创建封装类对象
        createlist cl = new createlist();
        //创建学生工具对象
        Stuutil stuu = new Stuutil();
        //调用方法进行封装
        List<Students> list = cl.packet();
        //实现需求2
        require re = new require();
        operatemenu oper = new operatemenu();
        oper.menu(re,list,stuu);
    }
}
