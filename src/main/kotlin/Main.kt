
fun main(args: Array<String>) {

    //Variables
    var opcion: Int = 0
    var opcionSubMenu: Int = 0
    var opcionContrasena: Int = 0
    var LecturaUsuario: String = ""
    var LecturaContrasena: String = ""


    //objeto de la clase
    var credenciales = Login()
    var venta = venta()
    var inventario = inventario()

    //Ciclo para el saludo y opciones iniciales

    do {
        println(
            "Bienvenido al sistema Nombre Supermercado Diego\n"
        )
        //funcion para el primer menu
            menuInicio();
        opcion = readln().toInt()

        if (opcion == 1) {
            do {


                println("Usuario: ")
                LecturaUsuario = readln()
                println("Contraseña: ")
                LecturaContrasena = readln()
                //se muestra un mensaje de error por si la contraseña esta mal; si no lo esta, entra el do/while del menu
                if (credenciales.adminUsuario != LecturaUsuario || credenciales.adminContrasena != LecturaContrasena) {
                    println("Error en contraseña y/o usuario\n" + "Ingrese denuevo")
                }
            } while (credenciales.adminUsuario != LecturaUsuario || credenciales.adminContrasena != LecturaContrasena)

            do {

                menuPrincipal(credenciales.adminUsuario)
                opcion = readln()!!.toInt()


                if (opcion==1){
                    do {

                        //funcion de venta
                        nuevaVenta(venta.productos,venta.precio);

                        println("Menu\n"+"1. Realizar venta"+"\n0- Regresar")

                        opcionSubMenu = readln()!!.toInt()

                        if (opcionSubMenu==1){
                            realizarVenta(venta.productos,venta.precio,venta.cantidad,venta.id,venta.ventaCantidad)

                        }
                    }while (opcionSubMenu==0)
                };
                if (opcion == 2) {
                    do {

                        //funcion de inventario
                       consultarInventario(venta.productos,venta.cantidad);

                        opcionSubMenu = readln()!!.toInt()
                    }while (opcionSubMenu!=0)
                }
                if (opcion == 3) {


                    //funcion para mostrar contraseñas
                   mostrarContrasena(credenciales.adminContrasena,credenciales.adminUsuario,credenciales.vendedorContrasena,credenciales.vendedorUsuario);


                    opcionSubMenu = readln()!!.toInt()

                    if (opcionSubMenu == 1) {
                        println("Cambiar credenciales de Admin")
                        println("Ingrese nuevo usuario")
                        LecturaUsuario = readln()!!
                        credenciales.adminUsuario = LecturaUsuario
                        println("Ingrese nueva contraseña")
                        LecturaContrasena = readln()!!
                        credenciales.adminContrasena = LecturaContrasena

                        println("Contraseña actualizada\n" + "Por favor, ingrese denuevo\n" + "10-Ok")
                        opcionContrasena = readln().toInt()

                    }


                }
            } while (opcion != 4 && opcionContrasena != 10)

        }


    }while (opcion != 2)
}

