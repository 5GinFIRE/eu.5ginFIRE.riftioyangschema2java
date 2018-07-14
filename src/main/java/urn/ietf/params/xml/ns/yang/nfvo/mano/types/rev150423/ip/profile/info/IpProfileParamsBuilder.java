package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import com.fasterxml.jackson.annotation.JsonProperty;

import urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpPrefix;
import urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpVersion;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.ip.profile.params.DhcpParams;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.ip.profile.params.DnsServer;

/**
 * Class that builds {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.IpProfileParams} instances.
 * 
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.IpProfileParams
 *
 */
public class IpProfileParamsBuilder implements Builder<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.IpProfileParams> {

    private DhcpParams _dhcpParams;
    private List<DnsServer> _dnsServer;
    private IpAddress _gatewayAddress;
    private IpVersion _ipVersion;
    private java.lang.String _securityGroup;
    private IpPrefix _subnetAddress;
    private java.lang.String _subnetPrefixPool;

    Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.IpProfileParams>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.IpProfileParams>> augmentation = Collections.emptyMap();

    public IpProfileParamsBuilder() {
    }

    public IpProfileParamsBuilder(IpProfileParams base) {
        this._dhcpParams = base.getDhcpParams();
        this._dnsServer = base.getDnsServer();
        this._gatewayAddress = base.getGatewayAddress();
        this._ipVersion = base.getIpVersion();
        this._securityGroup = base.getSecurityGroup();
        this._subnetAddress = base.getSubnetAddress();
        this._subnetPrefixPool = base.getSubnetPrefixPool();
        if (base instanceof IpProfileParamsImpl) {
            IpProfileParamsImpl impl = (IpProfileParamsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.IpProfileParams> casted =(AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.IpProfileParams>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public DhcpParams getDhcpParams() {
        return _dhcpParams;
    }
    
    public List<DnsServer> getDnsServer() {
        return _dnsServer;
    }
    
    public IpAddress getGatewayAddress() {
        return _gatewayAddress;
    }
    
    public IpVersion getIpVersion() {
        return _ipVersion;
    }
    
    public java.lang.String getSecurityGroup() {
        return _securityGroup;
    }
    
    public IpPrefix getSubnetAddress() {
        return _subnetAddress;
    }
    
    public java.lang.String getSubnetPrefixPool() {
        return _subnetPrefixPool;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.IpProfileParams>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public IpProfileParamsBuilder setDhcpParams(final DhcpParams value) {
        this._dhcpParams = value;
        return this;
    }
    
     
    public IpProfileParamsBuilder setDnsServer(final List<DnsServer> value) {
        this._dnsServer = value;
        return this;
    }
    
     
    public IpProfileParamsBuilder setGatewayAddress(final IpAddress value) {
        this._gatewayAddress = value;
        return this;
    }
    
     
    public IpProfileParamsBuilder setIpVersion(final IpVersion value) {
        this._ipVersion = value;
        return this;
    }
    
     
    public IpProfileParamsBuilder setSecurityGroup(final java.lang.String value) {
        this._securityGroup = value;
        return this;
    }
    
     
    public IpProfileParamsBuilder setSubnetAddress(final IpPrefix value) {
        this._subnetAddress = value;
        return this;
    }
    
     
    public IpProfileParamsBuilder setSubnetPrefixPool(final java.lang.String value) {
        this._subnetPrefixPool = value;
        return this;
    }
    
    public IpProfileParamsBuilder addAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.IpProfileParams>> augmentationType, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.IpProfileParams> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public IpProfileParamsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.IpProfileParams>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public IpProfileParams build() {
        return new IpProfileParamsImpl(this);
    }

    public static final class IpProfileParamsImpl implements IpProfileParams {

        @Override
        public java.lang.Class<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.IpProfileParams> getImplementedInterface() {
            return urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.IpProfileParams.class;
        }

        private final DhcpParams _dhcpParams;
        private final List<DnsServer> _dnsServer;
        @JsonProperty("gateway-address")
        private final IpAddress _gatewayAddress;
        @JsonProperty("ip-version")
        private final IpVersion _ipVersion;
        @JsonProperty("security-group")
        private final java.lang.String _securityGroup;
        private final IpPrefix _subnetAddress;
        @JsonProperty("subnet-prefix-pool")
        private final java.lang.String _subnetPrefixPool;

        private Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.IpProfileParams>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.IpProfileParams>> augmentation = Collections.emptyMap();

        private IpProfileParamsImpl(IpProfileParamsBuilder base) {
            this._dhcpParams = base.getDhcpParams();
            this._dnsServer = base.getDnsServer();
            this._gatewayAddress = base.getGatewayAddress();
            this._ipVersion = base.getIpVersion();
            this._securityGroup = base.getSecurityGroup();
            this._subnetAddress = base.getSubnetAddress();
            this._subnetPrefixPool = base.getSubnetPrefixPool();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.IpProfileParams>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.IpProfileParams>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.IpProfileParams>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.IpProfileParams>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        public IpProfileParamsImpl() {
        	this( new IpProfileParamsBuilder() );
        }
        
        
        @Override
        public DhcpParams getDhcpParams() {
            return _dhcpParams;
        }
        
        @Override
        public List<DnsServer> getDnsServer() {
            return _dnsServer;
        }
        
        @Override
        public IpAddress getGatewayAddress() {
            return _gatewayAddress;
        }
        
        @Override
        public IpVersion getIpVersion() {
            return _ipVersion;
        }
        
        @Override
        public java.lang.String getSecurityGroup() {
            return _securityGroup;
        }
        
        @Override
        public IpPrefix getSubnetAddress() {
            return _subnetAddress;
        }
        
        @Override
        public java.lang.String getSubnetPrefixPool() {
            return _subnetPrefixPool;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.IpProfileParams>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_dhcpParams);
            result = prime * result + Objects.hashCode(_dnsServer);
            result = prime * result + Objects.hashCode(_gatewayAddress);
            result = prime * result + Objects.hashCode(_ipVersion);
            result = prime * result + Objects.hashCode(_securityGroup);
            result = prime * result + Objects.hashCode(_subnetAddress);
            result = prime * result + Objects.hashCode(_subnetPrefixPool);
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
            if (!urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.IpProfileParams.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.IpProfileParams other = (urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.IpProfileParams)obj;
            if (!Objects.equals(_dhcpParams, other.getDhcpParams())) {
                return false;
            }
            if (!Objects.equals(_dnsServer, other.getDnsServer())) {
                return false;
            }
            if (!Objects.equals(_gatewayAddress, other.getGatewayAddress())) {
                return false;
            }
            if (!Objects.equals(_ipVersion, other.getIpVersion())) {
                return false;
            }
            if (!Objects.equals(_securityGroup, other.getSecurityGroup())) {
                return false;
            }
            if (!Objects.equals(_subnetAddress, other.getSubnetAddress())) {
                return false;
            }
            if (!Objects.equals(_subnetPrefixPool, other.getSubnetPrefixPool())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                IpProfileParamsImpl otherImpl = (IpProfileParamsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.IpProfileParams>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.IpProfileParams>> e : augmentation.entrySet()) {
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
            java.lang.String name = "IpProfileParams [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_dhcpParams != null) {
                builder.append("_dhcpParams=");
                builder.append(_dhcpParams);
                builder.append(", ");
            }
            if (_dnsServer != null) {
                builder.append("_dnsServer=");
                builder.append(_dnsServer);
                builder.append(", ");
            }
            if (_gatewayAddress != null) {
                builder.append("_gatewayAddress=");
                builder.append(_gatewayAddress);
                builder.append(", ");
            }
            if (_ipVersion != null) {
                builder.append("_ipVersion=");
                builder.append(_ipVersion);
                builder.append(", ");
            }
            if (_securityGroup != null) {
                builder.append("_securityGroup=");
                builder.append(_securityGroup);
                builder.append(", ");
            }
            if (_subnetAddress != null) {
                builder.append("_subnetAddress=");
                builder.append(_subnetAddress);
                builder.append(", ");
            }
            if (_subnetPrefixPool != null) {
                builder.append("_subnetPrefixPool=");
                builder.append(_subnetPrefixPool);
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
