package consorzio.model;

import java.io.Serializable;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.images.Image;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;

@Model(schemaVersion = 1)
public class Prodotto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Attribute(primaryKey = true)
    private Key key;

    @Attribute(version = true)
    private Long version;
    
    @Attribute
    private String Nome;
    
    @Attribute
    private int Prezzo;
    
    @Attribute
    private String Stagione;
    
    public String getStagione() {
        return Stagione;
    }

    public void setStagione(String stagione) {
        Stagione = stagione;
    }

    @Attribute//(lob = true)
    private String Descr;
    
    @Attribute(lob = true)
    private Image Immagine;
    
    
    
    
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

    public void setImmagine(Image immagine) {
        Immagine = immagine;
    }

    public Image getImmagine() {
        return Immagine;
    }

    public void setPrezzo(int prezzo) {
        Prezzo = prezzo;
    }

    public int getPrezzo() {
        return Prezzo;
    }
}