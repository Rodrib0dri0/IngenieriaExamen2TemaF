
package ingenieriaexamen2temaf;

import java.util.Date;

public class SolicitudDeArreglo {
    private int codInf;
    private Date fechaInforme;
    private String problema;
    private int codUrgencia; 
    private Modem modemRoto;
    private Abonado abonado;
    private VisitaTecnica visita;

    public SolicitudDeArreglo(int codInf, Date fechaInforme, String problema, int codUrgencia, Modem modemRoto, Abonado abonado, VisitaTecnica visita) {
        this.codInf = codInf;
        this.fechaInforme = fechaInforme;
        this.problema = problema;
        this.codUrgencia = codUrgencia;
        this.modemRoto = modemRoto;
        this.abonado = abonado;
        this.visita = visita;
    }
    
    public boolean tieneVisita(){
        if (visita == null){
            return false;
        }else{
            return true;
        }
    }
    
    public void asignarVisita(VisitaTecnica visita){
        this.visita = visita;
    }
    
    public int mostrarPrioridad(){
        return codUrgencia;
    }

    public int getCodInf() {
        return codInf;
    }

    public void setCodInf(int codInf) {
        this.codInf = codInf;
    }

    public Date getFechaInforme() {
        return fechaInforme;
    }

    public void setFechaInforme(Date fechaInforme) {
        this.fechaInforme = fechaInforme;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public int getCodUrgencia() {
        return codUrgencia;
    }

    public void setCodUrgencia(int codUrgencia) {
        this.codUrgencia = codUrgencia;
    }

    public Modem getModemRoto() {
        return modemRoto;
    }

    public void setModemRoto(Modem modemRoto) {
        this.modemRoto = modemRoto;
    }

    public Abonado getAbonado() {
        return abonado;
    }

    public void setAbonado(Abonado abonado) {
        this.abonado = abonado;
    }

    public VisitaTecnica getVisita() {
        return visita;
    }

    public void setVisita(VisitaTecnica visita) {
        this.visita = visita;
    }
    
    
}
