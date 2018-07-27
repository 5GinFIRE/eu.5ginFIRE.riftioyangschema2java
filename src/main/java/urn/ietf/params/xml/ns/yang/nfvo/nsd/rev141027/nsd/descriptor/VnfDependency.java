package urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog.NsdBuilder.NsdImpl;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependencyBuilder.VnfDependencyImpl;

/**
 * List of VNF dependencies.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list vnf-dependency {
 *     key "vnf-source-ref"
 *     leaf vnf-source-ref {
 *         type leafref;
 *     }
 *     leaf vnf-depends-on-ref {
 *         type leafref;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>nsd/nsd-descriptor/vnf-dependency</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependencyBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependencyBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependencyKey
 *
 */
@JsonDeserialize(as = VnfDependencyImpl.class)
public interface VnfDependency
    extends
    ChildOf<NsdDescriptor>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependency>,
    Identifiable<VnfDependencyKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsd",
        "2014-10-27", "vnf-dependency").intern();

    /**
     * @return <code>java.lang.String</code> <code>vnfSourceRef</code>, or <code>null</code> if not present
     */
    java.lang.String getVnfSourceRef();
    
    /**
     * Reference to VNF on which the source VNF depends.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfDependsOnRef</code>, or <code>null</code> if not present
     */
    java.lang.String getVnfDependsOnRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependencyKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VnfDependencyKey getKey();

}

