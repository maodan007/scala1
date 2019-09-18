package com.zyx

import java.util.Date

import scala.util.Random

object Test_Scala {
  def main(args: Array[String]): Unit = {
    /* var a = 19
    if(a<=10){
      println("child")
    }else if(a<=20){
      println("boy|girl")
    }else{
      println("man|woman")
    }
  }
  var b =19
  var result=if(b<=10){
    "child"
  }else if(b<=20){
    "boy|girl"
  }else{
    "man|woman"
  }
  println(s"结果：${result}")
  */
    /*var c = 5
    while(c>0){
      print("\t"+c)
      c -= 1
    }*/
    /*do{
      print("\t"+c)
      c -= 1
    } while (c>0)*/
    /*var d = 10
    var break = new Breaks

    break.breakable({
      do{
        print("\t"+d)
        d -= 1
        if(d<=5){
          break.break()
        }
      }while(d>0)
    })*/

    /*var e = Array(1,2,3,4,5)
     //for(item<-e){print(item+"\t")}
     for(i <- 0 until e.length){
       println(e(i))
     }*/

    for (f <- 1 to 9; g <- 1 to f) {
      print(s"${f}*${g}="+f*g+"\t")
      if(f==g){
        println()
      }
    }

    /*
    //for和if的使用
    for(h<-0 to 10; if(h%2!=0)){
      print(h+"\t")
    }*/

    //for和yield关键字实现元素的提取，创建自己(重点)
    /*var k = Array(1,2,3,4,5)
    var res = for(item<-k)yield item*item
    for (elem <- res) {println(elem)}*/

    //match-case(模式匹配)
    /*
    var n = Array(1,2,3)
    var m = n(new Random().nextInt(3))
    var res = m match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case default => null
    }
    println(res)*/

    var a = Array(100, "张三", true, new Date())
    var i = a(new Random().nextInt(4))
    var res = i match {
      case x: Int => s"age:${x}"
      case x: String => s"name:${x}"
      case x: Boolean => s"sex:${x}"
      case _ => "啥都不是"
    }
    println(res)
  }
}
