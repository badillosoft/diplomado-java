package mii_sesion4;

import java.awt.List;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Producto {
    
    private int id;
    private String nombre;
    private String descripcion;
    private float costo;
    private float costoUnitario;
    private int existencias;
    private boolean bloqueado;
    private Date creacion;
    private Date modificacion;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public float getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(float costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public Date getCreacion() {
        return creacion;
    }

    public Date getModificacion() {
        return modificacion;
    }
    
    public boolean insertarNuevo() {
        DBManager db = new DBManager("cic", "root", "kmmx");
        
        Object[] values = new Object[] {
            nombre,
            descripcion,
            costo,
            costoUnitario,
            existencias,
            bloqueado
        };
        
        return db.insert("productos", new String[] {
            "nombre", "descripcion", "costo", "costo_unitario",
            "existencias", "bloqueado"
        }, values);
    }
    
}
