package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.nfvi.metrics;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.NfviMetrics;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container storage {
 *     leaf label {
 *         type label;
 *     }
 *     leaf used {
 *         type uint64;
 *     }
 *     leaf total {
 *         type uint64;
 *     }
 *     leaf utilization {
 *         type decimal64;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/nfvi-metrics/storage</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.nfvi.metrics.StorageBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.nfvi.metrics.StorageBuilder
 *
 */
public interface Storage
    extends
    ChildOf<NfviMetrics>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.nfvi.metrics.Storage>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "storage").intern();

    /**
     * Label to show in UI
     *
     *
     *
     * @return <code>java.lang.String</code> <code>label</code>, or <code>null</code> if not present
     */
    java.lang.String getLabel();
    
    /**
     * The amount of storage (bytes) currently in use.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>used</code>, or <code>null</code> if not present
     */
    BigInteger getUsed();
    
    /**
     * The amount of storage (bytes) available.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>total</code>, or <code>null</code> if not present
     */
    BigInteger getTotal();
    
    /**
     * The storage utilization (percentage).
     *
     *
     *
     * @return <code>java.math.BigDecimal</code> <code>utilization</code>, or <code>null</code> if not present
     */
    BigDecimal getUtilization();

}

