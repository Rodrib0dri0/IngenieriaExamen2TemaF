
package EntidadPrueba;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AbonadoP {
    private String nombre;
    private int contraseña;
    
    public AbonadoP(){
}

    public AbonadoP(String nombre, int contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }
    
    public boolean validarIngreso(int con){
        if(this.contraseña == con){
            return true;
        }else{
            return false;
        }
    }
    
    public void cambioPassword(String newPass){
        this.contraseña = Integer.parseInt(newPass);
    }
    
    public void delay(int mili){
        try {
            Thread.sleep(mili);
        } catch (InterruptedException ex) {
            System.out.println("Delay de "+ mili + "milisegundos");
        }
    }
    
    public boolean abonadosDiferentes(AbonadoP c2){
        return !this.equals(c2);
    }
            
}
