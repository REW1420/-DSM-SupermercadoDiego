import java.util.*

class Inventario {
    var producto = Venta()
    var cantidad = Venta()
    var id = 0
    var nombre = ""

    fun consultarInventario(producto: List<String>, cantidad: List<Int>) {
            //esta funcion imprime el inventario
        println("Productos   Cantidad")

        for ((i, producto) in producto.withIndex()) {

            println(producto + " - " + cantidad[i])
        }
        println("0- Regresar")
    }

    fun busquedaPorID() {
            //peticion de ID

        println("Ingrese el ID del producot")
        id = readln().toInt()
        validacionID()
    }

    fun validacionID() {
            //validaciones del id
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

//peticion de nommbre del producot

            println("Escriba TODO para imprimir sin restricciones o escriba el nombre")
            nombre = readln()
            nombre = nombre.lowercase(Locale.getDefault())
        if (nombre == "todo") impresionTODO(producto,cantidad)
       else validacionNombre(producto, cantidad)



    }
    fun validacionNombre(producto: List<String>, cantidad: List<Int>){
        //valiaciones
        if (!producto.contains(nombre)){
            println("No existe el producto, intentelo denuevo")
            busquedaPorNombre(producto,cantidad)

        }else{

            val id = producto.indexOf(nombre)
            println("Producto               Cantidad")
            println(producto[id] + "               " + cantidad[id])
            println("1- Buscar denuevo\n"+"2. Regresar")

        }

    }fun impresionTODO(producto: List<String>, cantidad: List<Int>){
        //validaciones
        var j = 1
        println("Producto               Cantidad")
        for ((i, productos) in producto.withIndex()){

            println(""+j+"      "+productos+"    - "+"    "+ cantidad[i])
            j++
        }
        println("1- Buscar denuevo\n"+"2. Regresar")
    }
}

//2