package com.wedcel.groovy

/**
 * Created by wangww on 2016/4/21.
 *
 * 了解循环
 * 定义循环方法
 * 定义默认参数
 *
 */
class Loop {

    /**
     * 定义循环方法
     * repeat=2  repeat是一个参数 2是默认值
     * 这样的话 repeat可传可不传 不传的话就是用的默认值
     * 0..<repeat 其实是一个循环体
     *
     * @param val
     * @param repeat
     */
    static def repeat(val,repeat=2){
        for(def i in 0..<repeat){
            println val
        }
    }

    static void main(args) {
        IntRange
        def range = 0..4
        println range.class
        assert range instanceof List
    }
}
