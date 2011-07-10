package consorzio.model;


import java.io.Serializable;

import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.images.Image;


import org.slim3.datastore.Attribute;
import org.slim3.datastore.InverseModelListRef;
import org.slim3.datastore.Model;
import org.slim3.datastore.Sort;

@Model(schemaVersion = 1)
public class Immagine implements Serializable {

    private static final long serialVersionUID = 1L;

    @Attribute(primaryKey = true)
    private Key key;

    @Attribute(version = true)
    private Long version;
    
    @Attribute
    private Key key_Product;
    
    @Attribute(lob = true)
    private Image image;
    
    @Attribute
    private int length;
    
    @Attribute
    private String Nome;
    
    @Attribute(persistent = false)
   private org.slim3.datastore.InverseModelListRef<consorzio.model.ImmagineFragment, consorzio.model.Immagine> fragmentListRef =
        new org.slim3.datastore.InverseModelListRef<consorzio.model.ImmagineFragment, consorzio.model.Immagine>(consorzio.model.ImmagineFragment.class,
            "uploadDataRef",
            this,
            new Sort("index"));
    
    
    
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
   
    public InverseModelListRef<ImmagineFragment, Immagine> getFragmentListRef() {
        return fragmentListRef;
    }
    
    public Key getKey_Product() {
        return key_Product;
    }

    public void setKey_Product(Key key_Product) {
        this.key_Product = key_Product;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
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

    @Attribute
    private String Descr;

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
        Immagine other = (Immagine) obj;
        if (key == null) {            if (other.key != null) {
                return false;
            }
        } else if (!key.equals(other.key)) {
            return false;
        }
        return true;
    }
}
