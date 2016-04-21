package com.wedcel.groovy

/**
 * Created by wangww on 2016/4/21.
 *
 * 自定义类
 *
 * 这里会自动生成无参和带所有参数的构造函数 构造函数里面可以所有参数 也可以只有某个参数
 *
 * 所有的变量都自动生成get 和 set方法
 */
class Custome {

    def name
    def artist
    def genre

    /**
     * 写tostring 并不需要返回值  直接生成的结果就是返回值
     * @return
     */
    String toString() {
        "${name}, ${artist}, ${getGenre()}"
    }

    /**
     * 虽然会自动生成 但也可以复写 这里的？可以判断为空而不会报空指针异常
     * @return
     */
    def getGenre() {
        genre?.toUpperCase()
    }
}
