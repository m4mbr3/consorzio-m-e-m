package consorzio.model;

import java.io.Serializable;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.ShortBlob;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;
import org.slim3.datastore.ModelRef;

@Model(schemaVersion = 1)
public class ImmagineFragment implements Serializable {

    private static final long serialVersionUID = 1L;

    @Attribute(primaryKey = true)
    private Key key;

    @Attribute(version = true)
    private Long version;
    
    @Attribute(lob = true)
    private byte[] bytes;

    private ShortBlob bytes2;
    private org.slim3.datastore.ModelRef<Immagine> uploadDataRef =
        new org.slim3.datastore.ModelRef<Immagine>(
            Immagine.class);

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public ShortBlob getBytes2() {
        return bytes2;
    }

    public void setBytes2(ShortBlob bytes2) {
        this.bytes2 = bytes2;
    }

    public org.slim3.datastore.ModelRef<Immagine> getUploadDataRef() {
        return uploadDataRef;
    }

    public void setImmagineRef(
            org.slim3.datastore.ModelRef<Immagine> uploadDataRef) {
        this.uploadDataRef = uploadDataRef;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    private int index;
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
        ImmagineFragment other = (ImmagineFragment) obj;
        if (key == null) {
            if (other.key != null) {
                return false;
            }
        } else if (!key.equals(other.key)) {
            return false;
        }
        return true;
    }
    /**
     * @return the uploadDataRef
     */
    public ModelRef<Immagine> getImmagineRef() {
        return uploadDataRef;
    }
}
