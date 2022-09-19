class Menus {
    var opcion : Int = 0
    var opcionInicial = 0
    var opcionAdmin : Int = 0
    var opcionInv = 0
    var opcioninventario = 0
    var opcionVen = 0


    //TODOS LOS MENUS CON OPCIONES SEESCUENTRAN AQUI Y LAS VARIABLES DE OPCIONES IGUAL
}fun menuInicio(){
    println("Menu\n" + "1. Iniciar sesion\n" + "2. Cerrar programa")
}fun menuPrincipal(adminUsuario:String){
    println("Bienvenido " + adminUsuario + " \n" + "¿Qué desea hacer?\n" + "1.Venta nueva \n" + "2.Consultar inventario\n" + "3.Cambiar contraseña\n" + "4.Cerrar sesion")
}fun menuVendedor(vendedorUsuario:String){
    println("Bienvenido " + vendedorUsuario + " \n" + "¿Qué desea hacer?\n" + "1.Venta nueva \n" + "2.Consultar inventario\n" + "3.Cerrar sesion")
}fun menuInvitado(invitadoUsuario:String){
    println("Bienvenido " + invitadoUsuario + " \n" + "¿Qué desea hacer?\n" + "1.Consultar inventario \n" + "2.Cerrar sesion")
}fun error(){
    println("Error en contraseña y/o usuario\n" + "Ingrese denuevo")
}fun busquedaInventario(){
    println("Escoja como buscar\n"+"1. Por nombre\n"+"2. Por ID\n"+"0. Regresar")
}fun saludo(){
    println(
        "Bienvenido al sistema Supermercado Diego\n"
    )
}fun opciones(){
    println("1-Volver a verder\n" + "0-Regresar")

}
//1