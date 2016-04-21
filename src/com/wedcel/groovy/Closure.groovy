package com.wedcel.groovy

/**
 * Created by wangww on 2016/4/21.
 *
 * 闭包
 *
 * 闭包是groovy中最重要特性
 *
 * 除了迭代中会用到很多闭包以外  你也可以自定义闭包
 *
 *
 * 因为闭包是一个代码块，所以能够作为参数进行传递（Groovy 中的函数或方法不能这样做）
 * 闭包在调用的时候才会执行这一事实（不是在定义的时候）使得它们在某些场合上特别有用。
 *
 */
class Closure {


    static void main(args) {

        //定义一个闭包  传入一个参数  对参数加！！ 然后返回
        def excite = { word ->
            return "${word}!!"
        }

        //调用时候 可直接调用 可以call 不传参默认是null  传参必须只能是1个 超过1个会报错
        println excite("www")

        println excite.call("wei")
    }
}
