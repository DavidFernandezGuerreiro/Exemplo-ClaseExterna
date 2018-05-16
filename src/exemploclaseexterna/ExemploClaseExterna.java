
package exemploclaseexterna;

/**
 *
 * @author dfernandezguerreiro
 */
public class ExemploClaseExterna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ExternaInterna ei=new ExternaInterna();
        
//        ExternaInterna.Interna obxInterno=ei.new Interna(); //obxeto clase interna
//        obxInterno.amosar(); //só cando a clase non é private

        // Cando a clase é private accedemos a través dun obexeto da clase externa.
//        ei.ver();

/* DENDE A CLASE INTERNA MÉTODO */
//        InternaMetodo im=new InternaMetodo();
//        im.ver();

/* CLASE ANONIMA */
        ClaseAnonima ca=new ClaseAnonima();
        ca.operacion();
        
    }
    
}
