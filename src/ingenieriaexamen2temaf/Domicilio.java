
package ingenieriaexamen2temaf;

public class Domicilio {
    private String calleA;
    private String calleB;
    private int altura;
    private String barrio;

    public Domicilio(String calleA, String calleB, int altura, String barrio) {
        this.calleA = calleA;
        this.calleB = calleB;
        this.altura = altura;
        this.barrio = barrio;
    }
    
    public String obtenerDireccion(){
        return calleA+ " "+ calleB +"\nAltura: "+altura + "\nBarrio: "+ barrio ;
    }
}
