import com.sun.xml.internal.bind.v2.model.core.ID

class inventario {
    var producto = venta()
    var cantidad = venta()
    var precio = venta()




}fun consultarInventario(producto:List<String>,cantidad:List<Int>) {

    println("Productos   Cantidad")

    for ((i, producto) in producto.withIndex()) {

        println(producto + " - " + cantidad[i])
    }




    /*fun añadirNuevo(producto: List<String>, cantidad: List<Int>, precio: List<Double>) {
        println("Nombre    Precio   Cantidad")

        for ((i, producto) in producto.withIndex()) {

            println(producto[i] + " " + precio + " " + cantidad)
        }

        for ((i, cantidad) in cantidad.withIndex()) {

            println(producto + " " + precio + " " + cantidad[i])
        }

        for ((i, precio) in precio.withIndex()) {

            println(producto + " " + precio[i] + " " + cantidad)
        }

    }*/
}
