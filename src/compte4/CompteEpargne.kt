package compte4

open class CompteEpargne(sol:Double,num:String): Compte(solde = sol,numero = num) {
    override fun calculerCommission(): Double {
       return 0.2;
    }

}