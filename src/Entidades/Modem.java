package Entidades;

public class Modem {

    private int serial_number;
    private String marca;
    private String velocidad;
    private int puertosEthernet;
    private boolean puertoCoaxial;
    private ProtocoloRed protocoloRed;
    private int nro_LEDS;
    private boolean firewall;
    private EstadoModem estado;

    public Modem(int serial_number, String marca, String velocidad, int puertosEthernet, boolean puertoCoaxial, ProtocoloRed protocoloRed, int nro_LEDS, boolean firewall, EstadoModem estado) {
        this.serial_number = serial_number;
        this.marca = marca;
        this.velocidad = velocidad;
        this.puertosEthernet = puertosEthernet;
        this.puertoCoaxial = puertoCoaxial;
        this.protocoloRed = protocoloRed;
        this.nro_LEDS = nro_LEDS;
        this.firewall = firewall;
        this.estado = estado;
    }

    public EstadoModem mostrarEstado() {
        return estado;
    }

    public void mostrarDatos() {
        System.out.println("Numero de serie:" + serial_number + "\nMarca:" + marca + "\nVelocidad:" + velocidad + "\nPuertosEthernet:" + puertosEthernet + "\nPuertoCoaxial:" + puertoCoaxial + "\nProtocoloRed:" + protocoloRed + "\n Nro LEDS:" + nro_LEDS + "\nFirewall:" + firewall + "\nEstado:" + estado);
    }

    public int getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(int serial_number) {
        this.serial_number = serial_number;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public int getPuertosEthernet() {
        return puertosEthernet;
    }

    public void setPuertosEthernet(int puertosEthernet) {
        this.puertosEthernet = puertosEthernet;
    }

    public boolean isPuertoCoaxial() {
        return puertoCoaxial;
    }

    public void setPuertoCoaxial(boolean puertoCoaxial) {
        this.puertoCoaxial = puertoCoaxial;
    }

    public ProtocoloRed getProtocoloRed() {
        return protocoloRed;
    }

    public void setProtocoloRed(ProtocoloRed protocoloRed) {
        this.protocoloRed = protocoloRed;
    }

    public int getNro_LEDS() {
        return nro_LEDS;
    }

    public void setNro_LEDS(int nro_LEDS) {
        this.nro_LEDS = nro_LEDS;
    }

    public boolean isFirewall() {
        return firewall;
    }

    public void setFirewall(boolean firewall) {
        this.firewall = firewall;
    }

    public EstadoModem getEstado() {
        return estado;
    }

    public void setEstado(EstadoModem estado) {
        this.estado = estado;
    }

    
}
