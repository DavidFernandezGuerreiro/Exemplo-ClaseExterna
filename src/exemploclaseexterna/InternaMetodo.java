
package exemploclaseexterna;

/**
 *
 * @author dfernandezguerreiro
 */
public class InternaMetodo {
    
    public void ver(){
        
        class Interna{
            public void amosar(){
                System.out.println("dende clase interna método");
            }
        }
        Interna in=new Interna();
        in.amosar();
    }
    
}
