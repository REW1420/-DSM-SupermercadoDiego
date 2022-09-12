class menus {

    var credenciales = Login()
    var adminUsuario = credenciales.adminUsuario
}fun menuInicio(){
    println("Menu\n" + "1. Iniciar sesion\n" + "2. Cerrar programa")
}fun menuPrincipal(adminUsuario:String){
    println("Bienvenido " + adminUsuario + " \n" + "¿Qué desea hacer?\n" + "1.Venta nueva \n" + "2.Consultar inventario\n" + "3.Cambiar contraseña\n" + "4.Cerrar sesion")
}fun menuVendedor(adminUsuario:String){
    println("Bienvenido " + adminUsuario + " \n" + "¿Qué desea hacer?\n" + "1.Venta nueva \n" + "2.Consultar inventario\n" + "3.Cerrar sesion")
}fun menuInventario(adminUsuario:String){
    println("Bienvenido " + adminUsuario + " \n" + "¿Qué desea hacer?\n" + "1.mostrar \n" + "2.Cerrar sesion")
}