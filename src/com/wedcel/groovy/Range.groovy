package com.wedcel.groovy

/**
 * Created by wangww on 2016/4/21.
 *
 * 了解循环中的range的用法
 * groovy.lang.IntRange是AbstractList的子类
 *
 */
class Range {

    static void main(args) {
        IntRange
        def range = 0..4
        println range.class
        assert range instanceof List
    }
}
