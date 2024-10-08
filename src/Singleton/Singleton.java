package Singleton;

public class Singleton {
    private static volatile Singleton instance = null;
    private String data;
    private Singleton(String data) {
        this.data = data;
    }
    public static Singleton getInstance(){
        if(instance == null){
            synchronized(Singleton.class){
                if(instance == null){
                    instance = new Singleton("Nueva Data Única Versión");
                }
                /**
                 *
                 * El primer chek es para cuando ya esté instanciado no se active la sincronización y se mejora en rendimiento en 40%
                 * El Sinchonized sirve para que cuando dos o más partes del sistema quieran acceder al método getInstance, no puedan y deba esperar para poder ejecutarse
                 *  Cuando una variable es marcada como volatile, cualquier cambio a esa variable se hace visible inmediatamente a todos los hilos.
                 *  Esto asegura que todos los hilos vean el valor más actualizado de la variable.
                 *
                 */

            }
        }
        return instance;
    }
    public String getData() {
        return this.data;
    }
}
