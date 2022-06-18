package jc2ejercicio3;

import javax.swing.JOptionPane;

public class JC2Ejercicio3 {
        static double tarifa=.00;
    public static void main(String[] args) {
        while(true){
        String tipoEmpleado = JOptionPane.showInputDialog(null, "Empleado\n1.Empleado por comision\n 2.Empleado con base más comisioon ");
        int tipoE =Integer.parseInt(tipoEmpleado);
        
	String nombre = JOptionPane.showInputDialog(null, "Escriba el nombre");
	String apellido = JOptionPane.showInputDialog(null, "Escriba el apellido");
        String nss = JOptionPane.showInputDialog(null, "Escriba el NSS");
        String ventasbrutas = JOptionPane.showInputDialog(null, "Escriba sus ventas brutas del empleado");
        double ventasBrutas =Double.parseDouble(ventasbrutas);
        System.out.println(""+ventasBrutas);
        if(tipoE==1){
        EmpleadoPorComision EPC=new EmpleadoPorComision();
        EPC.setNombre(nombre);
        EPC.setApellido(apellido);
        EPC.setNss(nss);
        EPC.establecerVentasBrutas(ventasBrutas);
        tarifa=.06;
        EPC.establecerTarifaComision(tarifa);
        JOptionPane.showMessageDialog(null,EPC.toString());
        }
            
        else{
        
        String Sueldo = JOptionPane.showInputDialog(null, "Sueldo base de elmpleado base más comision");
        double salario =Double.parseDouble(Sueldo);
        EmpleadoBaseMasComision EBMC=new EmpleadoBaseMasComision();
        EBMC.setNombre(nombre);
        EBMC.setApellido(apellido);
        EBMC.setNss(nss);
        EBMC.establecerVentasBrutas(ventasBrutas);
        tarifa=.04;
        EBMC.establecerTarifaComision(tarifa);
        EBMC.establecerSalarioBase(salario);
        JOptionPane.showMessageDialog(null,EBMC.toString());}
        
        }
        
        }
        /*EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision(n1,
        a1,"222-22-222",10000,.06);
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision
        (n2,
        a2,"333-33-333",10000,.04,300);
        
        System.out.printf( "%s %s:\n\n%s\n\n","Llamada a toString de EmpleadoPorComision con referencia de superclase ",
                "a un objeto de la superclase", empleadoPorComision.toString());
        System.out.printf( "%s %s:\n\n%s\n\n",
                "Llamada a toString de EmpleadoBaseMasComision con referencia",
                "de subclase a un objeto de la subclase",empleadoBaseMasComision.toString());
        EmpleadoPorComision empleadoPorComision2 = empleadoBaseMasComision;
        EmpleadoBaseMasComision empleadoPorComision3 = empleadoBaseMasComision;
        System.out.printf("%s %s:\n\n%s\n","Llamada a toString de EmpleadoBaseMasComision con referencia de superclase",
        "a un objeto de la subclase", empleadoPorComision2.toString() );
        System.out.printf("%s %s:\n\n%s\n","\nLlamada a toString de EmpleadoBaseMasComision con referencia de subClase",
        "a un mismo objeto", empleadoPorComision3.toString() );
    }*/
}
