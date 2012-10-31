/*
 * XML Type:  DataExtension
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.DataExtension
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML DataExtension(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface DataExtension extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataExtension.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("dataextension4f33type");
    
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
     * Gets the "IsSendable" element
     */
    boolean getIsSendable();
    
    /**
     * Gets (as xml) the "IsSendable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsSendable();
    
    /**
     * True if has "IsSendable" element
     */
    boolean isSetIsSendable();
    
    /**
     * Sets the "IsSendable" element
     */
    void setIsSendable(boolean isSendable);
    
    /**
     * Sets (as xml) the "IsSendable" element
     */
    void xsetIsSendable(org.apache.xmlbeans.XmlBoolean isSendable);
    
    /**
     * Unsets the "IsSendable" element
     */
    void unsetIsSendable();
    
    /**
     * Gets the "IsTestable" element
     */
    boolean getIsTestable();
    
    /**
     * Gets (as xml) the "IsTestable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsTestable();
    
    /**
     * True if has "IsTestable" element
     */
    boolean isSetIsTestable();
    
    /**
     * Sets the "IsTestable" element
     */
    void setIsTestable(boolean isTestable);
    
    /**
     * Sets (as xml) the "IsTestable" element
     */
    void xsetIsTestable(org.apache.xmlbeans.XmlBoolean isTestable);
    
    /**
     * Unsets the "IsTestable" element
     */
    void unsetIsTestable();
    
    /**
     * Gets the "SendableDataExtensionField" element
     */
    com.exacttarget.wsdl.partnerapi.DataExtensionField getSendableDataExtensionField();
    
    /**
     * True if has "SendableDataExtensionField" element
     */
    boolean isSetSendableDataExtensionField();
    
    /**
     * Sets the "SendableDataExtensionField" element
     */
    void setSendableDataExtensionField(com.exacttarget.wsdl.partnerapi.DataExtensionField sendableDataExtensionField);
    
    /**
     * Appends and returns a new empty "SendableDataExtensionField" element
     */
    com.exacttarget.wsdl.partnerapi.DataExtensionField addNewSendableDataExtensionField();
    
    /**
     * Unsets the "SendableDataExtensionField" element
     */
    void unsetSendableDataExtensionField();
    
    /**
     * Gets the "SendableSubscriberField" element
     */
    com.exacttarget.wsdl.partnerapi.Attribute getSendableSubscriberField();
    
    /**
     * True if has "SendableSubscriberField" element
     */
    boolean isSetSendableSubscriberField();
    
    /**
     * Sets the "SendableSubscriberField" element
     */
    void setSendableSubscriberField(com.exacttarget.wsdl.partnerapi.Attribute sendableSubscriberField);
    
    /**
     * Appends and returns a new empty "SendableSubscriberField" element
     */
    com.exacttarget.wsdl.partnerapi.Attribute addNewSendableSubscriberField();
    
    /**
     * Unsets the "SendableSubscriberField" element
     */
    void unsetSendableSubscriberField();
    
    /**
     * Gets the "Template" element
     */
    com.exacttarget.wsdl.partnerapi.DataExtensionTemplate getTemplate();
    
    /**
     * True if has "Template" element
     */
    boolean isSetTemplate();
    
    /**
     * Sets the "Template" element
     */
    void setTemplate(com.exacttarget.wsdl.partnerapi.DataExtensionTemplate template);
    
    /**
     * Appends and returns a new empty "Template" element
     */
    com.exacttarget.wsdl.partnerapi.DataExtensionTemplate addNewTemplate();
    
    /**
     * Unsets the "Template" element
     */
    void unsetTemplate();
    
    /**
     * Gets the "DataRetentionPeriodLength" element
     */
    int getDataRetentionPeriodLength();
    
    /**
     * Gets (as xml) the "DataRetentionPeriodLength" element
     */
    org.apache.xmlbeans.XmlInt xgetDataRetentionPeriodLength();
    
    /**
     * True if has "DataRetentionPeriodLength" element
     */
    boolean isSetDataRetentionPeriodLength();
    
    /**
     * Sets the "DataRetentionPeriodLength" element
     */
    void setDataRetentionPeriodLength(int dataRetentionPeriodLength);
    
    /**
     * Sets (as xml) the "DataRetentionPeriodLength" element
     */
    void xsetDataRetentionPeriodLength(org.apache.xmlbeans.XmlInt dataRetentionPeriodLength);
    
    /**
     * Unsets the "DataRetentionPeriodLength" element
     */
    void unsetDataRetentionPeriodLength();
    
    /**
     * Gets the "DataRetentionPeriodUnitOfMeasure" element
     */
    int getDataRetentionPeriodUnitOfMeasure();
    
    /**
     * Gets (as xml) the "DataRetentionPeriodUnitOfMeasure" element
     */
    org.apache.xmlbeans.XmlInt xgetDataRetentionPeriodUnitOfMeasure();
    
    /**
     * True if has "DataRetentionPeriodUnitOfMeasure" element
     */
    boolean isSetDataRetentionPeriodUnitOfMeasure();
    
    /**
     * Sets the "DataRetentionPeriodUnitOfMeasure" element
     */
    void setDataRetentionPeriodUnitOfMeasure(int dataRetentionPeriodUnitOfMeasure);
    
    /**
     * Sets (as xml) the "DataRetentionPeriodUnitOfMeasure" element
     */
    void xsetDataRetentionPeriodUnitOfMeasure(org.apache.xmlbeans.XmlInt dataRetentionPeriodUnitOfMeasure);
    
    /**
     * Unsets the "DataRetentionPeriodUnitOfMeasure" element
     */
    void unsetDataRetentionPeriodUnitOfMeasure();
    
    /**
     * Gets the "RowBasedRetention" element
     */
    boolean getRowBasedRetention();
    
    /**
     * Gets (as xml) the "RowBasedRetention" element
     */
    org.apache.xmlbeans.XmlBoolean xgetRowBasedRetention();
    
    /**
     * True if has "RowBasedRetention" element
     */
    boolean isSetRowBasedRetention();
    
    /**
     * Sets the "RowBasedRetention" element
     */
    void setRowBasedRetention(boolean rowBasedRetention);
    
    /**
     * Sets (as xml) the "RowBasedRetention" element
     */
    void xsetRowBasedRetention(org.apache.xmlbeans.XmlBoolean rowBasedRetention);
    
    /**
     * Unsets the "RowBasedRetention" element
     */
    void unsetRowBasedRetention();
    
    /**
     * Gets the "ResetRetentionPeriodOnImport" element
     */
    boolean getResetRetentionPeriodOnImport();
    
    /**
     * Gets (as xml) the "ResetRetentionPeriodOnImport" element
     */
    org.apache.xmlbeans.XmlBoolean xgetResetRetentionPeriodOnImport();
    
    /**
     * True if has "ResetRetentionPeriodOnImport" element
     */
    boolean isSetResetRetentionPeriodOnImport();
    
    /**
     * Sets the "ResetRetentionPeriodOnImport" element
     */
    void setResetRetentionPeriodOnImport(boolean resetRetentionPeriodOnImport);
    
    /**
     * Sets (as xml) the "ResetRetentionPeriodOnImport" element
     */
    void xsetResetRetentionPeriodOnImport(org.apache.xmlbeans.XmlBoolean resetRetentionPeriodOnImport);
    
    /**
     * Unsets the "ResetRetentionPeriodOnImport" element
     */
    void unsetResetRetentionPeriodOnImport();
    
    /**
     * Gets the "DeleteAtEndOfRetentionPeriod" element
     */
    boolean getDeleteAtEndOfRetentionPeriod();
    
    /**
     * Gets (as xml) the "DeleteAtEndOfRetentionPeriod" element
     */
    org.apache.xmlbeans.XmlBoolean xgetDeleteAtEndOfRetentionPeriod();
    
    /**
     * True if has "DeleteAtEndOfRetentionPeriod" element
     */
    boolean isSetDeleteAtEndOfRetentionPeriod();
    
    /**
     * Sets the "DeleteAtEndOfRetentionPeriod" element
     */
    void setDeleteAtEndOfRetentionPeriod(boolean deleteAtEndOfRetentionPeriod);
    
    /**
     * Sets (as xml) the "DeleteAtEndOfRetentionPeriod" element
     */
    void xsetDeleteAtEndOfRetentionPeriod(org.apache.xmlbeans.XmlBoolean deleteAtEndOfRetentionPeriod);
    
    /**
     * Unsets the "DeleteAtEndOfRetentionPeriod" element
     */
    void unsetDeleteAtEndOfRetentionPeriod();
    
    /**
     * Gets the "RetainUntil" element
     */
    java.lang.String getRetainUntil();
    
    /**
     * Gets (as xml) the "RetainUntil" element
     */
    org.apache.xmlbeans.XmlString xgetRetainUntil();
    
    /**
     * True if has "RetainUntil" element
     */
    boolean isSetRetainUntil();
    
    /**
     * Sets the "RetainUntil" element
     */
    void setRetainUntil(java.lang.String retainUntil);
    
    /**
     * Sets (as xml) the "RetainUntil" element
     */
    void xsetRetainUntil(org.apache.xmlbeans.XmlString retainUntil);
    
    /**
     * Unsets the "RetainUntil" element
     */
    void unsetRetainUntil();
    
    /**
     * Gets the "Fields" element
     */
    com.exacttarget.wsdl.partnerapi.DataExtension.Fields getFields();
    
    /**
     * True if has "Fields" element
     */
    boolean isSetFields();
    
    /**
     * Sets the "Fields" element
     */
    void setFields(com.exacttarget.wsdl.partnerapi.DataExtension.Fields fields);
    
    /**
     * Appends and returns a new empty "Fields" element
     */
    com.exacttarget.wsdl.partnerapi.DataExtension.Fields addNewFields();
    
    /**
     * Unsets the "Fields" element
     */
    void unsetFields();
    
    /**
     * Gets the "DataRetentionPeriod" element
     */
    com.exacttarget.wsdl.partnerapi.DateTimeUnitOfMeasure.Enum getDataRetentionPeriod();
    
    /**
     * Gets (as xml) the "DataRetentionPeriod" element
     */
    com.exacttarget.wsdl.partnerapi.DateTimeUnitOfMeasure xgetDataRetentionPeriod();
    
    /**
     * True if has "DataRetentionPeriod" element
     */
    boolean isSetDataRetentionPeriod();
    
    /**
     * Sets the "DataRetentionPeriod" element
     */
    void setDataRetentionPeriod(com.exacttarget.wsdl.partnerapi.DateTimeUnitOfMeasure.Enum dataRetentionPeriod);
    
    /**
     * Sets (as xml) the "DataRetentionPeriod" element
     */
    void xsetDataRetentionPeriod(com.exacttarget.wsdl.partnerapi.DateTimeUnitOfMeasure dataRetentionPeriod);
    
    /**
     * Unsets the "DataRetentionPeriod" element
     */
    void unsetDataRetentionPeriod();
    
    /**
     * Gets the "CategoryID" element
     */
    long getCategoryID();
    
    /**
     * Gets (as xml) the "CategoryID" element
     */
    org.apache.xmlbeans.XmlLong xgetCategoryID();
    
    /**
     * True if has "CategoryID" element
     */
    boolean isSetCategoryID();
    
    /**
     * Sets the "CategoryID" element
     */
    void setCategoryID(long categoryID);
    
    /**
     * Sets (as xml) the "CategoryID" element
     */
    void xsetCategoryID(org.apache.xmlbeans.XmlLong categoryID);
    
    /**
     * Unsets the "CategoryID" element
     */
    void unsetCategoryID();
    
    /**
     * Gets the "Status" element
     */
    java.lang.String getStatus();
    
    /**
     * Gets (as xml) the "Status" element
     */
    org.apache.xmlbeans.XmlString xgetStatus();
    
    /**
     * True if has "Status" element
     */
    boolean isSetStatus();
    
    /**
     * Sets the "Status" element
     */
    void setStatus(java.lang.String status);
    
    /**
     * Sets (as xml) the "Status" element
     */
    void xsetStatus(org.apache.xmlbeans.XmlString status);
    
    /**
     * Unsets the "Status" element
     */
    void unsetStatus();
    
    /**
     * An XML Fields(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public interface Fields extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Fields.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("fields6e1eelemtype");
        
        /**
         * Gets array of all "Field" elements
         */
        com.exacttarget.wsdl.partnerapi.DataExtensionField[] getFieldArray();
        
        /**
         * Gets ith "Field" element
         */
        com.exacttarget.wsdl.partnerapi.DataExtensionField getFieldArray(int i);
        
        /**
         * Returns number of "Field" element
         */
        int sizeOfFieldArray();
        
        /**
         * Sets array of all "Field" element
         */
        void setFieldArray(com.exacttarget.wsdl.partnerapi.DataExtensionField[] fieldArray);
        
        /**
         * Sets ith "Field" element
         */
        void setFieldArray(int i, com.exacttarget.wsdl.partnerapi.DataExtensionField field);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Field" element
         */
        com.exacttarget.wsdl.partnerapi.DataExtensionField insertNewField(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Field" element
         */
        com.exacttarget.wsdl.partnerapi.DataExtensionField addNewField();
        
        /**
         * Removes the ith "Field" element
         */
        void removeField(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.exacttarget.wsdl.partnerapi.DataExtension.Fields newInstance() {
              return (com.exacttarget.wsdl.partnerapi.DataExtension.Fields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.exacttarget.wsdl.partnerapi.DataExtension.Fields newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.exacttarget.wsdl.partnerapi.DataExtension.Fields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.DataExtension newInstance() {
          return (com.exacttarget.wsdl.partnerapi.DataExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.DataExtension newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.DataExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.DataExtension parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.DataExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.DataExtension parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.DataExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.DataExtension parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.DataExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.DataExtension parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.DataExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.DataExtension parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.DataExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.DataExtension parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.DataExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.DataExtension parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.DataExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.DataExtension parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.DataExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.DataExtension parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.DataExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.DataExtension parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.DataExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.DataExtension parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.DataExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.DataExtension parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.DataExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.DataExtension parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.DataExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.DataExtension parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.DataExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.DataExtension parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.DataExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.DataExtension parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.DataExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
