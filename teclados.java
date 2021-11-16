package projetomaker;

import java.util.Scanner;

/**
 *
 * @author caios
 */

public class teclados extends produtos {
    private String tipo, cor;
    private boolean lgb;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean getLgb() {
        return lgb;
    }

    public void setLgb(boolean lgb) {
        this.lgb = lgb;
    }
    
    public teclados(){
    }
    
    public teclados(String tipo, String cor, boolean lgb){
        this.tipo = tipo;
        this.cor = cor;
        this.lgb = lgb;
    }
    
    public teclados(int codigo, String nome, String marca, double preco,
        int qtdEstoque, String tipo, String cor, boolean lgb) {
        super (codigo, nome, marca, preco, qtdEstoque);
        this.tipo = tipo;
        this.cor = cor;
        this.lgb = lgb;
    }
    
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo: " + getTipo());
        System.out.println("Cor: " + getCor());
        System.out.println("LGB? " + getLgb());
    }
    
    public void entrada() {
        Scanner ent = new Scanner(System.in);
        super.entrada();
        System.out.println("Tipo: ");
        setTipo(ent.nextLine());
        System.out.println("Cor: ");
        setCor(ent.nextLine());
        System.out.println("LGB? ");
        setLgb(Boolean.parseBoolean(ent.nextLine()));
    }
}