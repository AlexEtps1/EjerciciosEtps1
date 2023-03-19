package sv.edu.utec.listafrutas;

public class Frutas {

    private String nombre, descripcion;

    public Frutas(String nombre, String descripcion){
        this.nombre=nombre;
        this.descripcion=descripcion;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDescripcion(){
        return descripcion;
    }
}
