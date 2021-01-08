package modelos;

public class calcularSueldoProfesor {
    
    public double calcularSueldo(Profesor prof){        
    	
        return prof.getInfo().aniosdeTrabajo*600 + prof.getInfo().BonoFijo;
    }  
}
