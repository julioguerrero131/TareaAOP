package ASPECT.AspectJ;

public aspect BankAccount {
	
	pointcut callSaldo(): call(* *.consultarSaldo());    
    before() : callSaldo()  {
        System.out.println("++++++++++++++ Se mostrará su dinero ++++++++++++++");
    }
        
    pointcut callRetirar(): call(* *.retirar());    
    after() : callRetirar()  {
        System.out.println("++++++++++++++ Se ha retirado dinero de su cuenta ++++++++++++++");
    }
    
    pointcut callDepositar(): call(* *.depositarDineror());    
    after() : callDepositar()  {
        System.out.println("++++++++++++++ Se ha depositado dinero en su cuenta ++++++++++++++");
    }
    
    pointcut callInstance(): call(* *.getInstance());    
    after() : callInstance()  {    	
        System.out.println("++++++++++++++ Se ha accedido a la Cuenta Familiar ++++++++++++++");
    }
       
}
