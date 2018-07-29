package urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import com.fasterxml.jackson.annotation.JsonProperty;

import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.virtual._interface.VirtualInterface;

/**
 * Class that builds {@link urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterface} instances.
 * 
 * @see urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterface
 *
 */
public class ExternalInterfaceBuilder implements Builder<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterface> {

    private ExternalInterfaceKey _key;
    private java.lang.String _name;
    private VirtualInterface _virtualInterface;
    private java.lang.String _vnfdConnectionPointRef;
    private java.lang.String _type;
    

    Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterface>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterface>> augmentation = Collections.emptyMap();

    public ExternalInterfaceBuilder() {
    }
    public ExternalInterfaceBuilder(urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VirtualInterface arg) {
        this._virtualInterface = arg.getVirtualInterface();
    }

    public ExternalInterfaceBuilder(ExternalInterface base) {
        if (base.getKey() == null) {
            this._key = new ExternalInterfaceKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this._key = base.getKey();
            this._name = _key.getName();
        }
        this._virtualInterface = base.getVirtualInterface();
        this._vnfdConnectionPointRef = base.getVnfdConnectionPointRef();
        if (base instanceof ExternalInterfaceImpl) {
            ExternalInterfaceImpl impl = (ExternalInterfaceImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterface> casted =(AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterface>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VirtualInterface</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VirtualInterface) {
            this._virtualInterface = ((urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VirtualInterface)arg).getVirtualInterface();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VirtualInterface] \n" +
              "but was: " + arg
            );
        }
    }

    public ExternalInterfaceKey getKey() {
        return _key;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public VirtualInterface getVirtualInterface() {
        return _virtualInterface;
    }

    public java.lang.String getVnfdConnectionPointRef() {
        return _vnfdConnectionPointRef;
    }
    public java.lang.String getType() {
        return _type;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterface>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ExternalInterfaceBuilder setKey(final ExternalInterfaceKey value) {
        this._key = value;
        return this;
    }
    
     
    public ExternalInterfaceBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public ExternalInterfaceBuilder setVirtualInterface(final VirtualInterface value) {
        this._virtualInterface = value;
        return this;
    }
    
     
    public ExternalInterfaceBuilder setVnfdConnectionPointRef(final java.lang.String value) {
        this._vnfdConnectionPointRef = value;
        return this;
    }
    
    public ExternalInterfaceBuilder addAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterface>> augmentationType, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterface> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ExternalInterfaceBuilder removeAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterface>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ExternalInterface build() {
        return new ExternalInterfaceImpl(this);
    }

    public static final class ExternalInterfaceImpl implements ExternalInterface {

        @Override
        public java.lang.Class<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterface> getImplementedInterface() {
            return urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterface.class;
        }

        @JsonProperty("key")
        private final ExternalInterfaceKey _key;
        @JsonProperty("name")
        private final java.lang.String _name;
        @JsonProperty("type")
        private final java.lang.String _type;
        @JsonProperty("virtual-interface")
        private final VirtualInterface _virtualInterface;
        @JsonProperty("vnfd-connection-point-ref")
        private final java.lang.String _vnfdConnectionPointRef;
        @JsonProperty("external-connection-point-ref")
        private final java.lang.String _vnfdConnectionPointRef2;

        private Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterface>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterface>> augmentation = Collections.emptyMap();

        private ExternalInterfaceImpl(ExternalInterfaceBuilder base) {
            if (base.getKey() == null) {
                this._key = new ExternalInterfaceKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this._key = base.getKey();
                this._name = _key.getName();
            }
            this._virtualInterface = base.getVirtualInterface();
            this._vnfdConnectionPointRef = base.getVnfdConnectionPointRef();
            this._vnfdConnectionPointRef2 = base.getVnfdConnectionPointRef();
            this._type = base.getType();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterface>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterface>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterface>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterface>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }
        
        public ExternalInterfaceImpl(){
        	this( new ExternalInterfaceBuilder() );
        }

        @Override
        public ExternalInterfaceKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        

        public java.lang.String getType() {
            return _type;
        }
        
        @Override
        public VirtualInterface getVirtualInterface() {
            return _virtualInterface;
        }
        
        @Override
        public java.lang.String getVnfdConnectionPointRef() {
            return _vnfdConnectionPointRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterface>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_virtualInterface);
            result = prime * result + Objects.hashCode(_vnfdConnectionPointRef);
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
            if (!urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterface.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterface other = (urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterface)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_virtualInterface, other.getVirtualInterface())) {
                return false;
            }
            if (!Objects.equals(_vnfdConnectionPointRef, other.getVnfdConnectionPointRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ExternalInterfaceImpl otherImpl = (ExternalInterfaceImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterface>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterface>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ExternalInterface [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_virtualInterface != null) {
                builder.append("_virtualInterface=");
                builder.append(_virtualInterface);
                builder.append(", ");
            }
            if (_vnfdConnectionPointRef != null) {
                builder.append("_vnfdConnectionPointRef=");
                builder.append(_vnfdConnectionPointRef);
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
