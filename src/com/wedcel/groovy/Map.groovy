package com.wedcel.groovy

/**
 * Created by wangww on 2016/4/21.
 *
 * 映射 或者是 map
 */
class Map {


    static void main(args) {

        //定义一个map
        def hash = [name:"Andy", "VPN-#":45]

        assert hash.getClass() == java.util.LinkedHashMap

        //放入数据
        hash.put("id", 23)
        hash.age=26

        //获取数据
        println hash.get("id")
        println hash.age

        //迭代

        // it
        hash.each {
            println it.key+"--- "+it.value
        }
        // 自定义
        hash.each { key,value->
            println key+"--- "+value
        }
        // $获取自定义的值
        hash.each { key,value->
            println "${key} --- ${value}"
        }
    }
}
