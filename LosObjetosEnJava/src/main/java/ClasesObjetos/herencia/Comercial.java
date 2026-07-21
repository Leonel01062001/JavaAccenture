package ClasesObjetos.herencia;

public class Comercial extends Empleado{
    private double comision;

    public Comercial(){
        super();
    }

    public void calcularComision(double comision){
        this.comision += comision;
    }

    public void calcularComision(double comision, double plus){
        this.comision += comision + plus;
    }

    @Override
    public void actualizarSalario(int aumento) {
        if(this.getAntiguedad()<=5){
            this.calcularComision(25);
        }else {
            this.calcularComision(25, 100);
        }
        double salarioTotal = this.getSalario() + aumento + this.getComision();
        this.setSalario(salarioTotal);
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
}
