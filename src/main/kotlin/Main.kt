fun main(args: Array<String>) {

    //Variables





    //objeto de la clase
    val credenciales = InicioSesion()
    val venta = Venta()
    val op = Menus()
    val inv = Inventario()

    //Ciclo para el saludo y opcines iniciales

    do {

       saludo()
        //funcion para el primer menu
        menuInicio()
        op.opcionInicial = readln().toInt()

        if (op.opcionInicial == 1) {
            do {

                credenciales.inicioDeSesion()

                //se muentra un mensaje error por si la contraseña esta mal, si no lo esta entra el do/while del menu

                if ((credenciales.adminUsuario != credenciales.lecturaUsuario || credenciales.adminContrasena != credenciales.lecturaContrasena) && (credenciales.vendedorUsuario != credenciales.lecturaUsuario && credenciales.vendedorContrasena != credenciales.lecturaContrasena) && (credenciales.invitadoUsuario != credenciales.lecturaUsuario || credenciales.invitadoContrasena != credenciales.lecturaContrasena)) {
                    error()
                }

                //while que no permite el inicio de sesion si no concuerdan las credenciales
            } while ( (credenciales.adminUsuario!= credenciales.lecturaUsuario && credenciales.adminContrasena != credenciales.lecturaContrasena) && (credenciales.vendedorUsuario != credenciales.lecturaUsuario && credenciales.vendedorContrasena != credenciales.lecturaContrasena) &&  (credenciales.invitadoUsuario != credenciales.lecturaUsuario || credenciales.invitadoContrasena != credenciales.lecturaContrasena))

                        //TODO PARA ADMINISTRADOR INICIA AQUI ABAJO

            if (credenciales.adminUsuario == credenciales.lecturaUsuario && credenciales.adminContrasena == credenciales.lecturaContrasena) {
                do {
                        //menu principal
                    menuPrincipal(credenciales.adminUsuario)
                    op.opcionAdmin = readln().toInt()
                            if (op.opcionAdmin == 1) {
                                do {
                                    // funcion de venta
                                realizarVenta(
                                    venta.productos,
                                    venta.precio,
                                    venta.cantidad,
                                    venta.id,
                                    venta.ventaCantidad
                                )
                                    opciones()
                                    op.opcion= readln().toInt()
                            }while (op.opcion !=0)


                            };if (op.opcionAdmin == 2){
                                //menu de busqueda
                                busquedaInventario()
                                op.opcion = readln().toInt()

                                    if (op.opcion==1){
                                        do {

                                            //funcion para buscar por nombre
                                            inv.busquedaPorNombre(venta.productos, venta.cantidad)
                                            op.opcioninventario = readln().toInt()
                                        }while ( op.opcioninventario !=2)
                                    };if (op.opcion == 2){
                                            do {

                                                    //funcion para buscar por ID
                                                inv.busquedaPorID()

                                                op.opcioninventario = readln().toInt()
                                            }while ( op.opcioninventario !=2)
                                                         }
                            };if (op.opcionAdmin == 3){
                        //funcion para mostrar contraseñas
                        mostrarContrasena(
                            credenciales.adminContrasena,
                            credenciales.adminUsuario,
                            credenciales.vendedorContrasena,
                            credenciales.vendedorUsuario,
                            credenciales.invitadoUsuario,
                            credenciales.invitadoContrasena

                        )

                        // if para hacer el cambio de las contraseñas
                        op.opcion = readln().toInt()
                        if (op.opcion == 1) {
                            credenciales.cambiarContrasenaAdmin()
                        };if (op.opcion == 2){
                            credenciales.cambiarContrasenaVendedor()
                        };if (op.opcion == 3){
                            credenciales.cambiarContrasenaInvitado()
                        }
                            }
                } while (op.opcionAdmin != 4 && credenciales.opcionContrasena != 10)
                //TODO PARA VENDEDOR AUI INICIA
            };if ( credenciales.vendedorUsuario == credenciales.lecturaUsuario && credenciales.vendedorContrasena == credenciales.lecturaContrasena) {
                do {

                    //menu de vendedor
                    menuVendedor(credenciales.vendedorUsuario)
                    op.opcionVen = readln().toInt()
                    if (op.opcionVen == 1){
                        do {
                                //funcion de venta
                            realizarVenta(
                                venta.productos,
                                venta.precio,
                                venta.cantidad,
                                venta.id,
                                venta.ventaCantidad
                            )
                            println("1-Volver a verder\n" + "0-Regresar")
                            op.opcion= readln().toInt()
                        }while (op.opcion !=0)
                    };if (op.opcionVen == 2){

                        //menu de busqueda
                        busquedaInventario()
                        op.opcion = readln().toInt()

                        if (op.opcion==1){
                            do {
                                //busqueda por nommbre
                                inv.busquedaPorNombre(venta.productos, venta.cantidad)
                                op.opcioninventario = readln().toInt()
                            }while (op.opcioninventario !=2)
                        };if (op.opcion == 2){
                            do {
                                    //busuqeda por id

                                inv.busquedaPorID()

                                op.opcioninventario = readln().toInt()
                            }while (op.opcioninventario !=2)
                        }
                    }
                }while (op.opcionVen!=3)
                //TODO PARA INVITADO AUI INICIA
            };if (credenciales.invitadoUsuario == credenciales.lecturaUsuario && credenciales.invitadoContrasena == credenciales.lecturaContrasena) {
                do {

                    //menu de invitado
                    menuInvitado(credenciales.invitadoUsuario)
                    op.opcionInv = readln().toInt()
                    if (op.opcionInv == 1){
                        busquedaInventario()
                        op.opcion = readln().toInt()
                        if (op.opcion==1){
                            do {
                                inv.busquedaPorNombre(venta.productos, venta.cantidad)
                                op.opcioninventario = readln().toInt()
                            }while (op.opcioninventario !=2)
                        };if (op.opcion == 2){
                            do {


                                inv.busquedaPorID()

                                op.opcioninventario = readln().toInt()
                            }while (op.opcioninventario !=2)
                        }
                    }
                }while (op.opcionInv!=2)
            }
            }





        }while (op.opcionInicial != 2 )
}

//2