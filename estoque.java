package projetomaker;

import java.util.Scanner;

/**
 *
 * @author caios
 */

public class estoque {
    private int qtdEstoque;

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
    
    public estoque() {
    }
    
    public estoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
    
    public void imprimir() {
    System.out.println("\n");
    System.out.println("Quantidade em estoque: " + getQtdEstoque());
    }
    
    public void entrada() {
    Scanner ent = new Scanner(System.in);
    System.out.println("Quantidade em estoque: ");
    setQtdEstoque(Integer.parseInt(ent.nextLine()));
    }
}