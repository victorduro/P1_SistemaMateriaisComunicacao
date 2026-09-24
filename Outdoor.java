

public class Outdoor extends MaterialOffline {

    private String material;

    public Outdoor(String titulo, String responsavel, String solicitante, String matricula, String material) {
        super(titulo, responsavel, solicitante, matricula);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void mostraDados() {
        System.out.println("MATERIAL OFFLINE - OUTDOOR");
        System.out.println("Título: " + getTitulo());
        System.out.println("Responsável: " + getResponsavel());
        System.out.println("Solicitante: " + getSolicitante());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Material: " + material);
    }
}