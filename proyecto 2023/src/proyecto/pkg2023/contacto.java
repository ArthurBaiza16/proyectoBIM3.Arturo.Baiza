package proyecto.pkg2023;

public class contacto {

    String telefono,nombre,domicilio;
    public contacto(String telefono,String nombre,String domicilio){
        this.telefono = telefono;
        this.nombre = nombre;
        this.domicilio = domicilio;
    }
    public String verTelefono(){
        return this.telefono;
    }
    public String verNombre(){
        return this.nombre;
    }
    public String verDomicilio(){
        return this.domicilio;
    }
}
