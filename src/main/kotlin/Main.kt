fun main(args: Array<String>) {

    //Variables
    var opcion: Int = 0
    var opcionSubMenu: Int = 0



    //objeto de la clase
    val credenciales = Login()
    val venta = venta()
    var inventario = inventario()

    //Ciclo para el saludo y opcines iniciales

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
                credenciales.LecturaUsuario = readln()
                println("Contraseña")
                credenciales.LecturaContrasena = readln()
                //se muentra un mensaje error por si la contraseña esta mal, si no lo esta entra el do/while del menu

                if ((credenciales.adminUsuario != credenciales.LecturaUsuario || credenciales.adminContrasena != credenciales.LecturaContrasena) && (credenciales.vendedorUsuario != credenciales.LecturaUsuario && credenciales.vendedorContrasena != credenciales.LecturaContrasena) ) {
                    println("Error en contraseña y/o usuario\n" + "Ingrese denuevo")
                }

            } while ( (credenciales.adminUsuario!= credenciales.LecturaUsuario && credenciales.adminContrasena != credenciales.LecturaContrasena) && (credenciales.vendedorUsuario != credenciales.LecturaUsuario && credenciales.vendedorContrasena != credenciales.LecturaContrasena))

            if (credenciales.adminUsuario == credenciales.LecturaUsuario && credenciales.adminContrasena == credenciales.LecturaContrasena) {

                do {

                    menuPrincipal(credenciales.adminUsuario)
                    opcion = readln().toInt()


                    if (opcion == 1) {
                        do {

                            //funcion de venta

                            println("Menu\n" + "1. Realizar venta" + "\n2- Ver precios\n"+"0- Rgresar")



                            opcionSubMenu = readln().toInt()

                            if (opcionSubMenu == 1) {
                                realizarVenta(
                                    venta.productos,
                                    venta.precio,
                                    venta.cantidad,
                                    venta.id,
                                    venta.ventaCantidad
                                )

                            };if (opcionSubMenu == 2){

                                nuevaVenta(venta.productos, venta.precio);
                            }
                        } while (opcionSubMenu != 0)
                    };
                    if (opcion == 2) {
                        do {

                            //funcion de inventario
                            consultarInventario(venta.productos, venta.cantidad);

                            opcionSubMenu = readln().toInt()
                        } while (opcionSubMenu != 0)
                    };
                    if (opcion == 3) {


                        //funcion para mostrar contraseñas
                        mostrarContrasena(
                            credenciales.adminContrasena,
                            credenciales.adminUsuario,
                            credenciales.vendedorContrasena,
                            credenciales.vendedorUsuario,
                            credenciales.invitadoUsuario,
                            credenciales.invitadoContrasena

                        );


                        opcionSubMenu = readln().toInt()

                        if (opcionSubMenu == 1) {
                           credenciales.cambiarContrasenaAdmin()
                        };if (opcionSubMenu == 2){
                            credenciales.cambiarContrasenaVendedor()
                        };if (opcionSubMenu == 3){
                            credenciales.cambiarContrasenaInvitado()
                        }


                    }
                } while (opcion != 4 && credenciales.opcionContrasena != 10)

            }
        };if ( credenciales.vendedorUsuario == credenciales.LecturaUsuario && credenciales.vendedorContrasena == credenciales.LecturaContrasena){


            do {
                menuVendedor(credenciales.vendedorUsuario)
                opcion = readln().toInt()


                if (opcion == 1) {
                    do {

                        //funcion de venta
                        nuevaVenta(venta.productos, venta.precio);



                        opcionSubMenu = readln()!!.toInt()

                        if (opcionSubMenu == 1) {
                            realizarVenta(
                                venta.productos,
                                venta.precio,
                                venta.cantidad,
                                venta.id,
                                venta.ventaCantidad
                            )

                        }
                    } while (opcionSubMenu != 0)
                };
                if (opcion == 2) {
                    do {

                        //funcion de inventario
                        consultarInventario(venta.productos, venta.cantidad);

                        opcionSubMenu = readln().toInt()
                    } while (opcionSubMenu != 0)
                };




            }while (opcion !=3)



        }

        }while (opcion != 2)
    }


//hola