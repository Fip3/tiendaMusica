package modelo;

public abstract class Instrumento {
    protected int codigo;
    protected String nombre;
    protected int stock;
    protected String tipoInstrumento;

    public Instrumento(){
    }
    
    public Instrumento(int codigo, String nombre, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getTipoInstrumento() {
        return tipoInstrumento;
    }
    
    public abstract String mostrar();
    
}
