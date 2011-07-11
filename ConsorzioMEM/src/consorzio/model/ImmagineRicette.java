package consorzio.model;

import java.io.Serializable;

import com.google.appengine.api.datastore.Key;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.InverseModelListRef;
import org.slim3.datastore.Model;
import org.slim3.datastore.Sort;

@Model(schemaVersion = 1)
public class ImmagineRicette implements Serializable {

    private static final long serialVersionUID = 1L;

    @Attribute(primaryKey = true)
    private Key key;

    @Attribute(version = true)
    private Long version;
    
    @Attribute
    private Key key_Ricette;
    @Attribute
    private int length;
    @Attribute
    private String Nome;
    
    @Attribute(persistent = false)
    private org.slim3.datastore.InverseModelListRef<consorzio.model.ImmagineRicetteFragment, consorzio.model.ImmagineRicette> fragmentListRef =
         new org.slim3.datastore.InverseModelListRef<consorzio.model.ImmagineRicetteFragment, consorzio.model.ImmagineRicette>(consorzio.model.ImmagineRicetteFragment.class,
             "uploadDataRef",
             this,
             new Sort("index"));
    @Attribute
    private String Descr;
     
    

    public Key getKey_Ricette() {
        return key_Ricette;
    }

    public void setKey_Ricette(Key key_Ricette) {
        this.key_Ricette = key_Ricette;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public org.slim3.datastore.InverseModelListRef<consorzio.model.ImmagineRicetteFragment, consorzio.model.ImmagineRicette> getFragmentListRef() {
        return fragmentListRef;
    }
    
    
    public String getDescr() {
        return Descr;
    }

    public void setDescr(String descr) {
        Descr = descr;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

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
        ImmagineRicette other = (ImmagineRicette) obj;
        if (key == null) {
            if (other.key != null) {
                return false;
            }
        } else if (!key.equals(other.key)) {
            return false;
        }
        return true;
    }
}
