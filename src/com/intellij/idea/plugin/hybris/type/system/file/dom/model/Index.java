// Generated on Sun Jun 05 00:22:21 EEST 2016
// DTD/Schema  :    null

package com.intellij.idea.plugin.hybris.type.system.file.dom.model;

import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.Required;
import com.intellij.util.xml.SubTag;
import org.jetbrains.annotations.NotNull;

/**
 * null:indexType interface.
 * <pre>
 * <h3>Type null:indexType documentation</h3>
 * Configures a database index for enclosing type.
 * </pre>
 */
public interface Index extends DomElement {

    /**
     * Returns the value of the name child.
     * <pre>
     * <h3>Attribute null:name documentation</h3>
     * The name prefix of the index.
     * </pre>
     *
     * @return the value of the name child.
     */
    @NotNull
    @com.intellij.util.xml.Attribute("name")
    @Required
    GenericAttributeValue<String> getName();


    /**
     * Returns the value of the remove child.
     * <pre>
     * <h3>Attribute null:remove documentation</h3>
     * If 'true' this index will be ommitted while in initialization process even if there were precendent declarations.This attribute has effect only if replace = true.
     * </pre>
     *
     * @return the value of the remove child.
     */
    @NotNull
    @com.intellij.util.xml.Attribute("remove")
    GenericAttributeValue<Boolean> getRemove();


    /**
     * Returns the value of the replace child.
     * <pre>
     * <h3>Attribute null:replace documentation</h3>
     * If 'true' this index is a replacement/redeclaration for already existing index.
     * </pre>
     *
     * @return the value of the replace child.
     */
    @NotNull
    @com.intellij.util.xml.Attribute("replace")
    GenericAttributeValue<Boolean> getReplace();


    /**
     * Returns the value of the unique child.
     * <pre>
     * <h3>Attribute null:unique documentation</h3>
     * If 'true', the value of this attribute has to be unique within all instances of this index. Attributes with persistence type set to 'jalo' can not be unique. Default is 'false'.
     * </pre>
     *
     * @return the value of the unique child.
     */
    @NotNull
    @com.intellij.util.xml.Attribute("unique")
    GenericAttributeValue<Boolean> getUnique();


    /**
     * Returns the value of the creationmode child.
     * <pre>
     * <h3>Attribute null:creationmode documentation</h3>
     * Determines index creation mode.
     * </pre>
     *
     * @return the value of the creationmode child.
     */
    @NotNull
    @com.intellij.util.xml.Attribute("creationmode")
    GenericAttributeValue<com.intellij.idea.plugin.hybris.type.system.file.dom.model.Creationmode> getCreationmode();


    /**
     * Returns the list of key children.
     * <pre>
     * <h3>Element null:key documentation</h3>
     * Configures a single index key.
     * </pre>
     *
     * @return the list of key children.
     */
    @NotNull
    @SubTag("key")
    java.util.List<com.intellij.idea.plugin.hybris.type.system.file.dom.model.IndexKey> getKeys();

    /**
     * Adds new child to the list of key children.
     *
     * @return created child
     */
    @SubTag("key")
    com.intellij.idea.plugin.hybris.type.system.file.dom.model.IndexKey addKey();


}
