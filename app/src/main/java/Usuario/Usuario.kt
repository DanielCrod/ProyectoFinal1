package Usuario

class Usuario: java.io.Serializable{
    val email : String
    val nombre : String
    val pass : String

    constructor() {
        email = ""
        nombre = ""
        pass = ""
    }

    constructor(email : String, nombre : String, pass : String) {
        this.email = email
        this.nombre = nombre
        this.pass = pass
    }
}