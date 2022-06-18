package jc2ejercicio3;

public class EmpleadoPorComision {
    private String nombre;
    private String apellido;
    private String nss;
    private double VentasBrutas; // ventas totales por semana
    private double tarifaComision; // porcentaje de comisión

    //Constructor por defecto
    public EmpleadoPorComision(){   
    }
    
    // constructor con cinco argumentos
    public EmpleadoPorComision(String nombre, String apellido, String nss, 
        double ventasBrutas, double tarifa) { // la llamada implícita al constructor de Object ocurre aquí
        this.nombre = nombre;
        this.apellido = apellido;
        this.nss = nss;
        //System.out.println("Constructor"+ ""+ventasBrutas);
        //this.ventasBrutas = ventasBrutas;
        establecerVentasBrutas(ventasBrutas); // valida y almacena las ventas brutas
        establecerTarifaComision(tarifa); // valida y almacena la tarifa de comisión
    } // fin del constructor de EmpleadoPorComision3 con cinco argumentos

    // establece el primer nombre

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public void establecerVentasBrutas( double ventasBrutas ){
        System.out.println("establecerVentasBrutas"+ ""+ventasBrutas);
        VentasBrutas = ( ventasBrutas < 0.0 ) ? 0.0 : ventasBrutas;
        //return ventasBrutas;
    }

    // devuelve el monto de ventas brutas
    public double obtenerVentasBrutas(){
        System.out.println("obtenerVentasBrutas"+VentasBrutas);
        return VentasBrutas;
    } // fin del método obtenerVentasBrutas

    // establece la tarifa de comisión
    public double establecerTarifaComision( double tarifa ){
        tarifaComision = ( tarifa > 0.0 && tarifa < 1.0 ) ? tarifa : 0.0;
        return tarifaComision;
    } // fin del método establecerTarifaComision

    // devuelve la tarifa de comisión
    public double obtenerTarifaComision(){
        return tarifaComision;
    } // fin del método obtenerTarifaComision

    // calcula los ingresos
    //método polimófico
    public double ingresos(){
        System.out.println("ingresos"+VentasBrutas);
        return obtenerTarifaComision() * obtenerVentasBrutas();
    } // fin del método ingresos

    // devuelve representación String del objeto EmpleadoPorComision3
    @Override
    public String toString(){
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
                "empleado por comision", getNombre(), getApellido(),
                "numero de seguro social", getNss(),
                "ventas brutas", obtenerVentasBrutas(),
                "tarifa de comision", obtenerTarifaComision(),
                "sueldo más comisión",ingresos()); 
    } // fin del método toString    
}