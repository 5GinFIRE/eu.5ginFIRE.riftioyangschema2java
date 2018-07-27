package urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import com.fasterxml.jackson.annotation.JsonProperty;

import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog.NsdBuilder;

/**
 * Class that builds {@link urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependency} instances.
 * 
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependency
 *
 */
public class VnfDependencyBuilder implements Builder<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependency> {

    private VnfDependencyKey _key;
    private java.lang.String _vnfDependsOnRef;
    private java.lang.String _vnfSourceRef;

    Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependency>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependency>> augmentation = Collections.emptyMap();

    public VnfDependencyBuilder() {
    }

    public VnfDependencyBuilder(VnfDependency base) {
        if (base.getKey() == null) {
            this._key = new VnfDependencyKey(
                base.getVnfSourceRef()
            );
            this._vnfSourceRef = base.getVnfSourceRef();
        } else {
            this._key = base.getKey();
            this._vnfSourceRef = _key.getVnfSourceRef();
        }
        this._vnfDependsOnRef = base.getVnfDependsOnRef();
        if (base instanceof VnfDependencyImpl) {
            VnfDependencyImpl impl = (VnfDependencyImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependency> casted =(AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependency>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public VnfDependencyKey getKey() {
        return _key;
    }
    
    public java.lang.String getVnfDependsOnRef() {
        return _vnfDependsOnRef;
    }
    
    public java.lang.String getVnfSourceRef() {
        return _vnfSourceRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependency>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VnfDependencyBuilder setKey(final VnfDependencyKey value) {
        this._key = value;
        return this;
    }
    
     
    public VnfDependencyBuilder setVnfDependsOnRef(final java.lang.String value) {
        this._vnfDependsOnRef = value;
        return this;
    }
    
     
    public VnfDependencyBuilder setVnfSourceRef(final java.lang.String value) {
        this._vnfSourceRef = value;
        return this;
    }
    
    public VnfDependencyBuilder addAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependency>> augmentationType, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependency> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfDependencyBuilder removeAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependency>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfDependency build() {
        return new VnfDependencyImpl(this);
    }

    public static final class VnfDependencyImpl implements VnfDependency {

        @Override
        public java.lang.Class<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependency> getImplementedInterface() {
            return urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependency.class;
        }

        private final VnfDependencyKey _key;       
        @JsonProperty("vnf-depends-on-ref")
        private final java.lang.String _vnfDependsOnRef;
        @JsonProperty("vnf-source-ref")
        private final java.lang.String _vnfSourceRef;

        private Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependency>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependency>> augmentation = Collections.emptyMap();

        private VnfDependencyImpl(VnfDependencyBuilder base) {
            if (base.getKey() == null) {
                this._key = new VnfDependencyKey(
                    base.getVnfSourceRef()
                );
                this._vnfSourceRef = base.getVnfSourceRef();
            } else {
                this._key = base.getKey();
                this._vnfSourceRef = _key.getVnfSourceRef();
            }
            this._vnfDependsOnRef = base.getVnfDependsOnRef();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependency>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependency>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependency>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependency>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }


    	public VnfDependencyImpl(){
    		this( new VnfDependencyBuilder() );
    	}
    	
        @Override
        public VnfDependencyKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getVnfDependsOnRef() {
            return _vnfDependsOnRef;
        }
        
        @Override
        public java.lang.String getVnfSourceRef() {
            return _vnfSourceRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependency>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_vnfDependsOnRef);
            result = prime * result + Objects.hashCode(_vnfSourceRef);
            result = prime * result + Objects.hashCode(augmentation);
        
            hash = result;
            hashValid = true;
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependency.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependency other = (urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependency)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_vnfDependsOnRef, other.getVnfDependsOnRef())) {
                return false;
            }
            if (!Objects.equals(_vnfSourceRef, other.getVnfSourceRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfDependencyImpl otherImpl = (VnfDependencyImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependency>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependency>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.getAugmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "VnfDependency [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_vnfDependsOnRef != null) {
                builder.append("_vnfDependsOnRef=");
                builder.append(_vnfDependsOnRef);
                builder.append(", ");
            }
            if (_vnfSourceRef != null) {
                builder.append("_vnfSourceRef=");
                builder.append(_vnfSourceRef);
            }
            final int builderLength = builder.length();
            final int builderAdditionalLength = builder.substring(name.length(), builderLength).length();
            if (builderAdditionalLength > 2 && !builder.substring(builderLength - 2, builderLength).equals(", ")) {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
