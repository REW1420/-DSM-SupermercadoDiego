class inventario {
    var producto = venta()
    var cantidad = venta()



}fun consultarInventario(producto:List<String>,cantidad:List<Int>){

    println("Productos   Cantidad")

    for ((i, producto) in producto.withIndex()){

        println(producto+" - "+cantidad[i])
    }
    println("0- Regresar")
}
