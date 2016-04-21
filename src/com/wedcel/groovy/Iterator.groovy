package com.wedcel.groovy

/**
 * Created by wangww on 2016/4/21.
 *
 * 迭代
 *
 * 除了map list的迭代以外   凡是集合或一系列的内容，都可以进行迭代。
 */
class Iterator {


    static void main(args) {
        "ITERATION".each{
            println it.toLowerCase()
        }
    }
}
