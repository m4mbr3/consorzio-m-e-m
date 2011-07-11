package consorzio.model;

import java.io.Serializable;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.ShortBlob;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;

@Model(schemaVersion = 1)
public class ImmagineRicetteFragment implements Serializable {

    private static final long serialVersionUID = 1L;

    @Attribute(primaryKey = true)
    private Key key;

    @Attribute(version = true)
    private Long version;
    
    @Attribute(lob = true)
    private byte[] bytes;
    
    private int index;

    public ShortBlob getBytes2() {
        return bytes2;
    }

    public void setBytes2(ShortBlob bytes2) {
        this.bytes2 = bytes2;
    }

    public org.slim3.datastore.ModelRef<ImmagineRicette> getUploadDataRef() {
        return uploadDataRef;
    }

    public void setImmagineRicetteRef(
            org.slim3.datastore.ModelRef<ImmagineRicette> uploadDataRef) {
        this.uploadDataRef = uploadDataRef;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    private ShortBlob bytes2;
    private org.slim3.datastore.ModelRef<ImmagineRicette> uploadDataRef =
        new org.slim3.datastore.ModelRef<ImmagineRicette>(
            ImmagineRicette.class);

    public byte[] getBytes() {
        return bytes;
    }
    
    /**
     * Returns the key.
     *
     * @return the key
     */
    public Key getKey() {
        return key;
    }
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
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
        ImmagineRicetteFragment other = (ImmagineRicetteFragment) obj;
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
