package modelos;

public class InformacionAdicionalProfesor {
    public int aniosdeTrabajo;
    public String facultad;
    public double BonoFijo;
    
    
    public double calcularSueldo(Profesor prof){        
    	
        return prof.getInfo().aniosdeTrabajo*600 + prof.getInfo().BonoFijo;
    }  
    
}
