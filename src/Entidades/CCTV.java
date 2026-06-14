package Entidades;

import java.util.ArrayList;

public class CCTV {

    private ArrayList<Abonado> abonados;
    private ArrayList<Modem> modems;
    private ArrayList<SolicitudDeArreglo> solicitudes;
    private ArrayList<VisitaTecnica> Visitas;
    private ArrayList<CuadrillaDeReparacion> cuadrillas;

    public CCTV(ArrayList<Abonado> abonados, ArrayList<Modem> modems, ArrayList<SolicitudDeArreglo> solicitudes, ArrayList<VisitaTecnica> Visitas, ArrayList<CuadrillaDeReparacion> cuadrillas) {
        this.abonados = abonados;
        this.modems = modems;
        this.solicitudes = solicitudes;
        this.Visitas = Visitas;
        this.cuadrillas = cuadrillas;
    }

    public void listadoAbonados() {
        for (Abonado a : abonados) {
            System.out.println(a);
        }
    }

    public void informesSolicitudesPorMarca() {
        for (SolicitudDeArreglo s : solicitudes) {
            System.out.println("Marca: " + s.getModemRoto().getMarca() + "\nSolicitud: " + s.getCodInf() + "\nProblema: " + s.getProblema());
        }
    }

    public void informeCuadrillasOciosas() {
        for (CuadrillaDeReparacion c : cuadrillas) {
            if (c.estaLibre()) {
                System.out.println("Cuadrilla: " + c.getNroCuadrilla() + " disponible");
            }
        }
    }

    public void visitasPorCuadrilla() {
        for (CuadrillaDeReparacion c : cuadrillas) {
            System.out.println("Cuadrilla: " + c.getNroCuadrilla() + "tiene " + c.getVisitas().size() + " visitas");
        }
    }
    
    public void solicitudesSinVisita(){
        System.out.println("Solicitudes sin visita: ");
        for(SolicitudDeArreglo soli: solicitudes){
            if(soli.tieneVisita()){
                System.out.println("\n"+soli.getCodInf());
            }
        }
    }
}
