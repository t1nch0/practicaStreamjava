package queries;

/**
 * @version 1.1
 * @autor Martin Fernandez
 */
public class Detalle {
    private int cantidad, detalle, descuento, total, codPedido;
    private String producto, codDetalle;
    public Pedido pedido;

    public Detalle(int cantidad, int detalle, int descuento, int total, int codPedido, String producto, String codDetalle) {
        this.cantidad = cantidad;
        this.detalle = detalle;
        this.descuento = descuento;
        this.total = total;
        this.codPedido = codPedido;
        this.producto = producto;
        this.codDetalle = codDetalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getDetalle() {
        return detalle;
    }

    public void setDetalle(int detalle) {
        this.detalle = detalle;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(int codPedido) {
        this.codPedido = codPedido;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCodDetalle() {
        return codDetalle;
    }

    public void setCodDetalle(String codDetalle) {
        this.codDetalle = codDetalle;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
