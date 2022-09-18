fun main(args: Array<String>) {

    //Variables





    //objeto de la clase
    val credenciales = InicioSesion()
    val venta = venta()
    val op = menus()
    val inv = inventario()

    //Ciclo para el saludo y opcines iniciales

    do {
        println(
            "Bienvenido al sistema Supermercado Diego\n"
        )
        //funcion para el primer menu
        menuInicio();
        op.opcion = readln().toInt()

        if (op.opcion == 1) {
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
                    op.opcion = readln().toInt()


                    if (op.opcion == 1) {
                        do {

                            //funcion de venta

                            println("Menu\n" + "1. Realizar venta" + "\n2- Ver precios\n"+"0- Rgresar")



                            op.opcionSubMenu = readln().toInt()

                            if (op.opcionSubMenu == 1) {
                                realizarVenta(
                                    venta.productos,
                                    venta.precio,
                                    venta.cantidad,
                                    venta.id,
                                    venta.ventaCantidad
                                )

                            };if (op.opcionSubMenu == 2){

                                nuevaVenta(venta.productos, venta.precio);
                            }
                        } while (op.opcionSubMenu != 0)
                    };
                    if (op.opcion == 2) {
                        do {

                            //funcion de inventario
                            inv.consultarInventario(venta.productos, venta.cantidad);

                            op.opcionSubMenu = readln().toInt()
                        } while (op.opcionSubMenu != 0)
                    };
                    if (op.opcion == 3) {


                        //funcion para mostrar contraseñas
                        mostrarContrasena(
                            credenciales.adminContrasena,
                            credenciales.adminUsuario,
                            credenciales.vendedorContrasena,
                            credenciales.vendedorUsuario,
                            credenciales.invitadoUsuario,
                            credenciales.invitadoContrasena

                        );


                        op.opcionSubMenu = readln().toInt()

                        if (op.opcionSubMenu == 1) {
                            credenciales.cambiarContrasenaAdmin()
                        };if (op.opcionSubMenu == 2){
                            credenciales.cambiarContrasenaVendedor()
                        };if (op.opcionSubMenu == 3){
                            credenciales.cambiarContrasenaInvitado()
                        }


                    }
                } while (op.opcion != 4 && credenciales.opcionContrasena != 10)

            }

            //TODO PARA VENDEDOR AQUI ABAJO INICIA


        };if ( credenciales.vendedorUsuario == credenciales.lecturaUsuario && credenciales.vendedorContrasena == credenciales.lecturaContrasena){


            do {
                menuVendedor(credenciales.vendedorUsuario)
                op.opcion = readln().toInt()


                if (op.opcion == 1) {
                    do {

                        //funcion de venta

                        println("Menu\n" + "1. Realizar venta" + "\n2- Ver precios\n"+"0- Rgresar")


                        op.opcionSubMenu = readln().toInt()

                        if (op.opcionSubMenu == 1) {
                            realizarVenta(
                                venta.productos,
                                venta.precio,
                                venta.cantidad,
                                venta.id,
                                venta.ventaCantidad
                            )

                        };if (op.opcionSubMenu == 2){

                            nuevaVenta(venta.productos, venta.precio);
                        }
                    } while (op.opcionSubMenu != 0)
                };
                if (op.opcion == 2) {
                    do {

                        //funcion de inventario
                        inv.consultarInventario(venta.productos, venta.cantidad);

                        op.opcionSubMenu = readln().toInt()
                    } while (op.opcionSubMenu != 0)
                };




            }while (op.opcion !=3)


            //TODO PARA INVITADO INICIA AQUI ABAJO
        };if (credenciales.invitadoUsuario == credenciales.lecturaUsuario && credenciales.invitadoContrasena == credenciales.lecturaContrasena){
            do {
                menuInvitado(credenciales.invitadoUsuario)
                op.opcion = readln().toInt()




                if (op.opcion == 1) {
                    do {

                        //funcion de inventario
                        busquedaInventario()
                        op.opcionSubMenu = readln().toInt()

                        if (op.opcionSubMenu==1){

                            do {
                                inv.busquedaPorNombre(venta.productos, venta.cantidad)
                                op.opcionInv = readln().toInt()
                            }while (op.opcionInv !=2)
                        };if (op.opcionSubMenu==2){

                            do {


                                inv.busquedaPorID()

                                op.opcionInv = readln().toInt()
                            }while (op.opcionInv !=2)
                        }
                    } while (op.opcionSubMenu != 0)
                };




            }while (op.opcion !=0)


        }

    }while (op.opcion != 2)
}
