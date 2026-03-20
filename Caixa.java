public class Caixa {
    private double sacar;
    private double depositar;
    private String consultar;

    public Caixa(double sacar, double depositar, String consultar);{
        this.sacar = sacar;
        this.depositar = depositar;
        this consultar = consultar;
    }

    public double getSacar(){
            return this.sacar;
        }
    public void setSacar(double sacar){
        if (sacar >0){
            this.sacar = sacar;
        } else {
            System.out.println("Error: Valor inválido");
        }   
        }
    
    public double getDepositar(){
        return this.depositar;
    }

    public void setDepositar(double depositar){
        if (depositar >0) {
            this.depositar = depositar;
        } else {
            System.out.println("Error: Valor inválido");
        }
    }

    public String getConsultar(){
        return this.consultar;
    }

    public static void main(String[] args){
        var saldo = 500;
        var sacar = 100;
        var depositar = 50;

        var consultar = (sacar - depositar);

        if (sacar <= saldo) {
            System.out.println(saldo - sacar);
        } else {
            System.out.println("Saldo Inválido");
        }
        
        if (depositar > 0) {
            System.out.println(saldo + depositar);
        }  else {
            System.out.println("Valor Inválido");
        } 
    }

    switch (Caixa){
        case sacar: {
            System.out.println("Saque Realizado com sucesso");
            break;
        }
        case depositar: {
            System.out.println("Deposito Realizado com sucesso");
            break;
        }
        case Consultar: {
            System.out.println(consultar);
            break;
        }
    }

}
