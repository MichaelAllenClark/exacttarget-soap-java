/*
 * XML Type:  ListAttribute
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ListAttribute
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML ListAttribute(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface ListAttribute extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ListAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("listattribute0b2atype");
    
    /**
     * Gets the "List" element
     */
    com.exacttarget.wsdl.partnerapi.List getList();
    
    /**
     * True if has "List" element
     */
    boolean isSetList();
    
    /**
     * Sets the "List" element
     */
    void setList(com.exacttarget.wsdl.partnerapi.List list);
    
    /**
     * Appends and returns a new empty "List" element
     */
    com.exacttarget.wsdl.partnerapi.List addNewList();
    
    /**
     * Unsets the "List" element
     */
    void unsetList();
    
    /**
     * Gets the "Name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "Name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "Name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "Name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "Name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "Name" element
     */
    void unsetName();
    
    /**
     * Gets the "Description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "Description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * True if has "Description" element
     */
    boolean isSetDescription();
    
    /**
     * Sets the "Description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "Description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Unsets the "Description" element
     */
    void unsetDescription();
    
    /**
     * Gets the "FieldType" element
     */
    com.exacttarget.wsdl.partnerapi.ListAttributeFieldType.Enum getFieldType();
    
    /**
     * Gets (as xml) the "FieldType" element
     */
    com.exacttarget.wsdl.partnerapi.ListAttributeFieldType xgetFieldType();
    
    /**
     * True if has "FieldType" element
     */
    boolean isSetFieldType();
    
    /**
     * Sets the "FieldType" element
     */
    void setFieldType(com.exacttarget.wsdl.partnerapi.ListAttributeFieldType.Enum fieldType);
    
    /**
     * Sets (as xml) the "FieldType" element
     */
    void xsetFieldType(com.exacttarget.wsdl.partnerapi.ListAttributeFieldType fieldType);
    
    /**
     * Unsets the "FieldType" element
     */
    void unsetFieldType();
    
    /**
     * Gets the "FieldLength" element
     */
    int getFieldLength();
    
    /**
     * Gets (as xml) the "FieldLength" element
     */
    org.apache.xmlbeans.XmlInt xgetFieldLength();
    
    /**
     * True if has "FieldLength" element
     */
    boolean isSetFieldLength();
    
    /**
     * Sets the "FieldLength" element
     */
    void setFieldLength(int fieldLength);
    
    /**
     * Sets (as xml) the "FieldLength" element
     */
    void xsetFieldLength(org.apache.xmlbeans.XmlInt fieldLength);
    
    /**
     * Unsets the "FieldLength" element
     */
    void unsetFieldLength();
    
    /**
     * Gets the "Scale" element
     */
    int getScale();
    
    /**
     * Gets (as xml) the "Scale" element
     */
    org.apache.xmlbeans.XmlInt xgetScale();
    
    /**
     * True if has "Scale" element
     */
    boolean isSetScale();
    
    /**
     * Sets the "Scale" element
     */
    void setScale(int scale);
    
    /**
     * Sets (as xml) the "Scale" element
     */
    void xsetScale(org.apache.xmlbeans.XmlInt scale);
    
    /**
     * Unsets the "Scale" element
     */
    void unsetScale();
    
    /**
     * Gets the "MinValue" element
     */
    java.lang.String getMinValue();
    
    /**
     * Gets (as xml) the "MinValue" element
     */
    org.apache.xmlbeans.XmlString xgetMinValue();
    
    /**
     * True if has "MinValue" element
     */
    boolean isSetMinValue();
    
    /**
     * Sets the "MinValue" element
     */
    void setMinValue(java.lang.String minValue);
    
    /**
     * Sets (as xml) the "MinValue" element
     */
    void xsetMinValue(org.apache.xmlbeans.XmlString minValue);
    
    /**
     * Unsets the "MinValue" element
     */
    void unsetMinValue();
    
    /**
     * Gets the "MaxValue" element
     */
    java.lang.String getMaxValue();
    
    /**
     * Gets (as xml) the "MaxValue" element
     */
    org.apache.xmlbeans.XmlString xgetMaxValue();
    
    /**
     * True if has "MaxValue" element
     */
    boolean isSetMaxValue();
    
    /**
     * Sets the "MaxValue" element
     */
    void setMaxValue(java.lang.String maxValue);
    
    /**
     * Sets (as xml) the "MaxValue" element
     */
    void xsetMaxValue(org.apache.xmlbeans.XmlString maxValue);
    
    /**
     * Unsets the "MaxValue" element
     */
    void unsetMaxValue();
    
    /**
     * Gets the "DefaultValue" element
     */
    java.lang.String getDefaultValue();
    
    /**
     * Gets (as xml) the "DefaultValue" element
     */
    org.apache.xmlbeans.XmlString xgetDefaultValue();
    
    /**
     * True if has "DefaultValue" element
     */
    boolean isSetDefaultValue();
    
    /**
     * Sets the "DefaultValue" element
     */
    void setDefaultValue(java.lang.String defaultValue);
    
    /**
     * Sets (as xml) the "DefaultValue" element
     */
    void xsetDefaultValue(org.apache.xmlbeans.XmlString defaultValue);
    
    /**
     * Unsets the "DefaultValue" element
     */
    void unsetDefaultValue();
    
    /**
     * Gets the "IsNullable" element
     */
    boolean getIsNullable();
    
    /**
     * Gets (as xml) the "IsNullable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsNullable();
    
    /**
     * True if has "IsNullable" element
     */
    boolean isSetIsNullable();
    
    /**
     * Sets the "IsNullable" element
     */
    void setIsNullable(boolean isNullable);
    
    /**
     * Sets (as xml) the "IsNullable" element
     */
    void xsetIsNullable(org.apache.xmlbeans.XmlBoolean isNullable);
    
    /**
     * Unsets the "IsNullable" element
     */
    void unsetIsNullable();
    
    /**
     * Gets the "IsHidden" element
     */
    boolean getIsHidden();
    
    /**
     * Gets (as xml) the "IsHidden" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsHidden();
    
    /**
     * True if has "IsHidden" element
     */
    boolean isSetIsHidden();
    
    /**
     * Sets the "IsHidden" element
     */
    void setIsHidden(boolean isHidden);
    
    /**
     * Sets (as xml) the "IsHidden" element
     */
    void xsetIsHidden(org.apache.xmlbeans.XmlBoolean isHidden);
    
    /**
     * Unsets the "IsHidden" element
     */
    void unsetIsHidden();
    
    /**
     * Gets the "IsReadOnly" element
     */
    boolean getIsReadOnly();
    
    /**
     * Gets (as xml) the "IsReadOnly" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsReadOnly();
    
    /**
     * True if has "IsReadOnly" element
     */
    boolean isSetIsReadOnly();
    
    /**
     * Sets the "IsReadOnly" element
     */
    void setIsReadOnly(boolean isReadOnly);
    
    /**
     * Sets (as xml) the "IsReadOnly" element
     */
    void xsetIsReadOnly(org.apache.xmlbeans.XmlBoolean isReadOnly);
    
    /**
     * Unsets the "IsReadOnly" element
     */
    void unsetIsReadOnly();
    
    /**
     * Gets the "Inheritable" element
     */
    boolean getInheritable();
    
    /**
     * Gets (as xml) the "Inheritable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetInheritable();
    
    /**
     * True if has "Inheritable" element
     */
    boolean isSetInheritable();
    
    /**
     * Sets the "Inheritable" element
     */
    void setInheritable(boolean inheritable);
    
    /**
     * Sets (as xml) the "Inheritable" element
     */
    void xsetInheritable(org.apache.xmlbeans.XmlBoolean inheritable);
    
    /**
     * Unsets the "Inheritable" element
     */
    void unsetInheritable();
    
    /**
     * Gets the "Overridable" element
     */
    boolean getOverridable();
    
    /**
     * Gets (as xml) the "Overridable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetOverridable();
    
    /**
     * True if has "Overridable" element
     */
    boolean isSetOverridable();
    
    /**
     * Sets the "Overridable" element
     */
    void setOverridable(boolean overridable);
    
    /**
     * Sets (as xml) the "Overridable" element
     */
    void xsetOverridable(org.apache.xmlbeans.XmlBoolean overridable);
    
    /**
     * Unsets the "Overridable" element
     */
    void unsetOverridable();
    
    /**
     * Gets the "MustOverride" element
     */
    boolean getMustOverride();
    
    /**
     * Gets (as xml) the "MustOverride" element
     */
    org.apache.xmlbeans.XmlBoolean xgetMustOverride();
    
    /**
     * True if has "MustOverride" element
     */
    boolean isSetMustOverride();
    
    /**
     * Sets the "MustOverride" element
     */
    void setMustOverride(boolean mustOverride);
    
    /**
     * Sets (as xml) the "MustOverride" element
     */
    void xsetMustOverride(org.apache.xmlbeans.XmlBoolean mustOverride);
    
    /**
     * Unsets the "MustOverride" element
     */
    void unsetMustOverride();
    
    /**
     * Gets the "OverrideType" element
     */
    com.exacttarget.wsdl.partnerapi.OverrideType.Enum getOverrideType();
    
    /**
     * Gets (as xml) the "OverrideType" element
     */
    com.exacttarget.wsdl.partnerapi.OverrideType xgetOverrideType();
    
    /**
     * True if has "OverrideType" element
     */
    boolean isSetOverrideType();
    
    /**
     * Sets the "OverrideType" element
     */
    void setOverrideType(com.exacttarget.wsdl.partnerapi.OverrideType.Enum overrideType);
    
    /**
     * Sets (as xml) the "OverrideType" element
     */
    void xsetOverrideType(com.exacttarget.wsdl.partnerapi.OverrideType overrideType);
    
    /**
     * Unsets the "OverrideType" element
     */
    void unsetOverrideType();
    
    /**
     * Gets the "Ordinal" element
     */
    int getOrdinal();
    
    /**
     * Gets (as xml) the "Ordinal" element
     */
    org.apache.xmlbeans.XmlInt xgetOrdinal();
    
    /**
     * True if has "Ordinal" element
     */
    boolean isSetOrdinal();
    
    /**
     * Sets the "Ordinal" element
     */
    void setOrdinal(int ordinal);
    
    /**
     * Sets (as xml) the "Ordinal" element
     */
    void xsetOrdinal(org.apache.xmlbeans.XmlInt ordinal);
    
    /**
     * Unsets the "Ordinal" element
     */
    void unsetOrdinal();
    
    /**
     * Gets array of all "RestrictedValues" elements
     */
    com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue[] getRestrictedValuesArray();
    
    /**
     * Gets ith "RestrictedValues" element
     */
    com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue getRestrictedValuesArray(int i);
    
    /**
     * Returns number of "RestrictedValues" element
     */
    int sizeOfRestrictedValuesArray();
    
    /**
     * Sets array of all "RestrictedValues" element
     */
    void setRestrictedValuesArray(com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue[] restrictedValuesArray);
    
    /**
     * Sets ith "RestrictedValues" element
     */
    void setRestrictedValuesArray(int i, com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue restrictedValues);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RestrictedValues" element
     */
    com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue insertNewRestrictedValues(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RestrictedValues" element
     */
    com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue addNewRestrictedValues();
    
    /**
     * Removes the ith "RestrictedValues" element
     */
    void removeRestrictedValues(int i);
    
    /**
     * Gets the "BaseAttribute" element
     */
    com.exacttarget.wsdl.partnerapi.ListAttribute getBaseAttribute();
    
    /**
     * True if has "BaseAttribute" element
     */
    boolean isSetBaseAttribute();
    
    /**
     * Sets the "BaseAttribute" element
     */
    void setBaseAttribute(com.exacttarget.wsdl.partnerapi.ListAttribute baseAttribute);
    
    /**
     * Appends and returns a new empty "BaseAttribute" element
     */
    com.exacttarget.wsdl.partnerapi.ListAttribute addNewBaseAttribute();
    
    /**
     * Unsets the "BaseAttribute" element
     */
    void unsetBaseAttribute();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.ListAttribute newInstance() {
          return (com.exacttarget.wsdl.partnerapi.ListAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ListAttribute newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.ListAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.ListAttribute parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ListAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ListAttribute parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ListAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.ListAttribute parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ListAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ListAttribute parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ListAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ListAttribute parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ListAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ListAttribute parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ListAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ListAttribute parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ListAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ListAttribute parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ListAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ListAttribute parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ListAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ListAttribute parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ListAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ListAttribute parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ListAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ListAttribute parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ListAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ListAttribute parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ListAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ListAttribute parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ListAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.ListAttribute parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.ListAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.ListAttribute parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.ListAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
