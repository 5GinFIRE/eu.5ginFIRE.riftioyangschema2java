package urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog;
import java.util.ArrayList;
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

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.input.parameter.xpath.InputParameterXpath;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.list.IpProfiles;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.ConnectionPoint;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.ConstituentVnfd;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.InitialConfigPrimitive;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.KeyPair;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.MonitoringParam;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.ParameterPool;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.PlacementGroups;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.ScalingGroupDescriptor;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.ServicePrimitive;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.User;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.Vld;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependency;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.Vnffgd;

/**
 * Class that builds {@link urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog.Nsd} instances.
 * 
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog.Nsd
 *
 */
public class NsdBuilder implements Builder<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog.Nsd> {

    private List<ConnectionPoint> _connectionPoint;
    private List<ConstituentVnfd> _constituentVnfd;
    private java.lang.String _description;
    private java.lang.String _id;
    private List<InitialConfigPrimitive> _initialConfigPrimitive;
    private List<InputParameterXpath> _inputParameterXpath;
    private List<IpProfiles> _ipProfiles;
    private NsdKey _key;
    private List<KeyPair> _keyPair;
    private java.lang.String _logo;
    private List<MonitoringParam> _monitoringParam;
    private java.lang.String _name;
    private List<ParameterPool> _parameterPool;
    private List<PlacementGroups> _placementGroups;
    private List<ScalingGroupDescriptor> _scalingGroupDescriptor;
    private List<ServicePrimitive> _servicePrimitive;
    private java.lang.String _shortName;
    private List<User> _user;
    private java.lang.String _vendor;
    private java.lang.String _version;
    private List<Vld> _vld;
    private List<VnfDependency> _vnfDependency;
    private List<Vnffgd> _vnffgd;

    Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog.Nsd>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog.Nsd>> augmentation = Collections.emptyMap();

    public NsdBuilder() {
    }
    public NsdBuilder(urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor arg) {
        this._id = arg.getId();
        this._name = arg.getName();
        this._shortName = arg.getShortName();
        this._vendor = arg.getVendor();
        this._logo = arg.getLogo();
        this._description = arg.getDescription();
        this._version = arg.getVersion();
        this._connectionPoint = arg.getConnectionPoint();
        this._vld = arg.getVld();
        this._constituentVnfd = arg.getConstituentVnfd();
        this._scalingGroupDescriptor = arg.getScalingGroupDescriptor();
        this._placementGroups = arg.getPlacementGroups();
        this._vnfDependency = arg.getVnfDependency();
        this._vnffgd = arg.getVnffgd();
        this._monitoringParam = arg.getMonitoringParam();
        this._parameterPool = arg.getParameterPool();
        this._servicePrimitive = arg.getServicePrimitive();
        this._initialConfigPrimitive = arg.getInitialConfigPrimitive();
        this._keyPair = arg.getKeyPair();
        this._user = arg.getUser();
        this._ipProfiles = arg.getIpProfiles();
        this._inputParameterXpath = arg.getInputParameterXpath();
    }
    public NsdBuilder(urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.IpProfileList arg) {
        this._ipProfiles = arg.getIpProfiles();
    }
    public NsdBuilder(urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.InputParameterXpath arg) {
        this._inputParameterXpath = arg.getInputParameterXpath();
    }

    public NsdBuilder(Nsd base) {
        if (base.getKey() == null) {
            this._key = new NsdKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this._key = base.getKey();
            this._id = _key.getId();
        }
        this._connectionPoint = base.getConnectionPoint();
        this._constituentVnfd = base.getConstituentVnfd();
        this._description = base.getDescription();
        this._initialConfigPrimitive = base.getInitialConfigPrimitive();
        this._inputParameterXpath = base.getInputParameterXpath();
        this._ipProfiles = base.getIpProfiles();
        this._keyPair = base.getKeyPair();
        this._logo = base.getLogo();
        this._monitoringParam = base.getMonitoringParam();
        this._name = base.getName();
        this._parameterPool = base.getParameterPool();
        this._placementGroups = base.getPlacementGroups();
        this._scalingGroupDescriptor = base.getScalingGroupDescriptor();
        this._servicePrimitive = base.getServicePrimitive();
        this._shortName = base.getShortName();
        this._user = base.getUser();
        this._vendor = base.getVendor();
        this._version = base.getVersion();
        this._vld = base.getVld();
        this._vnfDependency = base.getVnfDependency();
        this._vnffgd = base.getVnffgd();
        if (base instanceof NsdImpl) {
            NsdImpl impl = (NsdImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog.Nsd> casted =(AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog.Nsd>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.IpProfileList</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.InputParameterXpath</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor) {
            this._id = ((urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor)arg).getId();
            this._name = ((urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor)arg).getName();
            this._shortName = ((urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor)arg).getShortName();
            this._vendor = ((urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor)arg).getVendor();
            this._logo = ((urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor)arg).getLogo();
            this._description = ((urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor)arg).getDescription();
            this._version = ((urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor)arg).getVersion();
            this._connectionPoint = ((urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor)arg).getConnectionPoint();
            this._vld = ((urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor)arg).getVld();
            this._constituentVnfd = ((urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor)arg).getConstituentVnfd();
            this._scalingGroupDescriptor = ((urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor)arg).getScalingGroupDescriptor();
            this._placementGroups = ((urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor)arg).getPlacementGroups();
            this._vnfDependency = ((urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor)arg).getVnfDependency();
            this._vnffgd = ((urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor)arg).getVnffgd();
            this._monitoringParam = ((urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor)arg).getMonitoringParam();
            this._parameterPool = ((urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor)arg).getParameterPool();
            this._servicePrimitive = ((urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor)arg).getServicePrimitive();
            this._initialConfigPrimitive = ((urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor)arg).getInitialConfigPrimitive();
            this._keyPair = ((urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor)arg).getKeyPair();
            this._user = ((urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor)arg).getUser();
            isValidArg = true;
        }
        if (arg instanceof urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.IpProfileList) {
            this._ipProfiles = ((urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.IpProfileList)arg).getIpProfiles();
            isValidArg = true;
        }
        if (arg instanceof urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.InputParameterXpath) {
            this._inputParameterXpath = ((urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.InputParameterXpath)arg).getInputParameterXpath();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.IpProfileList, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.InputParameterXpath] \n" +
              "but was: " + arg
            );
        }
    }

    public List<ConnectionPoint> getConnectionPoint() {
        return _connectionPoint;
    }
    
    public List<ConstituentVnfd> getConstituentVnfd() {
        return _constituentVnfd;
    }
    
    public java.lang.String getDescription() {
        return _description;
    }
    
    public java.lang.String getId() {
        return _id;
    }
    
    public List<InitialConfigPrimitive> getInitialConfigPrimitive() {
        return _initialConfigPrimitive;
    }
    
    public List<InputParameterXpath> getInputParameterXpath() {
        return _inputParameterXpath;
    }
    
    public List<IpProfiles> getIpProfiles() {
        return _ipProfiles;
    }
    
    public NsdKey getKey() {
        return _key;
    }
    
    public List<KeyPair> getKeyPair() {
        return _keyPair;
    }
    
    public java.lang.String getLogo() {
        return _logo;
    }
    
    public List<MonitoringParam> getMonitoringParam() {
        return _monitoringParam;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public List<ParameterPool> getParameterPool() {
        return _parameterPool;
    }
    
    public List<PlacementGroups> getPlacementGroups() {
        return _placementGroups;
    }
    
    public List<ScalingGroupDescriptor> getScalingGroupDescriptor() {
        return _scalingGroupDescriptor;
    }
    
    public List<ServicePrimitive> getServicePrimitive() {
        return _servicePrimitive;
    }
    
    public java.lang.String getShortName() {
        return _shortName;
    }
    
    public List<User> getUser() {
        return _user;
    }
    
    public java.lang.String getVendor() {
        return _vendor;
    }
    
    public java.lang.String getVersion() {
        return _version;
    }
    
    public List<Vld> getVld() {
        return _vld;
    }
    
    public List<VnfDependency> getVnfDependency() {
        return _vnfDependency;
    }
    
    public List<Vnffgd> getVnffgd() {
        return _vnffgd;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog.Nsd>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public NsdBuilder setConnectionPoint(final List<ConnectionPoint> value) {
        this._connectionPoint = value;
        return this;
    }
    
     
    public NsdBuilder setConstituentVnfd(final List<ConstituentVnfd> value) {
        this._constituentVnfd = value;
        return this;
    }
    
     
    public NsdBuilder setDescription(final java.lang.String value) {
        this._description = value;
        return this;
    }
    
     
    public NsdBuilder setId(final java.lang.String value) {
        this._id = value;
        return this;
    }
    
     
    public NsdBuilder setInitialConfigPrimitive(final List<InitialConfigPrimitive> value) {
        this._initialConfigPrimitive = value;
        return this;
    }
    
     
    public NsdBuilder setInputParameterXpath(final List<InputParameterXpath> value) {
        this._inputParameterXpath = value;
        return this;
    }
    
     
    public NsdBuilder setIpProfiles(final List<IpProfiles> value) {
        this._ipProfiles = value;
        return this;
    }
    
     
    public NsdBuilder setKey(final NsdKey value) {
        this._key = value;
        return this;
    }
    
     
    public NsdBuilder setKeyPair(final List<KeyPair> value) {
        this._keyPair = value;
        return this;
    }
    
     
    public NsdBuilder setLogo(final java.lang.String value) {
        this._logo = value;
        return this;
    }
    
     
    public NsdBuilder setMonitoringParam(final List<MonitoringParam> value) {
        this._monitoringParam = value;
        return this;
    }
    
     
    public NsdBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public NsdBuilder setParameterPool(final List<ParameterPool> value) {
        this._parameterPool = value;
        return this;
    }
    
     
    public NsdBuilder setPlacementGroups(final List<PlacementGroups> value) {
        this._placementGroups = value;
        return this;
    }
    
     
    public NsdBuilder setScalingGroupDescriptor(final List<ScalingGroupDescriptor> value) {
        this._scalingGroupDescriptor = value;
        return this;
    }
    
     
    public NsdBuilder setServicePrimitive(final List<ServicePrimitive> value) {
        this._servicePrimitive = value;
        return this;
    }
    
     
    public NsdBuilder setShortName(final java.lang.String value) {
        this._shortName = value;
        return this;
    }
    
     
    public NsdBuilder setUser(final List<User> value) {
        this._user = value;
        return this;
    }
    
     
    public NsdBuilder setVendor(final java.lang.String value) {
        this._vendor = value;
        return this;
    }
    
     
    public NsdBuilder setVersion(final java.lang.String value) {
        this._version = value;
        return this;
    }
    
     
    public NsdBuilder setVld(final List<Vld> value) {
        this._vld = value;
        return this;
    }
    
     
    public NsdBuilder setVnfDependency(final List<VnfDependency> value) {
        this._vnfDependency = value;
        return this;
    }
    
     
    public NsdBuilder setVnffgd(final List<Vnffgd> value) {
        this._vnffgd = value;
        return this;
    }
    
    public NsdBuilder addAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog.Nsd>> augmentationType, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog.Nsd> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NsdBuilder removeAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog.Nsd>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Nsd build() {
        return new NsdImpl(this);
    }

    public static final class NsdImpl implements Nsd {

    	
    	
        @Override
        public java.lang.Class<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog.Nsd> getImplementedInterface() {
            return urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog.Nsd.class;
        }

        private final List<ConnectionPoint> _connectionPoint;
        @JsonProperty("constituent-vnfd")
        private final List<ConstituentVnfd> _constituentVnfd;
        @JsonProperty("description")
        private final java.lang.String _description;
        @JsonProperty("id")
        private final java.lang.String _id;        
        @JsonProperty("initial-config-primitive")
        private final List<InitialConfigPrimitive> _initialConfigPrimitive;
        private final List<InputParameterXpath> _inputParameterXpath;
        @JsonProperty("ip-profiles")
        private final List<IpProfiles> _ipProfiles;
        private final NsdKey _key;
        private final List<KeyPair> _keyPair;
        @JsonProperty("logo")
        private final java.lang.String _logo;
        private final List<MonitoringParam> _monitoringParam;
        private java.lang.String _name;
        private final List<ParameterPool> _parameterPool;
        @JsonProperty("placement-groups")
        private final List<PlacementGroups> _placementGroups;
        private final List<ScalingGroupDescriptor> _scalingGroupDescriptor;
        private final List<ServicePrimitive> _servicePrimitive;
        @JsonProperty("short-name")
        private final java.lang.String _shortName;
        private final List<User> _user;
        @JsonProperty("vendor")
        private final java.lang.String _vendor;
        @JsonProperty("version")
        private final java.lang.String _version;
        private List<Vld> _vld = new ArrayList<Vld>();        
        @JsonProperty("vnf-dependency")
        private final List<VnfDependency> _vnfDependency;
        private final List<Vnffgd> _vnffgd;

        private Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog.Nsd>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog.Nsd>> augmentation = Collections.emptyMap();

        
        private NsdImpl(NsdBuilder base) {
            if (base.getKey() == null) {
                this._key = new NsdKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this._key = base.getKey();
                this._id = _key.getId();
            }
            this._connectionPoint = base.getConnectionPoint();
            this._constituentVnfd = base.getConstituentVnfd();
            this._description = base.getDescription();
            this._initialConfigPrimitive = base.getInitialConfigPrimitive();
            this._inputParameterXpath = base.getInputParameterXpath();
            this._ipProfiles = base.getIpProfiles();
            this._keyPair = base.getKeyPair();
            this._logo = base.getLogo();
            this._monitoringParam = base.getMonitoringParam();
            this._name = base.getName();
            this._parameterPool = base.getParameterPool();
            this._placementGroups = base.getPlacementGroups();
            this._scalingGroupDescriptor = base.getScalingGroupDescriptor();
            this._servicePrimitive = base.getServicePrimitive();
            this._shortName = base.getShortName();
            this._user = base.getUser();
            this._vendor = base.getVendor();
            this._version = base.getVersion();
            this._vld = base.getVld();
            this._vnfDependency = base.getVnfDependency();
            this._vnffgd = base.getVnffgd();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog.Nsd>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog.Nsd>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog.Nsd>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog.Nsd>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }
        
        

    	
    	public NsdImpl(){
    		this( new NsdBuilder() );
    	}

        @Override
        public List<ConnectionPoint> getConnectionPoint() {
            return _connectionPoint;
        }
        
        @Override
        public List<ConstituentVnfd> getConstituentVnfd() {
            return _constituentVnfd;
        }
        
        @Override
        public java.lang.String getDescription() {
            return _description;
        }
        
        @Override
        public java.lang.String getId() {
            return _id;
        }
        
        @Override
        public List<InitialConfigPrimitive> getInitialConfigPrimitive() {
            return _initialConfigPrimitive;
        }
        
        @Override
        public List<InputParameterXpath> getInputParameterXpath() {
            return _inputParameterXpath;
        }
        
        @Override
        public List<IpProfiles> getIpProfiles() {
            return _ipProfiles;
        }
        
        @Override
        public NsdKey getKey() {
            return _key;
        }
        
        @Override
        public List<KeyPair> getKeyPair() {
            return _keyPair;
        }
        
        @Override
        public java.lang.String getLogo() {
            return _logo;
        }
        
        @Override
        public List<MonitoringParam> getMonitoringParam() {
            return _monitoringParam;
        }
        
        public void setName(String aName) {
            this._name = aName;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public List<ParameterPool> getParameterPool() {
            return _parameterPool;
        }
        
        @Override
        public List<PlacementGroups> getPlacementGroups() {
            return _placementGroups;
        }
        
        @Override
        public List<ScalingGroupDescriptor> getScalingGroupDescriptor() {
            return _scalingGroupDescriptor;
        }
        
        @Override
        public List<ServicePrimitive> getServicePrimitive() {
            return _servicePrimitive;
        }
        
        @Override
        public java.lang.String getShortName() {
            return _shortName;
        }
        
        @Override
        public List<User> getUser() {
            return _user;
        }
        
        @Override
        public java.lang.String getVendor() {
            return _vendor;
        }
        
        @Override
        public java.lang.String getVersion() {
            return _version;
        }
        
        @Override
        public List<Vld> getVld() {
            return _vld;
        }
        
        
        public void setVld( List<Vld> a  ) {
            this._vld = a;
        }
        
        @Override
        public List<VnfDependency> getVnfDependency() {
            return _vnfDependency;
        }
        
        @Override
        public List<Vnffgd> getVnffgd() {
            return _vnffgd;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog.Nsd>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_connectionPoint);
            result = prime * result + Objects.hashCode(_constituentVnfd);
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_initialConfigPrimitive);
            result = prime * result + Objects.hashCode(_inputParameterXpath);
            result = prime * result + Objects.hashCode(_ipProfiles);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_keyPair);
            result = prime * result + Objects.hashCode(_logo);
            result = prime * result + Objects.hashCode(_monitoringParam);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_parameterPool);
            result = prime * result + Objects.hashCode(_placementGroups);
            result = prime * result + Objects.hashCode(_scalingGroupDescriptor);
            result = prime * result + Objects.hashCode(_servicePrimitive);
            result = prime * result + Objects.hashCode(_shortName);
            result = prime * result + Objects.hashCode(_user);
            result = prime * result + Objects.hashCode(_vendor);
            result = prime * result + Objects.hashCode(_version);
            result = prime * result + Objects.hashCode(_vld);
            result = prime * result + Objects.hashCode(_vnfDependency);
            result = prime * result + Objects.hashCode(_vnffgd);
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
            if (!urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog.Nsd.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog.Nsd other = (urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog.Nsd)obj;
            if (!Objects.equals(_connectionPoint, other.getConnectionPoint())) {
                return false;
            }
            if (!Objects.equals(_constituentVnfd, other.getConstituentVnfd())) {
                return false;
            }
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_initialConfigPrimitive, other.getInitialConfigPrimitive())) {
                return false;
            }
            if (!Objects.equals(_inputParameterXpath, other.getInputParameterXpath())) {
                return false;
            }
            if (!Objects.equals(_ipProfiles, other.getIpProfiles())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_keyPair, other.getKeyPair())) {
                return false;
            }
            if (!Objects.equals(_logo, other.getLogo())) {
                return false;
            }
            if (!Objects.equals(_monitoringParam, other.getMonitoringParam())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_parameterPool, other.getParameterPool())) {
                return false;
            }
            if (!Objects.equals(_placementGroups, other.getPlacementGroups())) {
                return false;
            }
            if (!Objects.equals(_scalingGroupDescriptor, other.getScalingGroupDescriptor())) {
                return false;
            }
            if (!Objects.equals(_servicePrimitive, other.getServicePrimitive())) {
                return false;
            }
            if (!Objects.equals(_shortName, other.getShortName())) {
                return false;
            }
            if (!Objects.equals(_user, other.getUser())) {
                return false;
            }
            if (!Objects.equals(_vendor, other.getVendor())) {
                return false;
            }
            if (!Objects.equals(_version, other.getVersion())) {
                return false;
            }
            if (!Objects.equals(_vld, other.getVld())) {
                return false;
            }
            if (!Objects.equals(_vnfDependency, other.getVnfDependency())) {
                return false;
            }
            if (!Objects.equals(_vnffgd, other.getVnffgd())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NsdImpl otherImpl = (NsdImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog.Nsd>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog.Nsd>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Nsd [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_connectionPoint != null) {
                builder.append("_connectionPoint=");
                builder.append(_connectionPoint);
                builder.append(", ");
            }
            if (_constituentVnfd != null) {
                builder.append("_constituentVnfd=");
                builder.append(_constituentVnfd);
                builder.append(", ");
            }
            if (_description != null) {
                builder.append("_description=");
                builder.append(_description);
                builder.append(", ");
            }
            if (_id != null) {
                builder.append("_id=");
                builder.append(_id);
                builder.append(", ");
            }
            if (_initialConfigPrimitive != null) {
                builder.append("_initialConfigPrimitive=");
                builder.append(_initialConfigPrimitive);
                builder.append(", ");
            }
            if (_inputParameterXpath != null) {
                builder.append("_inputParameterXpath=");
                builder.append(_inputParameterXpath);
                builder.append(", ");
            }
            if (_ipProfiles != null) {
                builder.append("_ipProfiles=");
                builder.append(_ipProfiles);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_keyPair != null) {
                builder.append("_keyPair=");
                builder.append(_keyPair);
                builder.append(", ");
            }
            if (_logo != null) {
                builder.append("_logo=");
                builder.append(_logo);
                builder.append(", ");
            }
            if (_monitoringParam != null) {
                builder.append("_monitoringParam=");
                builder.append(_monitoringParam);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_parameterPool != null) {
                builder.append("_parameterPool=");
                builder.append(_parameterPool);
                builder.append(", ");
            }
            if (_placementGroups != null) {
                builder.append("_placementGroups=");
                builder.append(_placementGroups);
                builder.append(", ");
            }
            if (_scalingGroupDescriptor != null) {
                builder.append("_scalingGroupDescriptor=");
                builder.append(_scalingGroupDescriptor);
                builder.append(", ");
            }
            if (_servicePrimitive != null) {
                builder.append("_servicePrimitive=");
                builder.append(_servicePrimitive);
                builder.append(", ");
            }
            if (_shortName != null) {
                builder.append("_shortName=");
                builder.append(_shortName);
                builder.append(", ");
            }
            if (_user != null) {
                builder.append("_user=");
                builder.append(_user);
                builder.append(", ");
            }
            if (_vendor != null) {
                builder.append("_vendor=");
                builder.append(_vendor);
                builder.append(", ");
            }
            if (_version != null) {
                builder.append("_version=");
                builder.append(_version);
                builder.append(", ");
            }
            if (_vld != null) {
                builder.append("_vld=");
                builder.append(_vld);
                builder.append(", ");
            }
            if (_vnfDependency != null) {
                builder.append("_vnfDependency=");
                builder.append(_vnfDependency);
                builder.append(", ");
            }
            if (_vnffgd != null) {
                builder.append("_vnffgd=");
                builder.append(_vnffgd);
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
