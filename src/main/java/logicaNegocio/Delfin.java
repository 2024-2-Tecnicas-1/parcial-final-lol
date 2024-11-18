package logicaNegocio;

public  class Delfin extends Animal {
  public TipoHabitat habitat;

    public Delfin() {
       
        this.habitat = TipoHabitat.ACUATICO;
         
    }

   
    @Override
    public String emitirSonido() {
         
       return "Chirrido";
    }

    @Override
    public String obtenerDieta() {
       
      return "Pescado";
        
    }

    public void setHabitat(TipoHabitat habitat) {
        this.habitat = habitat;
    }

  @Override
    public TipoHabitat getHabitat() {
        return habitat;
    }

 
   

   

    
 
 
 
 
  
}
