package modelos;

public class Materia {
    public String codigo;
    public String nombre;
    public String facultad;
    public Nota nota;
    

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFacultad() {
        return facultad;
    } 
    
    public Nota getNota() {
        return nota;
    } 

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
    public void setNota(Nota nota) {
        this.nota = nota;
    }

   
    
    
}
