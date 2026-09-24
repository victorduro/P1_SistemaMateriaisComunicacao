package DS_I.P1_SistemaMateriaisComunicacao;

public class Video extends MaterialOnline {

    private String formato;

    public Video(String titulo, String responsavel, String solicitante, String matricula, String formato) {
        super(titulo, responsavel, solicitante, matricula);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public void mostraDados() {
        System.out.println("MATERIAL ONLINE - VÍDEO");
        System.out.println("Título: " + getTitulo());
        System.out.println("Responsável: " + getResponsavel());
        System.out.println("Solicitante: " + getSolicitante());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Formato: " + formato);
    }
}
