package ASPECT;

public class MotorElectricoAdapter extends Motor{
    
    private final MotorElectrico motorElectrico;
    
    public MotorElectricoAdapter(){
        super();
        this.motorElectrico = new MotorElectrico();
    }

    @Override
    public void recargar() {
        motorElectrico.conectarCorriente();
        motorElectrico.cargarBateria();
        motorElectrico.deconectarCorriente();
    }

    @Override
    public void encender() {
        motorElectrico.activar();
    }

    @Override
    public void acelerar() {
        motorElectrico.cambiarMarcha();
        motorElectrico.aumentarVelocidad();
    }

    @Override
    public void desacelerar() {
        motorElectrico.cambiarMarcha();
        motorElectrico.disminuirVelocidad();
    }

    @Override
    public void apagar() {
        motorElectrico.desactivar();
    }
    
}
