package urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VirtualInterface;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.Vdu;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterfaceBuilder.ExternalInterfaceImpl;

/**
 * List of external interfaces for the VNF. The external interfaces enable sending 
 * traffic to and from VNF.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>vnfd</b>
 * <pre>
 * list external-interface {
 *     key "name"
 *     leaf name {
 *         type string;
 *     }
 *     leaf vnfd-connection-point-ref {
 *         type leafref;
 *     }
 *     container virtual-interface {
 *         leaf type {
 *             type type;
 *         }
 *         leaf vpci {
 *             type string;
 *         }
 *         leaf bandwidth {
 *             type uint64;
 *         }
 *     }
 *     uses virtual-interface;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vnfd/vnfd-descriptor/vdu/external-interface</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterfaceBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterfaceBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterfaceKey
 *
 */
@JsonDeserialize(as = ExternalInterfaceImpl.class)
public interface ExternalInterface
    extends
    ChildOf<Vdu>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterface>,
    VirtualInterface,
    Identifiable<ExternalInterfaceKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfd",
        "2015-09-10", "external-interface").intern();

    /**
     * Name of the external interface. Note that this name has only local significance 
     * to the VDU.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Name of the external connection point.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfdConnectionPointRef</code>, or <code>null</code> if not present
     */
    java.lang.String getVnfdConnectionPointRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterfaceKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ExternalInterfaceKey getKey();

}

