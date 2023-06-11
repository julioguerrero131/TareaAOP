package ASPECT.Singleton;

public class Usuario {
    
    private CuentaBancariaFamiliar cuentaBancariaFamiliar;
    private String nombre;
    
    public Usuario(String nombre, CuentaBancariaFamiliar cbf){
        this.nombre = nombre;
        this.cuentaBancariaFamiliar = cbf;
    }
    
    public void depositarDinero(double depósio){
        cuentaBancariaFamiliar.depositar(depósio);
    }
    
    public double retirar(double retiro){
        if(!cuentaBancariaFamiliar.retirar(retiro))
            System.out.println("No hay suficiente saldo");
        return retiro;
    }
    
    public double consultarSaldo(){
        return cuentaBancariaFamiliar.getSaldo();
    }

}
