package numero7;

public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String nomeFicticio;

    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String nomeFicticio) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.nomeFicticio = nomeFicticio;
    }

    public String getCNPJ() {
        return cnpj;
    }

    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getnomeFicticio() {
        return nomeFicticio;
    }

    public void setnomeFicticio(String nomeFicticio) {
        this.nomeFicticio = nomeFicticio;
    }
}
