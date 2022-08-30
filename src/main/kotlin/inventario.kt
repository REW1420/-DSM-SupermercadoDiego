class inventario {
    var producto: List<String> = listOf("producto1","producto2","producto3","producto4","producto5","producto6","producto7","producto8","producto9","producto10")
    var cantidad: List<Int> = listOf(30,30,5,60,100,500,20,25,30,180)
}fun consultarInventario(producto:List<String>,cantidad:List<Int>){

    var i:Int = 0
    println("Productos   Cantidad")

    for (producto in producto){

        println(producto+" - "+cantidad[i])
        i++
    }
    println("0- Regresar")
}
