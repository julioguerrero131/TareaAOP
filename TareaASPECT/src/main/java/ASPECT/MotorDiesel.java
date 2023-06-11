package ASPECT;

public class MotorDiesel extends Motor{
    
    public MotorDiesel(){
        super();
    }

    @Override
    public void recargar() {
        System.out.println("Recargando con diesel");
    }
    
    @Override
    public void encender() {
        System.out.println("Encendiendo motor...");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando...");
    }

    @Override
    public void desacelerar() {
        System.out.println("Desacelerando...");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor");
    }
    
}
