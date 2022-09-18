import java.util.*

class inventario {
    var producto = venta()
    var cantidad = venta()
    var op = menus()
    var id = 0

    fun consultarInventario(producto: List<String>, cantidad: List<Int>) {

        println("Productos   Cantidad")

        for ((i, producto) in producto.withIndex()) {

            println(producto + " - " + cantidad[i])
        }
        println("0- Regresar")
    }

    fun busquedaPorID() {


        println("Ingrese el ID del producot")
        id = readln().toInt()
        validacionID()
    }

    fun validacionID() {

        if ((id <= 0) || (id > cantidad.cantidad.size)) {
            println("Error de ID, es 0, negativo o no existe el ID")
            busquedaPorID()
        } else {
            id -= 1
            println("Producto               Cantidad")
            println(producto.productos[id] + "               " + cantidad.cantidad[id])
            println("1- Buscar denuevo\n"+"2. Regresar")
        }
    }

    fun busquedaPorNombre(producto: List<String>, cantidad: List<Int>) {
        var nombre = ""
        var j = 1
        println("Escriba TODO para imprimir sin restricciones o escriba el nombre")
        nombre = readln()
        nombre = nombre.lowercase(Locale.getDefault())


        if (!producto.contains(nombre)){
            println("No existe el producto")
            println("1- Buscar denuevo\n"+"2. Regresar")
        }; if (nombre=="todo"){
            println("Producto               Cantidad")
            for ((i, productos) in producto.withIndex()){

                println(""+j+"      "+productos+"    - "+"    "+ cantidad[id])
                j++
            }
            println("1- Buscar denuevo\n"+"2. Regresar")
        }else{

            var id = producto.indexOf(nombre)
            println("Producto               Cantidad")
            println(producto[id] + "               " + cantidad[id])
            println("1- Buscar denuevo\n"+"2. Regresar")

        }


    }
}