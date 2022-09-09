class Login {
    //variables para leer credenciales
    var LecturaUsuario: String = ""
    var LecturaContrasena: String = ""

    //variable para la opcion del inicio de sesion
    var opcionContrasena: Int = 0

    //Credenciales Admin
    var adminUsuario :String = ""
    var adminContrasena :String = ""

    //Credenciales Vendedor
    var vendedorUsuario:String = "ve"
    var vendedorContrasena:String = "ve"

    //crednciales invitado
    var invitadoUsuario:String = "iv"
    var invitadoContrasena:String = "in"


    fun cambiarContrasenaAdmin(){
        println("Cambiar credenciales de Admin")
        println("Ingrese nuevo usuario")
        LecturaUsuario = readln()!!
        adminUsuario = LecturaUsuario
        println("Ingrese nueva contraseña")
        LecturaContrasena = readln()!!
        adminContrasena = LecturaContrasena

        println("Contraseña actualizada\n" + "Por favor, ingrese denuevo\n" + "10-Ok")
        opcionContrasena = readln().toInt()
    }  fun cambiarContrasenaVendedor(){
        println("Cambiar credenciales de Vendedor")
        println("Ingrese nuevo usuario")
        LecturaUsuario = readln()!!
        vendedorUsuario= LecturaUsuario
        println("Ingrese nueva contraseña")
        LecturaContrasena = readln()!!
        vendedorContrasena = LecturaContrasena

        println("Contraseña actualizada\n" + "Por favor, ingrese denuevo\n" + "10-Ok")
        opcionContrasena = readln().toInt()
    }  fun cambiarContrasenaInvitado(){
        println("Cambiar credenciales de Invitado")
        println("Ingrese nuevo usuario")
        LecturaUsuario = readln()!!
        invitadoUsuario = LecturaUsuario
        println("Ingrese nueva contraseña")
        LecturaContrasena = readln()!!
        invitadoContrasena = LecturaContrasena

        println("Contraseña actualizada\n" + "Por favor, ingrese denuevo\n" + "10-Ok")
        opcionContrasena = readln().toInt()
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


