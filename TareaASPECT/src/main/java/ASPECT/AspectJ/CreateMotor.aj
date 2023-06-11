package ASPECT.AspectJ;

public aspect CreateMotor {
	
	pointcut callEncender(): call(* *.encender());    
    after() : callEncender()  {
        System.out.println("\n++++++++++++++ Se ha encendido el motor ++++++++++++++\n");
    }
    
    pointcut callRecargar(): call(* *.recargar());    
    after() : callRecargar()  {
        System.out.println("\n++++++++++++++ Su vehiculo está listo ++++++++++++++\n");
    }
    
	pointcut callAcelerar(): call(* *.acelerar());    
    before() : callAcelerar()  {
        System.out.println("\n++++++++++++++ Usted va ha acelerar ++++++++++++++\n");
    }
    
    pointcut callDesacelerar(): call(* *.desacelerar());    
    after() : callDesacelerar()  {
        System.out.println("\n++++++++++++++ Usted ha desacelerado ++++++++++++++\n");
    }
    
	pointcut callApagar(): call(* *.apagar());    
    after() : callApagar()  {
        System.out.println("\n++++++++++++++ Se ha encendido el motor ++++++++++++++\n");
    }
    
}
