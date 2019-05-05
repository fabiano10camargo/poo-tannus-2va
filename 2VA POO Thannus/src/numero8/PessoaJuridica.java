package numero8;

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

    public String getNomeFicticio() {
        return nomeFicticio;
    }

    public void setNomeFicticio(String nomeFicticio) {
        this.nomeFicticio = nomeFicticio;
    }

    public void imprimiDados() {
        System.out.printf("Cliente pessoa fisica");
        System.out.println("Nome: " + super.getNome());
        System.out.println("Telefone: " + super.getTelefone());
        System.out.println("Endereço: " + super.getEndereco());
        System.out.println("Nome ficticio: " + nomeFicticio);
        System.out.println("CNPJ: " + cnpj);
    }
}
