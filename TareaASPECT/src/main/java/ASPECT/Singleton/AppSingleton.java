package ASPECT.Singleton;

public class AppSingleton {
    
    public static void main(String[] args) {
    	
        Usuario u1 = new Usuario("Pepe", CuentaBancariaFamiliar.getInstance());        
        System.out.println(u1.consultarSaldo());
        u1.depositarDinero(500);
        System.out.println(u1.consultarSaldo());
                
        Usuario u2 = new Usuario("María", CuentaBancariaFamiliar.getInstance());
        System.out.println(u2.consultarSaldo());        
        System.out.println(u2.consultarSaldo());
        u2.depositarDinero(50);     
    }
    
}
