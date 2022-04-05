package android.ejemplo.recyclerview;

public class Encapsulador {
    int idImagen;
    String textoTitulo, textoContenido;

    public int getIdImagen() { return idImagen; }

    public String getTextoTitulo() {
        return textoTitulo;
    }

    public String getTextoContenido() {
        return textoContenido;
    }

    public Encapsulador(int idImagen, String textoTitulo, String textoContenido){
        this.idImagen=idImagen;
        this.textoTitulo=textoTitulo;
        this.textoContenido=textoContenido;
    }
}
