package compte4

abstract class Compte( numero:String, solde:Double){

    private var _solde:Double =0.0
    private var _numero:String = ""


    private var numero:String
        get() = this._numero
        set(value:String) {
            this._numero = value
        }

    private var solde:Double
        get() = this._solde
        set(value:Double) {
            this._solde = value ;
        }

    init{
        this.numero = numero
        this.solde = solde
    }

     fun calculerCommissionToTake():Int{
         return (_solde*calculerCommission()).toInt()
     }

    abstract fun calculerCommission():Double

    fun faireCommission(){
        println(" the number $_numero has $_solde")
        println(" his commission is ${this.calculerCommission()}")
        _solde -= _solde * calculerCommission();
        println(" his sold is $_solde ")
    }

}