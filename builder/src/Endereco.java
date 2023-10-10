public class Endereco {
    private String rua;
    private String setor;
    private String cep;
    private String numero;
    private String cidade;
    private String estado;
    private String bloco;
    private String quadra;

    public Endereco(EnderecoBuilder builder) {
        this.rua = builder.rua;
        this.setor = builder.setor;
        this.cep = builder.cep;
        this.numero = builder.numero;
        this.cidade = builder.cidade;
        this.estado = builder.estado;
        this.bloco = builder.bloco;
        this.quadra = builder.quadra;
    }

    public String getRua() {
        return rua;
    }

    public String getSetor() {
        return setor;
    }

    public String getCep() {
        return cep;
    }

    public String getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getBloco() {
        return bloco;
    }

    public String getQuadra() {
        return quadra;
    }

    public static EnderecoBuilder builder() {
        return new EnderecoBuilder();
    }

    public static class EnderecoBuilder {
        private String rua;
        private String setor;
        private String cep;
        private String numero;
        private String cidade;
        private String estado;
        private String bloco;
        private String quadra;

        EnderecoBuilder() {}

        public EnderecoBuilder rua(String rua) {
            this.rua = rua;
            return this;
        }

        public EnderecoBuilder setor(String setor) {
            this.setor = setor;
            return this;
        }

        public EnderecoBuilder cep(String cep) {
            this.cep = cep;
            return this;
        }

        public EnderecoBuilder numero(String numero) {
            this.numero = numero;
            return this;
        }

        public EnderecoBuilder cidade(String cidade) {
            this.cidade = cidade;
            return this;
        }

        public EnderecoBuilder estado(String estado) {
            this.estado = estado;
            return this;
        }

        public EnderecoBuilder bloco(String bloco) {
            this.bloco = bloco;
            return this;
        }

        public EnderecoBuilder quadra(String quadra) {
            this.quadra = quadra;
            return this;
        }

        public Endereco build() {
            return new Endereco(this);
        }
    }
}
