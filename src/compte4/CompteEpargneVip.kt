package compte4

class CompteEpargneVip(Solde:Double,numero:String):CompteEpargne(Solde,numero) {
    override fun calculerCommission(): Double {
        return 0.1 ;
    }
}