package com.portafolio.loginspring.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="FACTURA")
public class Factura {
    @Id
    @Column(name="IDFACTURA")
    private int idFactura;
    @Column(name="ORDENCOMPRA_IDDOC")
    private int idOc;
    @Column(name="TIPOMONEDA")
    private String tipoMoneda;


    @OneToMany(targetEntity = DetalleFactura.class, cascade = CascadeType.ALL)
    private List<DetalleFactura> detalles = new ArrayList<>();


    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getIdOc() {
        return idOc;
    }

    public void setIdOc(int idOc) {
        this.idOc = idOc;
    }

    public String getTipoMoneda() {
        return tipoMoneda;
    }

    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }
}
