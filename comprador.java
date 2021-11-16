package projetomaker;

import java.util.Scanner;

/**
 *
 * @author caios
 */

public class comprador extends pessoa {
    private int cpf;

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    public comprador(){
    }
    
    public comprador(int cnpj){
        this.cpf = cpf;
    }
    
    public comprador(int codigo, String nome, String cidade, String bairro, 
            String rua, int cep, int cpf){
        super(codigo, nome, cidade, bairro, rua, cep);
        this.cpf = cpf;
    }
    
    public void imprimir() {
        super.imprimir();
        System.out.println("CPF: " + getCpf());
    }
    
    public void entrada() {
        Scanner ent = new Scanner(System.in);
        super.entrada();
        System.out.println("CPF: ");
        setCpf(Integer.parseInt(ent.nextLine()));
    }
}