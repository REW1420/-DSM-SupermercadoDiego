class Login {
    //Credenciales Admin
    var adminUsuario :String = "admin"
    var adminContrasena :String = "admin123"

    //Credenciales Vendedor
    var vendedorUsuario:String = "vendedor"
    var vendedorContrasena:String = "vendedor123"




}fun mostrarContrasena(adminContrasena:String, adminUsuario:String, vendedorContrasena:String, vendedorUsuario:String){
    println(
        "Cambiar contreña\n" +
                "1." + adminUsuario + " / " + adminContrasena + "\n" +
                "2." + vendedorUsuario + "/" + vendedorContrasena + "\n" +
                "3.invitado / invitado123\n" + "0.Regresar"
    )
}


