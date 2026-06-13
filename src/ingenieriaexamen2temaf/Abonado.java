package ingenieriaexamen2temaf;

public class Abonado {
    private int id;
    private String nombre;
    private int celular;
    private String mail;
    private int contraseña;
    private Domicilio domicilio;
    private boolean debitoAutomatico;

    public Abonado(int id, String nombre, int celular, String mail, int contraseña, Domicilio domicilio, boolean debitoAutomatico) {
        this.id = id;
        this.nombre = nombre;
        this.celular = celular;
        this.mail = mail;
        this.contraseña = contraseña;
        this.domicilio = domicilio;
        this.debitoAutomatico = debitoAutomatico;
    }
    
    public void suscribirPagoAutomatico(){
        debitoAutomatico = true;
    }
    
    public void registrar(String mail){
        System.out.println("Registrado");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public boolean isDebitoAutomatico() {
        return debitoAutomatico;
    }

    public void setDebitoAutomatico(boolean debitoAutomatico) {
        this.debitoAutomatico = debitoAutomatico;
    }
    
    
}
