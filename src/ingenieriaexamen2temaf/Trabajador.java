package ingenieriaexamen2temaf;

public class Trabajador {
    private int id;
    private String nombre;
    private String puesto;
    private boolean libre;

    public Trabajador(int id, String nombre, String puesto, boolean libre) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.libre = libre;
    }
    
    public boolean estaLibre(){
        return libre;
    }
    
    public void ocupar(){
        libre = false;
    }
    
    public void liberar(){
        libre = false;
    }
}
