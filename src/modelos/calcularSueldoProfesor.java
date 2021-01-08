package modelos;

public class calcularSueldoProfesor {
    
    public double calcularSueldo(Profesor prof){        
    	
        return prof.info.aniosdeTrabajo*600 + prof.info.BonoFijo;
    }  
}
