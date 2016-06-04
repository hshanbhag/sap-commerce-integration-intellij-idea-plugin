// Generated on Sun Jun 05 00:22:21 EEST 2016
// DTD/Schema  :    null

package com.intellij.idea.plugin.hybris.type.system.file.dom.model;

import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.SubTag;
import org.jetbrains.annotations.NotNull;

/**
 * null:atomictypesType interface.
 * <pre>
 * <h3>Type null:atomictypesType documentation</h3>
 * Defines a list of atomic types.
 * </pre>
 */
public interface Atomictypes extends DomElement {

    /**
     * Returns the list of atomicType children.
     * <pre>
     * <h3>Element null:atomicType documentation</h3>
     * An AtomicType represents a simple java object. (The name 'atomic' just means 'non-composed' objects.)
     * </pre>
     *
     * @return the list of atomicType children.
     */
    @NotNull
    @SubTag("atomicType")
    java.util.List<com.intellij.idea.plugin.hybris.type.system.file.dom.model.Atomictype> getAtomicTypes();

    /**
     * Adds new child to the list of atomicType children.
     *
     * @return created child
     */
    @SubTag("atomicType")
    com.intellij.idea.plugin.hybris.type.system.file.dom.model.Atomictype addAtomicType();


}
