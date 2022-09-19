class InicioSesion {
    //variables para leer credenciales
    var lecturaUsuario: String = ""
    var lecturaContrasena: String = ""

    //variable para la opcion del inicio de sesion
    var opcionContrasena: Int = 0

    //Credenciales Admin
    var adminUsuario :String = "admin"
    var adminContrasena :String = "admin123"

    //Credenciales Vendedor
    var vendedorUsuario:String = "vendedor"
    var vendedorContrasena:String = "vendedor123"

    //crednciales invitado
    var invitadoUsuario:String = "invitado"
    var invitadoContrasena:String = "invitado123"

//TODO LO DE CAMBIAR O CONTRASEÑAS Y REFERENTES ESTA AQUI
    fun cambiarContrasenaAdmin(){
        println("Cambiar credenciales de Admin")
        println("Ingrese nuevo usuario")
        lecturaUsuario = readln()
        adminUsuario = lecturaUsuario
        println("Ingrese nueva contraseña")
        lecturaContrasena = readln()
        adminContrasena = lecturaContrasena

        println("Contraseña actualizada\n" + "Por favor, ingrese denuevo\n" + "10-Ok")
        opcionContrasena = readln().toInt()
    }  fun cambiarContrasenaVendedor(){
        println("Cambiar credenciales de Vendedor")
        println("Ingrese nuevo usuario")
        lecturaUsuario = readln()
        vendedorUsuario= lecturaUsuario
        println("Ingrese nueva contraseña")
        lecturaContrasena = readln()
        vendedorContrasena = lecturaContrasena

        println("Contraseña actualizada\n" + "Por favor, ingrese denuevo\n" + "10-Ok")
        opcionContrasena = readln().toInt()
    }  fun cambiarContrasenaInvitado(){
        println("Cambiar credenciales de Invitado")
        println("Ingrese nuevo usuario")
        lecturaUsuario = readln()
        invitadoUsuario = lecturaUsuario
        println("Ingrese nueva contraseña")
        lecturaContrasena = readln()
        invitadoContrasena = lecturaContrasena

        println("Contraseña actualizada\n" + "Por favor, ingrese denuevo\n" + "10-Ok")
        opcionContrasena = readln().toInt()
    } fun inicioDeSesion(){
        println("Usuario: ")
        lecturaUsuario = readln()
        println("Contraseña")
        lecturaContrasena = readln()
    }


}fun mostrarContrasena(adminContrasena:String, adminUsuario:String, vendedorContrasena:String, vendedorUsuario:String, invitadoUsuario:String, invitadoContrasena:String){
    println(
        "Cambiar contreña\n" +
                "1. Adimistrador: " + adminUsuario + " / " + adminContrasena + "\n" +
                "2. Vendedor: " + vendedorUsuario + "/" + vendedorContrasena + "\n" +
                "3. Invitado:" +invitadoUsuario +"/" + invitadoContrasena +"\n" +
                "0.Regresar"
    )
}


//1