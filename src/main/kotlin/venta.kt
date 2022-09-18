import java.io.File
import java.io.InputStream

class venta {

    var productos: MutableList<String> = mutableListOf("dulce","queso procesado","jamon","arroz","jabon unidad","mentas","requeson","salchichas","gel cabello","detergente")
    var precio: MutableList<Double> = mutableListOf(0.10,5.00,3.00,0.50,0.80,0.30,2.25,2.75,1.80,3.25)
    var cantidad: MutableList<Int> = mutableListOf(30,30,5,60,100,500,20,25,30,180)
    var id : Int = 0
    var ventaCantidad: Int = 0


}fun nuevaVenta(productos: List<String>, precio: List<Double>){
    var j:Int = 1
    println("ID         Productos         Precio")

    for ((i, productos) in productos.withIndex()){

        println(""+j+"     "+productos+"   - "+"   $"+precio[i])
        j++
    }

}fun realizarVenta(productos: List<String>, precio: List<Double>,cantidad: List<Int>,id:Int,ventaCantidad:Int){
    var id: Int=0
    var ventaCantidad: Int = 0
    var opcion:Int = 0
    var total:Double = 0.0
    var ventaTotal: Int = 0


    //listas para el recibo
    var reciboProductos: MutableList<String> = mutableListOf()
    var reciboCantidad: MutableList<Int> = mutableListOf()
    var reciboTotal: MutableList<Double> = mutableListOf()

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

        while (ventaCantidad <= 0) {
            println(productos[id] + " No es posible vender 0 o cantidades negativas: " + cantidad[id] + " ¿cuánto desea vender?")
            ventaCantidad = readln().toInt()
        }

        //proceso para calcular el total de la venta y asi guardarlo en la lista.

        total = (precio[id]*ventaCantidad)
        reciboProductos.add(productos[id])
        reciboCantidad.add(ventaCantidad)
        reciboTotal.add(total)


        println("1. Agregar Producto"+"\n2. Imprimir recibo"+"\n3. Regresar");
        opcion= readln().toInt()

        //impresión del recibo
        if (opcion==2){
            println("Producto:             Cantidad:                Total:")


            for ( (x,reciboCantidad ) in reciboCantidad.withIndex()){

                println(reciboProductos[x] +"               "+   reciboCantidad+"                    $"+   reciboTotal[x] )


                fun recibo(productos:List<String>, precio: List<Double>,cantidad: List<Int>,id:Int,ventaCantidad:Int){
                    val inputStream: InputStream = File("C:/Users/Win10pro/IdeaProyects/recibo.txt").inputStream()

                    val lineas = mutableListOf<String>()
                    inputStream.bufferedReader().useLines { lines -> lines.forEach { lineas.add(it) }}
                    var recibo = 1
                    lineas.forEach{ println("$recibo+"+it) }
                }
            }


            break

        }

    }while (opcion!=3)



}