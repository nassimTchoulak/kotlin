package compte4

class CompteDevise(sol:Double,num:String,taux:Double): Compte(solde = sol,numero = num) {
    private var taux:Double = 0.0

    init {
        this.taux = taux
    }

    override fun calculerCommission(): Double {
        return  0.2*this.taux;
    }
}