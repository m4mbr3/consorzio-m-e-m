package consorzio.shared.model;

import java.io.Serializable;
import java.util.Date;


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
    
    private String nome;
    
    @Attribute(lob = true)
    private String descrizione;
    
    private long prezzo;

    //file binario necessita di questo attributo
    @Attribute(lob = true)
    private Image immagine ;
    
    private int quantita;
    
    private Date dataCreato = new Date();

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
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPrezzo(long prezzo) {
        this.prezzo = prezzo;
    }

    public long getPrezzo() {
        return prezzo;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setImmagine(Image immagine) {
        this.immagine = immagine;
    }

    public Image getImmagine() {
        return immagine;
    }

    public void setDataCreato(Date dataCreato) {
        this.dataCreato = dataCreato;
    }

    public Date getDataCreato() {
        return dataCreato;
    }
}
