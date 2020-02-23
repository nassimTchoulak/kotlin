package sorter


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
    println("====================")

   val arr = arrayOf(5,8,98,8,77,9)
    val intArray = intArrayOf(4, 88,3, 2, 1)
    val manual = intArrayOf(4, 88,3, 2, 1,8,7,45,123)



    val sorter = ArraySorter() ;
     sorter.sort(arr)
    sorter.sort(intArray)

    sorter.manualSort(manual)

    for(i in arr){
        println(i)
    }
    for(i in intArray){
        println(i)
    }
    println("====================")

    for(i in manual){
        println(i)
    }

}
