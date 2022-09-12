fun main(args: Array<String>) {

    //Variables
    var opcion : Int
    var opcionSubMenu : Int



    //objeto de la clase
    val credenciales = InicioSesion()
    val venta = venta()

    //Ciclo para el saludo y opcines iniciales

    do {
        println(
            "Bienvenido al sistema Supermercado Diego\n"
        )
        //funcion para el primer menu
        menuInicio();
        opcion = readln().toInt()

        if (opcion == 1) {
            do {


                println("Usuario: ")
                credenciales.lecturaUsuario = readln()
                println("Contraseña")
                credenciales.lecturaContrasena = readln()
                //se muentra un mensaje error por si la contraseña esta mal, si no lo esta entra el do/while del menu

                if ((credenciales.adminUsuario != credenciales.lecturaUsuario || credenciales.adminContrasena != credenciales.lecturaContrasena) && (credenciales.vendedorUsuario != credenciales.lecturaUsuario && credenciales.vendedorContrasena != credenciales.lecturaContrasena) && (credenciales.invitadoUsuario != credenciales.lecturaUsuario || credenciales.invitadoContrasena != credenciales.lecturaContrasena)) {
                    error()
                }

            } while ( (credenciales.adminUsuario!= credenciales.lecturaUsuario && credenciales.adminContrasena != credenciales.lecturaContrasena) && (credenciales.vendedorUsuario != credenciales.lecturaUsuario && credenciales.vendedorContrasena != credenciales.lecturaContrasena) &&  (credenciales.invitadoUsuario != credenciales.lecturaUsuario || credenciales.invitadoContrasena != credenciales.lecturaContrasena))

            //TODO PARA ADMINISTRADOR INICIA AQUI ABAJO

            if (credenciales.adminUsuario == credenciales.lecturaUsuario && credenciales.adminContrasena == credenciales.lecturaContrasena) {

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

            //TODO PARA VENDEDOR AQUI ABAJO INICIA


        };if ( credenciales.vendedorUsuario == credenciales.lecturaUsuario && credenciales.vendedorContrasena == credenciales.lecturaContrasena){


            do {
                menuVendedor(credenciales.vendedorUsuario)
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




            }while (opcion !=3)


            //TODO PARA INVITADO INICIA AQUI ABAJO
        };if (credenciales.invitadoUsuario == credenciales.lecturaUsuario && credenciales.invitadoContrasena == credenciales.lecturaContrasena){
            do {
                menuInvitado(credenciales.invitadoUsuario)
                opcion = readln().toInt()




                if (opcion == 1) {
                    do {

                        //funcion de inventario
                        consultarInventario(venta.productos, venta.cantidad);

                        opcionSubMenu = readln().toInt()
                    } while (opcionSubMenu != 0)
                };




            }while (opcion !=0)


        }

    }while (opcion != 2)
}
