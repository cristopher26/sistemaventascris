package sistemaventas;
public class Producto {
    private String Codigo;
    private String Descripcion;
    private int StockMinimo;
    private int Precio;
    private int StockActual;

    public Producto(String Codigo, String Descripcion, int StockMinimo, int Precio, int StockActual) {
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.StockMinimo = StockMinimo;
        this.Precio = Precio;
        this.StockActual = StockActual;
    }
    public Producto(){
        
    }
    
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getStockMinimo() {
        return StockMinimo;
    }

    public void setStockMinimo(int StockMinimo) {
        this.StockMinimo = StockMinimo;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getStockActual() {
        return StockActual;
    }

    public void setStockActual(int StockActual) {
        this.StockActual = StockActual;
    }
    
    
}
