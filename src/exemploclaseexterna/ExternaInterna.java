
package exemploclaseexterna;

/**
 *
 * @author dfernandezguerreiro
 */
public class ExternaInterna {
    private int a=8;
    
    public void ver(){ //Cuando la clase Interna es privada, usamos un metodo y creamos un objeto para poder llamar al método.
        Interna in=new Interna();
        in.amosar();
    }
        
    private class Interna{
        public void amosar(){
            System.out.println(" dende a clase interna ");
            System.out.println(a);
        }
    }
}
