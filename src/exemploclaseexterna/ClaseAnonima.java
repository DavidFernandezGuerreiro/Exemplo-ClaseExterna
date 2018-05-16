
package exemploclaseexterna;

/**
 *
 * @author dfernandezguerreiro
 */
public class ClaseAnonima {
    
    Ioperacion an=new Ioperacion(){        
        public void suma(double num1, double num2) {
            System.out.println("Suma= "+(num1+num2));
        }
    };
    
    public void operacion(){
        an.suma(4, 7);
    }
}
