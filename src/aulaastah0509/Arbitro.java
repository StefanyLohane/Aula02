package aulaastah0509;

import java.util.UUID;

public class Arbitro extends Pessoa {
    Boolean fifa;
    String codigo;
    
    public Arbitro() {
    }
    public Arbitro(UUID id, String nome, String cpf, Boolean fifa, String codigo) {
        super(id, nome, cpf);
        this.fifa = fifa;
        this.codigo = codigo;
    }

    public Boolean getFifa() {
        return fifa;
    }
    public void setFifa(Boolean fifa) {
        this.fifa = fifa;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
}
