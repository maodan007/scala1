package com.zyx

object Test_Function {
  def main(args: Array[String]): Unit = {

    /* var i = sum(1,3)
     println(i)
     var m = sum02(3,5)
     println(m)

     val ih = sum03(2,3,4,1)
     println(ih)

     sayHello("hello","小咪")

     sayHello02(name="大咪")
     sayHello03("李四")
     println(factorial(5))
     val h = sum04(1)(2)
     println(h)

     var s =sum04(1)(_)
     println(s(2))
     var s2 = sum04 _
     println(s2(2)(1))

     println(sum(1,2)+" | "+multi(1,2))*/


  }

  /*//标准函数
  def sum(x:Int,y:Int):Int={
    return x+y
  }
  def sum02(x:Int,y:Int)={
    x+y
  }

  //可变长参数必须放置在最后
  def sum03(values:Int*)={
    var total=0
    for(i<-values){
      total+=i
    }
    total
  }
  //命名参数
  def sayHello(msg:String,name:String):Unit={
    println(s"${msg}~${name}")
  }
  //参数默认值
  def sayHello02(msg:String="哈喽",name:String):Unit={
    println(s"${msg}~${name}")
  }
  def sayHello03(name:String,msg:String="halou"):Unit={
    println(s"${msg}~${name}")
  }

  //内嵌函数
  def factorial(x:Int):Int={
    def mulit(i:Int):Int={
      if(i>1){
        i*mulit(i-1)
      }else{
        1
      }
    }
    mulit(x)
  }
  //柯里化(Currying)是把接受多个参数的函数变换成接受一个单一参数的函数，并且返回接受余下的参数且返回结果的新函数的技术。
  def sum04(x:Int)(y:Int):Int={
    x+y
  }*/
  //匿名函数|方法 只有参数列表和返回值类型，没有方法名，通常使用匿名函数形式去声明一个函数式变量
  /*var sum =(x:Int,y:Int)=>{x+y}
  var multi = (x:Int,y:Int)=>{x*y}*/

  def sum(x: Int, y: Int): Int = {
    return x + y
  }

  def sum = (x: Int, y: Int) => x + y


}




















