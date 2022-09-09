class Login {
    //Credenciales Admin
    var adminUsuario :String = ""
    var adminContrasena :String = ""

    //Credenciales Vendedor
    var vendedorUsuario:String = "ve"
    var vendedorContrasena:String = "ve"




}fun mostrarContrasena(adminContrasena:String, adminUsuario:String, vendedorContrasena:String, vendedorUsuario:String){
    println(
        "Cambiar contreña\n" +
                "1." + adminUsuario + " / " + adminContrasena + "\n" +
                "2." + vendedorUsuario + "/" + vendedorContrasena + "\n" +
                "3.invitado / invitado123\n" + "0.Regresar"
    )
}


