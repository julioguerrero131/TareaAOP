package ASPECT.Adapter;

public class MotorElectrico {
    
    public void conectarCorriente(){
        System.out.println("Conectando a un tomacorriente...");
    }
    
    public void deconectarCorriente(){
        System.out.println("Desconectando del tomacorriente... Carga completa.");
    }
    
    public void cargarBateria(){
        System.out.println("Cargando batería...");
    }
    
    public void activar(){
        System.out.println("Activando sistema...");
    }
    
    public void cambiarMarcha(){
        System.out.println("Cambiando marcha...");
    }
    
    public void aumentarVelocidad(){
        System.out.println("Velocidad aumentando...");
    }
    
    public void disminuirVelocidad(){
        System.out.println("Velocidad disminuyendo...");
    }
    
    public void desactivar(){
        System.out.println("Desactivando sistema...");
    }
    
}
