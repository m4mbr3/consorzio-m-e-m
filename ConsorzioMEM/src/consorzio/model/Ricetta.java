package consorzio.model;

import java.io.Serializable;
import java.util.ArrayList;

import com.google.appengine.api.datastore.Key;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;

@Model(schemaVersion = 1)
public class Ricetta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Attribute(primaryKey = true)
    private Key key;

    @Attribute(version = true)
    private Long version;
    
    @Attribute
    private Key key_product;
    
    @Attribute 
    private String nome;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Attribute (lob = true)
    private String ingredienti;
    
    @Attribute (lob = true)
    private String preparazione;
    
    @Attribute (lob = true)
    private String consigli;
    
    public String getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(String ingredienti) {
        this.ingredienti = ingredienti;
    }

    public String getPreparazione() {
        return preparazione;
    }

    public void setPreparazione(String preparazione) {
        this.preparazione = preparazione;
    }

    public String getConsigli() {
        return consigli;
    }

    public void setConsigli(String consigli) {
        this.consigli = consigli;
    }

    @Attribute 
    private String categoria;
    
    @Attribute (lob = true)
    private String ricetta;

    public String getRicetta() {
        return ricetta;
    }

    public void setRicetta(String ricetta) {
        this.ricetta = ricetta;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    @Attribute (lob = true)
    private String descr;

   
   
    @Attribute
    private String diff;
    
    @Attribute
    private int min_cott;
    
    @Attribute
    private int min_prep;
    
    @Attribute
    private int x_num_persone;
    
   
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
        Ricetta other = (Ricetta) obj;
        if (key == null) {
            if (other.key != null) {
                return false;
            }
        } else if (!key.equals(other.key)) {
            return false;
        }
        return true;
    }
    public Key getKey_product() {
        return key_product;
    }

    public void setKey_product(Key key_product) {
        this.key_product = key_product;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDiff() {
        return diff;
    }

    public void setDiff(String diff) {
        this.diff = diff;
    }

    public int getMin_cott() {
        return min_cott;
    }

    public void setMin_cott(int min_cott) {
        this.min_cott = min_cott;
    }

    public int getMin_prep() {
        return min_prep;
    }

    public void setMin_prep(int min_prep) {
        this.min_prep = min_prep;
    }

    public int getX_num_persone() {
        return x_num_persone;
    }

    public void setX_num_persone(int x_num_persone) {
        this.x_num_persone = x_num_persone;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
