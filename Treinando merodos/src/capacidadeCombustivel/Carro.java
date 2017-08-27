package capacidadeCombustivel;
public class Carro {
    private String marca; 
    private String modelo; 
    private int ano; 
    private double valor; 
    private double capacidadeLitros;
    private double capacidadeKM; 
    private boolean ligado = false;
    private boolean vendido = false; 
    private int unidadesEmLoja;
    
    
    public void receberCarro(){
        
    }
    
    public void venderCarro(){
        
    }
    
    public void 

    public double getCapacidadeLitros() {
        return capacidadeLitros;
    }

    public void setCapacidadeLitros(double capacidadeLitros) {
        this.capacidadeLitros = capacidadeLitros;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.setVendido(true);
    }

    public int getUnidadesEmLoja() {
        return unidadesEmLoja;
    }

    public void setUnidadesEmLoja(int unidadesEmLoja) {
        this.unidadesEmLoja = unidadesEmLoja;
    }
    
    public void ligarCarro(){
        this.setLigado(true);
        
    }
        

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getCapacidadeGalao() {
        return capacidadeGalao;
    }

    public void setCapacidadeGalao(double capacidadeGalao) {
        this.capacidadeGalao = capacidadeGalao;
    }

    public double getCapacidadeKM() {
        return capacidadeKM;
    }

    public void setCapacidadeKM(double capacidadeKM) {
        this.capacidadeKM = capacidadeKM;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    

}
