class venta {

    var productos: MutableList<String> = mutableListOf("producto1","producto2","producto3","producto4","producto5","producto6","producto7","producto8","producto9","producto10")
    var precio: MutableList<Double> = mutableListOf(0.10,5.00,3.00,0.50,0.80,0.30,2.25,2.75,1.80,3.25)
    var cantidad: MutableList<Int> = mutableListOf(30,30,5,60,100,500,20,25,30,180)
    var id : Int = 0
    var ventaCantidad: Int = 0


}fun nuevaVenta(productos: List<String>, precio: List<Double>){
    var j:Int = 1
    println("ID  Productos  Precio")

    for ((i, productos) in productos.withIndex()){

        println(""+j+" "+productos+" - "+"$"+precio[i])
        j++
    }
}fun realizarVenta(productos: List<String>, precio: List<Double>,cantidad: List<Int>,id:Int,ventaCantidad:Int){
    var id: Int=0
    var ventaCantidad: Int = 0
    var opcion:Int = 0
    var total:Double = 0.0

    //listas para el recivo
    var recivoProductos: MutableList<String> = mutableListOf()
    var recivoCantidad: MutableList<Int> = mutableListOf()
    var recivoTotal: MutableList<Double> = mutableListOf()

    do {


        println("Ingrese el ID del producto que quiere vender")
        id = readln().toInt()
        id = (id - 1)

        println(productos[id] + " Existen: " + cantidad[id] + " unidades de este producto, ¿cuánto desea vender?")
        ventaCantidad = readln().toInt()

        if (ventaCantidad > cantidad[id]) {
            println("Lo sentimos solo existen " + cantidad[id] + " de este producto, ingrese de nuevo la cantidad")

            println(productos[id] + " Existen: " + cantidad[id] + " ¿cuánto desea vender?")
            ventaCantidad = readln().toInt()
        }

        //proceso para calcular el total de la venta y asi guardalor en la lista

        total = (precio[id]*ventaCantidad)
        recivoProductos.add(productos[id])
        recivoCantidad.add(ventaCantidad)
        recivoTotal.add(total)


        println("1. Agregar Producto"+"2. Imprimir recivo"+"3. Regresar");
        opcion= readln().toInt()

        //imprecion del recivo
        if (opcion==2){
            println("Producto   Cantidad   Precio")

            for ( (x, recivoCantidad) in recivoCantidad.withIndex()){

                println(" "+recivoProductos[x] +" "+recivoCantidad+" "+recivoTotal[x])


            }


        }


    }while (opcion!=3)




}