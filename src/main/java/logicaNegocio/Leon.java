package logicaNegocio;

public class Leon extends Animal {
  public TipoHabitat habitat;
  
  
     public Leon(){
     this.habitat = TipoHabitat.TERRESTRE;
  }
        

    @Override
    public String emitirSonido() {
          
       return "Rugido";
    }

    @Override
    public String obtenerDieta() {
           
       return "Carnívoro";
    }

  @Override
    public TipoHabitat getHabitat() {
        return habitat;
    }

    

  
  
   

}
