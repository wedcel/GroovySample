package com.wedcel.groovy

/**
 * Created by wangww on 2016/4/21.
 *
 * Main  Groovy
 *
 * groovy里面可以不定义访问权限  默认是public
 */
class Main {


    static void main(args) {

        def sng = new Custome(name:"Le Freak",
                artist:"Chic", genre:"Disco")

        def sng1 = new Custome(name:"Le Freak")

        println sng.toString()

        println sng.getArtist()

        println sng1.getName()

        sng.setArtist("www")

        //这里如果不加？  会报空指针异常 加了？相当于做了null判断 跟swift类似
        println sng1.artist?.toUpperCase()

    }


}
