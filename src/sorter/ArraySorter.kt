package sorter

class ArraySorter {
    fun sort(a:Array<Int>){
        return a.sort()
    }
    fun sort(a:IntArray){
        return a.sort()
    }

    fun manualSort(a:IntArray){
        var index = 0 ;
        var i = 0;

        var tmp = 0;

        while(index<a.size){

            while(i<a.size){

                if(a[i]>a[index]){
                    tmp = a[i] ;
                    a[i] = a[index]
                    a[index] = tmp
                }
                else{
                    i++
                }
            }
            i=0;

            index++
        }
    }
}