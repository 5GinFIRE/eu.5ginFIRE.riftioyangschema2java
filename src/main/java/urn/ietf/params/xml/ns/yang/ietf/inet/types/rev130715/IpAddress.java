package urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715;
import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize
public class IpAddress
 implements Serializable {
    private static final long serialVersionUID = 3033840439936785623L;
    private Ipv4Address _ipv4Address;
    private Ipv6Address _ipv6Address;
    private char[] _value;


    public IpAddress(Ipv4Address _ipv4Address) {
        super();
        this._ipv4Address = _ipv4Address;
        this._ipv6Address = null;
    }
    
    public IpAddress(Ipv6Address _ipv6Address) {
        super();
        this._ipv6Address = _ipv6Address;
        this._ipv4Address = null;
    }
    
    public IpAddress() {

    }
    
    public IpAddress(String ip) {

    	this._ipv4Address = new Ipv4Address(ip);
    }
    /**
     * Constructor provided only for using in JMX. Don't use it for
     * construction new object of this union type.
     */
    @ConstructorProperties("value")
    public IpAddress(char[] _value) {
        java.lang.String defVal = new java.lang.String(_value);
        IpAddress defInst = IpAddressBuilder.getDefaultInstance(defVal);
        this._ipv4Address = defInst._ipv4Address;
        this._ipv6Address = defInst._ipv6Address;
        this._value = _value == null ? null : _value.clone();
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public IpAddress(IpAddress source) {
        this._ipv4Address = source._ipv4Address;
        this._ipv6Address = source._ipv6Address;
        this._value = source._value;
    }


    public Ipv4Address getIpv4Address() {
        return _ipv4Address;
    }
    
    public Ipv6Address getIpv6Address() {
        return _ipv6Address;
    }
    
    public char[] getValue() {
        if (_value == null) {
            if (_ipv4Address != null) {
                _value = _ipv4Address.getValue().toString().toCharArray();
            } else
            if (_ipv6Address != null) {
                _value = _ipv6Address.getValue().toString().toCharArray();
            }
        }
        return _value == null ? null : _value.clone();
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_ipv4Address);
        result = prime * result + Objects.hashCode(_ipv6Address);
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        IpAddress other = (IpAddress) obj;
        if (!Objects.equals(_ipv4Address, other._ipv4Address)) {
            return false;
        }
        if (!Objects.equals(_ipv6Address, other._ipv6Address)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_ipv4Address != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_ipv4Address=");
            builder.append(_ipv4Address);
        }
        if (_ipv6Address != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_ipv6Address=");
            builder.append(_ipv6Address);
        }
        return builder.append(']').toString();
    }
}

