package com.wedcel.groovy

import java.lang.reflect.Array

/**
 * Created by wangww on 2016/4/21.
 *
 * 简单定义集合
 * 以及集合的各种操作
 *
 */
class Collection {


    static void main(args) {

        //定义一个集合  Tips：这里是集合 不是数组
        def coll = ["Groovy", "Java", "Ruby"]


        //添加数据的三种方式

        coll.add("Python")  //普通java方式
        coll << "Smalltalk" //操作符方式
        coll[5] = "Perl"   //下标操作方式


        println coll.size()

        println coll[coll.size()-1]+"---"+coll[coll.size()-2]

        //判断是一个集合
        assert coll instanceof ArrayList


        //集合 中加减 集合
        def numbers = [1,2,3,4]
        assert numbers + 5 == [1,2,3,4,5]
        assert numbers - [2,3] == [1,4]


        //each  循环输出 闭包默认参数是it
        numbers.each {
            print it+" "
        }

        println ""
        println "every:"

        //every 操作 判断  返回boolean
        def isMoreThanZero = numbers.every{ it>0 }
        println isMoreThanZero


        //any 操作 判断  返回boolean
        def isAny = numbers.any{ it>3 }
        println isAny


        println "join:"

        //join 方法
        assert numbers.join(",") == "1,2,3,4"
        numbers.join(",").each {
            print it+" "
        }

        println ""
        println "inject:"


        //inject 方法  遍历集合，第一次将传递的值和集合元素传给闭包，将处理结果作为传递的值，和下一个集合元素传给闭包，依此类推
        def list = [1, 2, 3, 4]
        def count = list.inject(10){result,it->
            result=result+it
        };
        println count

        println ""

        println "count:"
        //count操作符  统计出现次数
        [1,2,3,4,3].count(2).each {
            print it+" "
        }
        assert [1,2,3,4,3].count(3) == 2
    }
}
