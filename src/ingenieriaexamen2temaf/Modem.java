
package ingenieriaexamen2temaf;

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
   
    public EstadoModem mostrarEstado(){
        return estado;
    }
    
    public void mostrarDatos(){
        
    }

    @Override
    public String toString() {
        return "Numero de serie:" + serial_number + "\nMarca:" + marca + "\nVelocidad:" + velocidad + "\nPuertosEthernet:" + puertosEthernet + "\nPuertoCoaxial:" + puertoCoaxial + "\nProtocoloRed:" + protocoloRed + "\n Nro LEDS:" + nro_LEDS + "\nFirewall:" + firewall + "\nEstado:" + estado;
    }
    
}
