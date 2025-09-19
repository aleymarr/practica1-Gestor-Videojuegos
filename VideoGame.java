public class VideoGame {
    
    private String id;
    private String titulo;
    private String genero;
    private String compania;
    private String fechaLanzamiento;
    private int horasJugadas;
    private boolean id_favorito;


    public VideoGame(String id, String titulo, String genero, String compania, String fechaLanzamiento, int horasJugadas, boolean id_favorito) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.compania = compania;
        this.fechaLanzamiento = fechaLanzamiento;
        this.horasJugadas = horasJugadas;
        this.id_favorito = id_favorito;
    }

}