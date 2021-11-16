package projetomaker;

import java.util.Scanner;

/**
 *
 * @author caios
 */

public class mouses extends produtos {
    private int dpi;
    private double peso;

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public mouses() {
    }
    
    public mouses(int dpi, double peso) {
        this.dpi = dpi;
        this.peso = peso;
    }
    
    public mouses(int codigo, String nome, String marca, double preco,
        int qtdEstoque, int dpi, double peso) {
        super (codigo, nome, marca, preco, qtdEstoque);
        this.dpi = dpi;
        this.peso = peso;
    }
    
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo: " + getDpi());
        System.out.println("Cor: " + getPeso());
    }
    
    public void entrada() {
        Scanner ent = new Scanner(System.in);
        super.entrada();
        System.out.println("Dpi: ");
        setDpi(Integer.parseInt(ent.nextLine()));
        System.out.println("Peso: ");
        setPeso(Double.parseDouble(ent.nextLine()));
    }
}