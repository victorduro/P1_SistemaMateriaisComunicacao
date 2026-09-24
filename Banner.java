package DS_I.P1_SistemaMateriaisComunicacao;

public class Banner extends MaterialOffline {

    private String formato;

    public Banner(String titulo, String responsavel, String solicitante, String matricula, String formato) {
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
        System.out.println("MATERIAL OFFLINE - BANNER");
        System.out.println("Título: " + getTitulo());
        System.out.println("Responsável: " + getResponsavel());
        System.out.println("Solicitante: " + getSolicitante());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Formato: " + formato);
    }
}