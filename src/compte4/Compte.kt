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


    abstract fun calculerCommission():Double


}