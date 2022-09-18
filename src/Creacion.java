import java.util.LinkedList;

public class Creacion {

    LinkedList alamacen = new LinkedList();

    String nombre, apellido;

    public Creacion(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void generar(int x){

        for(int i = 0; i < x; i++){
            alamacen.add(crear());
        }

    }

    public Creacion crear(){
        return new Creacion(this.nombre, this.apellido);
    }
}
