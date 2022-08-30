class venta {

    var producto: List<String> = listOf("producto1","producto2","producto3","producto4","producto5","producto6","producto7","producto8","producto9","producto10")
    var precio: List<Double> = listOf(0.10,5.00,3.00,0.50,0.80,0.30,2.25,2.75,1.80,3.25)

}fun nuevaVenta(producto: List<String>, precio: List<Double>){
    var i:Int = 0
    var j:Int = 1
    println("ID  Productos  Precio")

        for (producto in producto){

            println(""+j+" "+producto+" - "+"$"+precio[i])
            i++
            j++
        }
    println("0- Regresar")
}