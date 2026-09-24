package DS_I.P1_SistemaMateriaisComunicacao;

public class TestaMateriais {

    public static void main(String[] args) {

        Estatico estatico = new Estatico(
            "Campanha Outubro Rosa",
            "Comunicação Social",
            "Drº Leandro",
            "004145",
            "1080x1350"
        );

        Video video = new Video(
            "Campanha de Vacinação",
            "Comunicação Social",
            "Laila Keiko",
            "004656",
            "Reels"
        );

        Banner banner = new Banner(
            "Campanha do Agasalho",
            "Comunicação Social",
            "Alice Fecchio",
            "005147",
            "A3"
        );

        Outdoor outdoorPapel = new Outdoor(
            "VGP Emprega",
            "Comunicação Social",
            "Carlos Eduardo",
            "006028",
            "Papel"
        );

        Outdoor outdoorLona = new Outdoor(
            "VGP Rodeio Fest",
            "Comunicação Social",
            "Thalles Maranhão",
            "006729",
            "Lona"
        );

        estatico.mostraDados();

        System.out.println();

        video.mostraDados();

        System.out.println();

        banner.mostraDados();

        System.out.println();

        outdoorPapel.mostraDados();

        System.out.println();

        outdoorLona.mostraDados();

        System.out.println();

        estatico.mostraDados("Material para divulgação no Instagram");
    }
}
