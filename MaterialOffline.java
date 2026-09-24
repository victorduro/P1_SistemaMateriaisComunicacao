

public class MaterialOffline extends MaterialComunicacao {

    public MaterialOffline(String titulo, String responsavel, String solicitante, String matricula) {
        super(titulo, responsavel, solicitante, matricula);
    }

    @Override
    public void mostraDados() {
        System.out.println("MATERIAL OFFLINE");
        System.out.println("Título: " + getTitulo());
        System.out.println("Responsável: " + getResponsavel());
        System.out.println("Solicitante: " + getSolicitante());
        System.out.println("Matrícula: " + getMatricula());
    }
}
