package ingenieriaexamen2temaf;

public class LiderCuadrilla extends Trabajador{
    
    public LiderCuadrilla(int id, String nombre, String puesto, boolean libre) {
        super(id, nombre, puesto, libre);
    }
    
    public void accederDatosModem(Modem modem){
        modem.mostrarDatos();
    }
    
    public void informarReparacion(VisitaTecnica visita, String observacion){
        visita.registrarReparacion(observacion);
    }
}
