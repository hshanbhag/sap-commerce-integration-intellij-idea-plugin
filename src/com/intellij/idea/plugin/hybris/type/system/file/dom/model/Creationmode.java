// Generated on Sun Jun 05 00:22:21 EEST 2016
// DTD/Schema  :    null

package com.intellij.idea.plugin.hybris.type.system.file.dom.model;

/**
 * null:creationmodeAttrType enumeration.
 */
public enum Creationmode implements com.intellij.util.xml.NamedEnum {
    ALL("all"),
    FORCE("force"),
    HSQLDB("hsqldb"),
    MYSQL("mysql"),
    ORACLE("oracle"),
    SAP("sap"),
    SQLSERVER("sqlserver");

    private final java.lang.String value;

    private Creationmode(java.lang.String value) {
        this.value = value;
    }

    public java.lang.String getValue() {
        return value;
    }

}
