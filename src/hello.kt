import  sorter.*
import compte4.*

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

    var compte1:Compte = CompteEpargne(2000.0,"777774")
    var compte2:Compte = CompteEpargneVip(2000.0,"12345")
    var compte3:Compte = CompteDevise(2000.0,"12346588",1.5)

    var arr12  = listOf(compte1,compte2, compte3)

    for(i in arr12){
        i.faireCommission()
        println("")
    }


}
