fun concat(a:String ="g",b:Int):String{

    return a + b.toString() ;

}
interface My{
    fun m1()
}

class etudy(val a:String):My{



    override fun m1() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

fun main(){
    println("fddgdf")

    val fn = {a:Int -> 2*a}
    val sub = {a:Int,B:Int->a-B}

    var ty = arrayListOf("jbjb","ygu",5)
    for(i in ty){
        println(i)
    }
    println(concat(b=8)) ;
    println(fn(8))

    println("=======================")
    print("Enter value1: ")
    var v1 = readLine()!!.toInt() ;
    print("Enter value2: ")
    val v2 = readLine()!!.toInt() ;


    println(add(v1,v2))
    println(sub(v1,v2))

}
