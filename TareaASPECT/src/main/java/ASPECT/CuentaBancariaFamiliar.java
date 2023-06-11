package ASPECT;

public class CuentaBancariaFamiliar {
    
    private static CuentaBancariaFamiliar INSTANCIA;
    private double saldo = 500;
    
    private CuentaBancariaFamiliar() {
        
    }
    
    public static CuentaBancariaFamiliar getInstance() {
        if(INSTANCIA == null){
            INSTANCIA = new CuentaBancariaFamiliar();
        }
        return INSTANCIA;
    }
    
    public void depositar(double depósio){
        this.saldo+=depósio;
    }
    
    public boolean retirar(double retiro){
        if(retiro>saldo)
            return false;
        this.saldo-=retiro;
        return true;
    }
    
    public double getSaldo(){
        double current = saldo;
        return current;
    }
    
}
