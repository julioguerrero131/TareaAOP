package ASPECT.Adapter;

public class MotorGasolina extends Motor{
    
    public MotorGasolina(){
        super();
    }

    @Override
    public void recargar() {
        System.out.println("Recargando con gasolina");
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
