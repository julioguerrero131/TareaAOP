package ASPECT;

public abstract class Motor {
    
    public Motor(){
        System.out.println("Creando motor...");
    }
    
    abstract public void recargar();
    abstract public void encender();
    abstract public void acelerar();
    abstract public void desacelerar();
    abstract public void apagar();

}
