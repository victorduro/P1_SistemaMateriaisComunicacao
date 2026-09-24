package DS_I.P1_SistemaMateriaisComunicacao;

public class MaterialComunicacao {

    private String titulo;
    private String responsavel;
    private String solicitante;
    private String matricula;

    public MaterialComunicacao(String titulo, String responsavel, String solicitante, String matricula) {
        this.titulo = titulo;
        this.responsavel = responsavel;
        this.solicitante = solicitante;
        this.matricula = matricula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void mostraDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Responsável: " + responsavel);
        System.out.println("Solicitante: " + solicitante);
        System.out.println("Matrícula: " + matricula);
    }

    public void mostraDados(String informacao) {
        System.out.println("Título: " + titulo);
        System.out.println("Responsável: " + responsavel);
        System.out.println("Solicitante: " + solicitante);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Informação: " + informacao);
    }
}