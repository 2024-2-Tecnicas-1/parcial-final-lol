package logicaNegocio;

public class Perro extends Animal implements Domestico {
        public TipoHabitat habitat=  TipoHabitat.TERRESTRE;

   
    @Override
    public String emitirSonido() {
        String Sonido="Ladrido";
           return Sonido;
    }

    @Override
    public String obtenerDieta() {
        String Dieta="Omnívoro";
           return Dieta;
    }
        @Override
    public String interactuarConHumano(){
    String Accion="El perro mueve la cola y ladra de felicidad";
           return Accion;                     
    }

    public TipoHabitat getHabitat() {
        return habitat;
    }

    
}
