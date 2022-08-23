fun main(args: Array<String>) {

    //Variables
    var opcion: Int = 0
    var opcionSubMenu: Int = 0
    var opcionContrasena: Int = 0
    var LecturaUsuario: String = ""
    var LecturaContrasena: String = ""

    //objeto de la clase
    var credenciales = Login()

    //Ciclo para el saludo y opcines iniciales

    do {
        println(
            "Bienvenido al sistema Nombre Supermercado Diego\n"
        )
        println("Menu\n" + "1. Iniciar sesion\n" + "2. Cerrar programa")
        opcion = readln().toInt()

        if (opcion == 1) {
            do {


                println("Usuario: ")
                LecturaUsuario = readln()
                println("Contraseña")
                LecturaContrasena = readln()
                //se muentra un mensaje error por si la contraseña esta mal, si no lo esta entra el do/while del menu
                if (credenciales.adminUsuario != LecturaUsuario || credenciales.adminContrasena != LecturaContrasena) {
                    println("Erro en contraseña y/o usuario\n" + "Ingrese denuevo")
                }
            } while (credenciales.adminUsuario != LecturaUsuario || credenciales.adminContrasena != LecturaContrasena)

            do {
                println("Bienvenido " + credenciales.adminUsuario + " \n" + "¿Qué desea hacer?\n" + "1.Venta nueva \n" + "2.Consultar inventario\n" + "3.Cambiar contraseña\n" + "4.Cerrar sesion")
                opcion = readln()!!.toInt()


                if (opcion==1){
                    do {
                        println(
                            "Productos\n" +
                                    "1- producto1 c/u \$0.10\n" +
                                    "2- producto2 c/u \$5.00\n" +
                                    "3- producto3 c/u \$3.00\n" +
                                    "4- producto4 c/u \$0.50\n" +
                                    "5- producto5 c/u \$ 0.80\n" +
                                    "6- producto6 c/u \$0.30\n" +
                                    "7- producto7 c/u \$ 2.25\n" +
                                    "8- producto8 c/u \$ 2.75\n" +
                                    "9- producto9 c/u \$1.80\n" +
                                    "10- producto10 c/u \$3.25\n" +
                                    "0- Regresar")
                        opcionSubMenu = readln()!!.toInt()
                    }while (opcionSubMenu!=0)
                };
                if (opcion == 2) {
                    do {
                        println(
                            "PRODUCTO: CANTIDAD: unidades\n" +
                                    "1- producto1 30\n" +
                                    "2- producto2 5\n" +
                                    "3- producto3 60\n" +
                                    "4- producto4 100\n" +
                                    "5- producto5 500\n" +
                                    "6- producto6 20\n" +
                                    "7- producto7 25\n" +
                                    "8- producto8 30\n" +
                                    "9- producto9 180\n" +
                                    "10- producto10 50\n" +
                                    "0- Regresar"
                        )
                        opcionSubMenu = readln()!!.toInt()
                    }while (opcionSubMenu!=0)
                };
                if (opcion == 3) {

                    println(
                        "Cambiar contreña\n" +
                                "1." + credenciales.adminUsuario + " / " + credenciales.adminContrasena + "\n" +
                                "2." + credenciales.vendedorUsuario + "/" + credenciales.vendedorContrasena + "\n" +
                                "3.invitado / invitado123\n" + "0.Regresar"
                    )
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

