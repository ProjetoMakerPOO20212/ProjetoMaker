package projetomaker;

import java.util.Scanner;

/**
 *
 * @author caios
 */

public class fornecedor extends pessoa {
    private int cnpj;

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
    
    public fornecedor(){
    }
    
    public fornecedor(int cnpj){
        this.cnpj = cnpj;
    }
    
    public fornecedor(int codigo, String nome, String cidade, String bairro, 
            String rua, int cep, int cnpj){
        super(codigo, nome, cidade, bairro, rua, cep);
        this.cnpj = cnpj;
    }
    
    public void imprimir() {
        super.imprimir();
        System.out.println("CNPJ: " + getCnpj());
    }
    
    public void entrada() {
        Scanner ent = new Scanner(System.in);
        super.entrada();
        System.out.println("CNPJ: ");
        setCnpj(Integer.parseInt(ent.nextLine()));
    }
}