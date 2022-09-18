class menus {
    var opcion : Int = 0
    var opcionSubMenu : Int = 0
    var opcionInv = 0
    var credenciales = InicioSesion()
    var adminUsuario = credenciales.adminUsuario
    var vendedorUsuario = credenciales.vendedorUsuario
    var invitadoUsuario = credenciales.invitadoUsuario
}fun menuInicio(){
    println("Menu\n" + "1. Iniciar sesion\n" + "2. Cerrar programa")
}fun menuPrincipal(adminUsuario:String){
    println("Bienvenido " + adminUsuario + " \n" + "¿Qué desea hacer?\n" + "1.Venta nueva \n" + "2.Consultar inventario\n" + "3.Cambiar contraseña\n" + "4.Cerrar sesion")
}fun menuVendedor(vendedorUsuario:String){
    println("Bienvenido " + vendedorUsuario + " \n" + "¿Qué desea hacer?\n" + "1.Venta nueva \n" + "2.Consultar inventario\n" + "3.Cerrar sesion")
}fun menuInvitado(invitadoUsuario:String){
    println("Bienvenido " + invitadoUsuario + " \n" + "¿Qué desea hacer?\n" + "1.Consultar inventario \n" + "0.Cerrar sesion")
}fun error(){
    println("Error en contraseña y/o usuario\n" + "Ingrese denuevo")
}fun busquedaInventario(){
    println("Escoja como buscar\n"+"1. Por nombre\n"+"2. Por ID\n"+"0. Regresar")
}