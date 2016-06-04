// Generated on Sun Jun 05 00:22:21 EEST 2016
// DTD/Schema  :    null

package com.intellij.idea.plugin.hybris.type.system.file.dom.model;

import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.Required;
import org.jetbrains.annotations.NotNull;

/**
 * null:maptypeType interface.
 * <pre>
 * <h3>Type null:maptypeType documentation</h3>
 * Like the java collection framework, a type, which defines map objects. Attention: When used as type for an attribute, the attribute will not be searchable and the access performance is not effective. Consider to use a relation.
 * </pre>
 */
public interface Maptype extends DomElement {

    /**
     * Returns the value of the code child.
     * <pre>
     * <h3>Attribute null:code documentation</h3>
     * The unique code of the map.
     * </pre>
     *
     * @return the value of the code child.
     */
    @NotNull
    @com.intellij.util.xml.Attribute("code")
    @Required
    GenericAttributeValue<String> getCode();


    /**
     * Returns the value of the argumenttype child.
     * <pre>
     * <h3>Attribute null:argumenttype documentation</h3>
     * The type of the key attributes.
     * </pre>
     *
     * @return the value of the argumenttype child.
     */
    @NotNull
    @com.intellij.util.xml.Attribute("argumenttype")
    @Required
    GenericAttributeValue<String> getArgumenttype();


    /**
     * Returns the value of the returntype child.
     * <pre>
     * <h3>Attribute null:returntype documentation</h3>
     * The type of the value attributes.
     * </pre>
     *
     * @return the value of the returntype child.
     */
    @NotNull
    @com.intellij.util.xml.Attribute("returntype")
    @Required
    GenericAttributeValue<String> getReturntype();


    /**
     * Returns the value of the autocreate child.
     * <pre>
     * <h3>Attribute null:autocreate documentation</h3>
     * If 'true', the item will be created during initialization. Default is 'true'.
     * </pre>
     *
     * @return the value of the autocreate child.
     */
    @NotNull
    @com.intellij.util.xml.Attribute("autocreate")
    GenericAttributeValue<Boolean> getAutocreate();


    /**
     * Returns the value of the generate child.
     * <pre>
     * <h3>Attribute null:generate documentation</h3>
     * Deprecated. Has no effect for map types. Default is 'true'.
     * </pre>
     *
     * @return the value of the generate child.
     */
    @NotNull
    @com.intellij.util.xml.Attribute("generate")
    GenericAttributeValue<Boolean> getGenerate();


    /**
     * Returns the value of the redeclare child.
     * <pre>
     * <h3>Attribute null:redeclare documentation</h3>
     * Deprecated. Has no effect for map types. Default is 'false'.
     * </pre>
     *
     * @return the value of the redeclare child.
     */
    @NotNull
    @com.intellij.util.xml.Attribute("redeclare")
    GenericAttributeValue<Boolean> getRedeclare();


}
