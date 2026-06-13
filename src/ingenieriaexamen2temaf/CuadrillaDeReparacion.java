package ingenieriaexamen2temaf;

import java.util.ArrayList;

public class CuadrillaDeReparacion {
    private int nroCuadrilla;
    private ArrayList<Trabajador> trabajadores; 
    private LiderCuadrilla lider;
    private String equipamiento;
    private String materiales;

    public CuadrillaDeReparacion(int nroCuadrilla, ArrayList<Trabajador> trabajadores, LiderCuadrilla lider, String equipamiento, String materiales) {
        this.nroCuadrilla = nroCuadrilla;
        this.trabajadores = trabajadores;
        this.lider = lider;
        this.equipamiento = equipamiento;
        this.materiales = materiales;
    }
    
    public void agregarTrabajador(Trabajador trabajador){
        trabajadores.add(trabajador);
    }
    
    public void quitarTrabajador(Trabajador trabajador){
        trabajadores.remove(trabajador);
    }
    
    public void mostrarTrabajadores(){
        for(Trabajador t : trabajadores){
            System.out.println(t);
        }
    }

    public int getNroCuadrilla() {
        return nroCuadrilla;
    }

    public void setNroCuadrilla(int nroCuadrilla) {
        this.nroCuadrilla = nroCuadrilla;
    }

    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public LiderCuadrilla getLider() {
        return lider;
    }

    public void setLider(LiderCuadrilla lider) {
        this.lider = lider;
    }

    public String getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(String equipamiento) {
        this.equipamiento = equipamiento;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }
    
    
}
