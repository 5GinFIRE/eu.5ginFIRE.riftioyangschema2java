package urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor;
import java.math.BigInteger;
import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.GuestEpa;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.HostEpa;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.HypervisorEpa;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ImageProperties;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.SupplementalBootData;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.VmFlavor;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.VswitchEpa;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VnfdDescriptor;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.VduBuilder.VduImpl;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.Alarm;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.CloudInitInput;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterface;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.InternalConnectionPoint;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.InternalInterface;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.Volumes;

/**
 * List of Virtual Deployment Units
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>vnfd</b>
 * <pre>
 * list vdu {
 *     key "id"
 *     leaf id {
 *         type string;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     leaf description {
 *         type string;
 *     }
 *     leaf count {
 *         type uint64;
 *     }
 *     leaf mgmt-vpci {
 *         type string;
 *     }
 *     container vm-flavor {
 *         leaf vcpu-count {
 *             type uint16;
 *         }
 *         leaf memory-mb {
 *             type uint64;
 *         }
 *         leaf storage-gb {
 *             type uint64;
 *         }
 *     }
 *     container guest-epa {
 *         leaf trusted-execution {
 *             type boolean;
 *         }
 *         leaf mempage-size {
 *             type enumeration;
 *         }
 *         leaf cpu-pinning-policy {
 *             type cpu-pinning-policy;
 *         }
 *         leaf cpu-thread-pinning-policy {
 *             type enumeration;
 *         }
 *         list pcie-device {
 *             key "device-id"
 *             leaf device-id {
 *                 type string;
 *             }
 *             leaf count {
 *                 type uint64;
 *             }
 *         }
 *         choice numa-policy {
 *             case numa-aware {
 *                 container numa-node-policy {
 *                     leaf node-cnt {
 *                         type uint16;
 *                     }
 *                     leaf mem-policy {
 *                         type enumeration;
 *                     }
 *                     list node {
 *                         key "id"
 *                         leaf id {
 *                             type uint64;
 *                         }
 *                         list vcpu {
 *                             key "id"
 *                             leaf id {
 *                                 type uint64;
 *                             }
 *                         }
 *                         leaf memory-mb {
 *                             type uint64;
 *                         }
 *                         choice om-numa-type {
 *                             case cores {
 *                                 leaf num-cores {
 *                                     type uint8;
 *                                 }
 *                             }
 *                             case paired-threads {
 *                                 container paired-threads {
 *                                     leaf num-paired-threads {
 *                                         type uint8;
 *                                     }
 *                                     list paired-thread-ids {
 *                                         key "thread-a"
 *                                         leaf thread-a {
 *                                             type uint8;
 *                                         }
 *                                         leaf thread-b {
 *                                             type uint8;
 *                                         }
 *                                     }
 *                                 }
 *                             }
 *                             case threads {
 *                                 leaf num-threads {
 *                                     type uint8;
 *                                 }
 *                             }
 *                         }
 *                     }
 *                 }
 *             }
 *             case numa-unaware {
 *                 leaf numa-unaware {
 *                     type empty;
 *                 }
 *             }
 *         }
 *     }
 *     container vswitch-epa {
 *         leaf ovs-acceleration {
 *             type enumeration;
 *         }
 *         leaf ovs-offload {
 *             type enumeration;
 *         }
 *     }
 *     container hypervisor-epa {
 *         leaf type {
 *             type enumeration;
 *         }
 *         leaf version {
 *             type string;
 *         }
 *     }
 *     container host-epa {
 *         leaf cpu-model {
 *             type enumeration;
 *         }
 *         leaf cpu-arch {
 *             type enumeration;
 *         }
 *         leaf cpu-vendor {
 *             type enumeration;
 *         }
 *         leaf cpu-socket-count {
 *             type uint64;
 *         }
 *         leaf cpu-core-count {
 *             type uint64;
 *         }
 *         leaf cpu-core-thread-count {
 *             type uint64;
 *         }
 *         list cpu-feature {
 *             key "feature"
 *             leaf feature {
 *                 type cpu-feature-type;
 *             }
 *         }
 *         leaf om-cpu-model-string {
 *             type string;
 *         }
 *         list om-cpu-feature {
 *             key "feature"
 *             leaf feature {
 *                 type string;
 *             }
 *         }
 *     }
 *     list alarm {
 *         key "alarm-id"
 *         leaf alarm-id {
 *             type string;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         leaf description {
 *             type string;
 *         }
 *         leaf vdur-id {
 *             type string;
 *         }
 *         container actions {
 *             list ok {
 *                 key "url"
 *                 leaf url {
 *                     type string;
 *                 }
 *             }
 *             list insufficient-data {
 *                 key "url"
 *                 leaf url {
 *                     type string;
 *                 }
 *             }
 *             list alarm {
 *                 key "url"
 *                 leaf url {
 *                     type string;
 *                 }
 *             }
 *         }
 *         leaf repeat {
 *             type repeat;
 *         }
 *         leaf enabled {
 *             type enabled;
 *         }
 *         leaf severity {
 *             type alarm-severity-type;
 *         }
 *         leaf metric {
 *             type alarm-metric-type;
 *         }
 *         leaf statistic {
 *             type alarm-statistic-type;
 *         }
 *         leaf operation {
 *             type alarm-operation-type;
 *         }
 *         leaf value {
 *             type decimal64;
 *         }
 *         leaf period {
 *             type uint32;
 *         }
 *         leaf evaluations {
 *             type uint32;
 *         }
 *         uses alarm;
 *     }
 *     leaf image {
 *         type string;
 *     }
 *     leaf image-checksum {
 *         type string;
 *     }
 *     choice cloud-init-input {
 *         case filename {
 *             leaf cloud-init-file {
 *                 type string;
 *             }
 *         }
 *         case inline {
 *             leaf cloud-init {
 *                 type string;
 *             }
 *         }
 *     }
 *     container supplemental-boot-data {
 *         leaf boot-data-drive {
 *             type boot-data-drive;
 *         }
 *         list config-file {
 *             key "source"
 *             leaf source {
 *                 type string;
 *             }
 *             leaf dest {
 *                 type string;
 *             }
 *         }
 *         uses config-file;
 *     }
 *     list internal-connection-point {
 *         key "id"
 *         leaf name {
 *             type string;
 *         }
 *         leaf id {
 *             type string;
 *         }
 *         leaf short-name {
 *             type string;
 *         }
 *         leaf type {
 *             type connection-point-type;
 *         }
 *         leaf port-security-enabled {
 *             type boolean;
 *         }
 *         uses common-connection-point;
 *     }
 *     list internal-interface {
 *         key "name"
 *         leaf name {
 *             type string;
 *         }
 *         leaf vdu-internal-connection-point-ref {
 *             type leafref;
 *         }
 *         container virtual-interface {
 *             leaf type {
 *                 type type;
 *             }
 *             leaf vpci {
 *                 type string;
 *             }
 *             leaf bandwidth {
 *                 type uint64;
 *             }
 *         }
 *         uses virtual-interface;
 *     }
 *     list external-interface {
 *         key "name"
 *         leaf name {
 *             type string;
 *         }
 *         leaf vnfd-connection-point-ref {
 *             type leafref;
 *         }
 *         container virtual-interface {
 *             leaf type {
 *                 type type;
 *             }
 *             leaf vpci {
 *                 type string;
 *             }
 *             leaf bandwidth {
 *                 type uint64;
 *             }
 *         }
 *         uses virtual-interface;
 *     }
 *     list volumes {
 *         key "name"
 *         leaf name {
 *             type string;
 *         }
 *         leaf description {
 *             type string;
 *         }
 *         leaf size {
 *             type uint64;
 *         }
 *         choice volume-source {
 *             case ephemeral {
 *                 leaf ephemeral {
 *                     type empty;
 *                 }
 *             }
 *             case image {
 *                 leaf image {
 *                     type string;
 *                 }
 *                 leaf image-checksum {
 *                     type string;
 *                 }
 *             }
 *         }
 *         leaf device-bus {
 *             type enumeration;
 *         }
 *         leaf device-type {
 *             type enumeration;
 *         }
 *         uses volume-info;
 *     }
 *     uses guest-epa;
 *     uses hypervisor-epa;
 *     uses vm-flavor;
 *     uses vswitch-epa;
 *     uses image-properties;
 *     uses host-epa;
 *     uses supplemental-boot-data;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vnfd/vnfd-descriptor/vdu</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.VduBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.VduBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.VduKey
 *
 */
@JsonDeserialize(as = VduImpl.class)
@JsonIgnoreProperties( {"interface"} )
public interface Vdu
    extends
    ChildOf<VnfdDescriptor>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.Vdu>,
    GuestEpa,
    HypervisorEpa,
    VmFlavor,
    VswitchEpa,
    ImageProperties,
    HostEpa,
    SupplementalBootData,
    Identifiable<VduKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfd",
        "2015-09-10", "vdu").intern();

    /**
     * Unique id for the VDU
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    java.lang.String getId();
    
    /**
     * Unique name for the VDU
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Description of the VDU.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    java.lang.String getDescription();
    
    /**
     * Number of instances of VDU
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>count</code>, or <code>null</code> if not present
     */
    BigInteger getCount();
    
    /**
     * Specifies the virtual PCI address. Expressed in the following format 
     * dddd:dd:dd.d. For example 0000:00:12.0. This information can be used to pass as 
     * metadata during the VM creation.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>mgmtVpci</code>, or <code>null</code> if not present
     */
    java.lang.String getMgmtVpci();
    
    /**
     * @return <code>java.util.List</code> <code>alarm</code>, or <code>null</code> if not present
     */
    List<Alarm> getAlarm();
    
    /**
     * Indicates how the contents of cloud-init script are provided. There are 2 
     * choices - inline or in a file
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.CloudInitInput</code> <code>cloudInitInput</code>, or <code>null</code> if not present
     */
    CloudInitInput getCloudInitInput();
    
    /**
     * List for internal connection points. Each VNFC has zero or more internal 
     * connection points. Internal connection points are used for connecting the VNF 
     * with components internal to the VNF. If a VNF has only one VNFC, it may not have
     * any internal connection points.
     *
     *
     *
     * @return <code>java.util.List</code> <code>internalConnectionPoint</code>, or <code>null</code> if not present
     */
    List<InternalConnectionPoint> getInternalConnectionPoint();
    
    /**
     * List of internal interfaces for the VNF
     *
     *
     *
     * @return <code>java.util.List</code> <code>internalInterface</code>, or <code>null</code> if not present
     */
    List<InternalInterface> getInternalInterface();
    
    /**
     * List of external interfaces for the VNF. The external interfaces enable sending 
     * traffic to and from VNF.
     *
     *
     *
     * @return <code>java.util.List</code> <code>externalInterface</code>, or <code>null</code> if not present
     */
    List<ExternalInterface> getExternalInterface();
    
    /**
     * @return <code>java.util.List</code> <code>volumes</code>, or <code>null</code> if not present
     */
    List<Volumes> getVolumes();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.VduKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VduKey getKey();

}

