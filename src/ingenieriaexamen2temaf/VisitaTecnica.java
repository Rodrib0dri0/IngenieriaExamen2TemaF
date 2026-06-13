package ingenieriaexamen2temaf;

import java.util.Date;

public class VisitaTecnica {

    private int nroVisita;
    private String ubicacion;
    private Date fechaCreacion;
    private Date fechaReparacion;
    private String obeservaciones;
    private CuadrillaDeReparacion cuadrilla;

    public VisitaTecnica(int nroVisita, String ubicacion, CuadrillaDeReparacion cuadrilla) {
        this.nroVisita = nroVisita;
        this.ubicacion = ubicacion;
        this.fechaCreacion = new Date();
        this.cuadrilla = cuadrilla;
    }

    public void registrarReparacion(String observaciones) {
        this.obeservaciones = observaciones;
        this.fechaReparacion = new Date();

    }

    public void imprimirVisita() {
        System.out.println("Numero de Visita: " + nroVisita + "\nUbicacion: " + ubicacion + "\nFechaCreacion: " + fechaCreacion + "\nFechaReparacion: " + fechaReparacion + "\nObeservaciones: " + obeservaciones + "\n Cuadrilla: " + cuadrilla.getNroCuadrilla());
    }
    
    
}
