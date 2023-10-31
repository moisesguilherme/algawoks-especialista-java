package exemplo;

public enum CodigoDDD {

    MG (31, "Minas Gerais - DDD 31"),
    RJ (21, "Rio de Janeiro - DDD 21"),
    SP (11, "São Paulo - DDD 11"),
    DF (61, "Distrito Federal - DDD 61");

    private Integer codigo;
    private String descricao;

    CodigoDDD(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}