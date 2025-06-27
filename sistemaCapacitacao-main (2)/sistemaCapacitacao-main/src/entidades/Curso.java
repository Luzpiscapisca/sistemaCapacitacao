package entidades;

public class Curso {
    private String nome;
    private String formaRealizacao;
    private int vagas;
    private double valor;
    private int site;
    private String ofertante;
    private String situacao;
    private int idcurso;

    public Curso(){
    }

    public Curso(String nome, String formaRealizacao, int vagas, double valor, int site, String ofertante, String situacao, int idcurso) {
        this.nome = nome;
        this.formaRealizacao = formaRealizacao;
        this.vagas = vagas;
        this.valor = valor;
        this.site = site;
        this.ofertante = ofertante;
        this.situacao = situacao;
        this.idcurso = idcurso;
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormaRealizacao() {
        return formaRealizacao;
    }

    public void setFormaRealizacao(String formaRealizacao) {
        this.formaRealizacao = formaRealizacao;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getSite() {
        return site;
    }

    public void setSite(int site) {
        this.site = site;
    }

    public String getOfertante() {
        return ofertante;
    }

    public void setOfertante(String ofertante) {
        this.ofertante = ofertante;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", formaRealizacao='" + formaRealizacao + '\'' +
                ", vagas=" + vagas +
                ", valor=" + valor +
                ", site=" + site +
                ", ofertante='" + ofertante + '\'' +
                ", situacao='" + situacao + '\'' +
                ", idcurso=" + idcurso +
                '}';
    }


}

