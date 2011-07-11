package consorzio.model;

import java.io.Serializable;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.images.Image;
import org.slim3.datastore.Model;
import org.slim3.datastore.Attribute;


@Model
public class Prodotto implements Serializable {

    private static final long serialVersionUID = 1L;
 
    @Attribute(version = true)
    private Long version;
 
 
    public String getUMisura() {
        return UMisura;
    }

    public void setUMisura(String uMisura) {
        UMisura = uMisura;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Attribute
    private  String Descr;
    
    @Attribute
    private String Descr_breve;
    
    public String getDescr_breve() {
        return Descr_breve;
    }

    public void setDescr_breve(String descr_breve) {
        Descr_breve = descr_breve;
    }

    @Attribute(primaryKey = true)
    private Key key;

    private Key key_ricetta;
   
    public Key getKey_ricetta() {
        return key_ricetta;
    }

    public void setKey_ricetta(Key key_ricetta) {
        this.key_ricetta = key_ricetta;
    }

    private String Nome;
    
   
    private int Prezzo;
    
    private String UMisura;
    
    private Boolean Autunno;
    private Boolean Primavera;
    private Boolean Inverno;
    private Boolean Estate;
    
 

    
    
    
    
    /**
     * Returns the key.
     *
     * @return the key
     */
    public Key getKey() {
        return key;
    }

    /**
     * Sets the key.
     *
     * @param key
     *            the key
     */
    public void setKey(Key key) {
        this.key = key;
    }

    /**
     * Returns the version.
     *
     * @return the version
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Sets the version.
     *
     * @param version
     *            the version
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Prodotto other = (Prodotto) obj;
        if (key == null) {
            if (other.key != null) {
                return false;
            }
        } else if (!key.equals(other.key)) {
            return false;
        }
        return true;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setDescr(String descr) {
        Descr = descr;
    }

    public String getDescr() {
        return Descr;
    }


    public void setPrezzo(int prezzo) {
        Prezzo = prezzo;
    }

    public int getPrezzo() {
        return Prezzo;
    }

    public Boolean getAutunno() {
        return Autunno;
    }

    public void setAutunno(Boolean autunno) {
        Autunno = autunno;
    }

    public Boolean getPrimavera() {
        return Primavera;
    }

    public void setPrimavera(Boolean primavera) {
        Primavera = primavera;
    }

    public Boolean getInverno() {
        return Inverno;
    }

    public void setInverno(Boolean inverno) {
        Inverno = inverno;
    }

    public Boolean getEstate() {
        return Estate;
    }

    public void setEstate(Boolean estate) {
        Estate = estate;
    }
   

    
}
