/*
 * XML Type:  ImportDefinition
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ImportDefinition
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML ImportDefinition(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface ImportDefinition extends com.exacttarget.wsdl.partnerapi.InteractionDefinition
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ImportDefinition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("importdefinition2dfetype");
    
    /**
     * Gets the "AllowErrors" element
     */
    boolean getAllowErrors();
    
    /**
     * Gets (as xml) the "AllowErrors" element
     */
    org.apache.xmlbeans.XmlBoolean xgetAllowErrors();
    
    /**
     * True if has "AllowErrors" element
     */
    boolean isSetAllowErrors();
    
    /**
     * Sets the "AllowErrors" element
     */
    void setAllowErrors(boolean allowErrors);
    
    /**
     * Sets (as xml) the "AllowErrors" element
     */
    void xsetAllowErrors(org.apache.xmlbeans.XmlBoolean allowErrors);
    
    /**
     * Unsets the "AllowErrors" element
     */
    void unsetAllowErrors();
    
    /**
     * Gets the "DestinationObject" element
     */
    com.exacttarget.wsdl.partnerapi.APIObject getDestinationObject();
    
    /**
     * True if has "DestinationObject" element
     */
    boolean isSetDestinationObject();
    
    /**
     * Sets the "DestinationObject" element
     */
    void setDestinationObject(com.exacttarget.wsdl.partnerapi.APIObject destinationObject);
    
    /**
     * Appends and returns a new empty "DestinationObject" element
     */
    com.exacttarget.wsdl.partnerapi.APIObject addNewDestinationObject();
    
    /**
     * Unsets the "DestinationObject" element
     */
    void unsetDestinationObject();
    
    /**
     * Gets the "FieldMappingType" element
     */
    com.exacttarget.wsdl.partnerapi.ImportDefinitionFieldMappingType.Enum getFieldMappingType();
    
    /**
     * Gets (as xml) the "FieldMappingType" element
     */
    com.exacttarget.wsdl.partnerapi.ImportDefinitionFieldMappingType xgetFieldMappingType();
    
    /**
     * True if has "FieldMappingType" element
     */
    boolean isSetFieldMappingType();
    
    /**
     * Sets the "FieldMappingType" element
     */
    void setFieldMappingType(com.exacttarget.wsdl.partnerapi.ImportDefinitionFieldMappingType.Enum fieldMappingType);
    
    /**
     * Sets (as xml) the "FieldMappingType" element
     */
    void xsetFieldMappingType(com.exacttarget.wsdl.partnerapi.ImportDefinitionFieldMappingType fieldMappingType);
    
    /**
     * Unsets the "FieldMappingType" element
     */
    void unsetFieldMappingType();
    
    /**
     * Gets the "FieldMaps" element
     */
    com.exacttarget.wsdl.partnerapi.ImportDefinition.FieldMaps getFieldMaps();
    
    /**
     * True if has "FieldMaps" element
     */
    boolean isSetFieldMaps();
    
    /**
     * Sets the "FieldMaps" element
     */
    void setFieldMaps(com.exacttarget.wsdl.partnerapi.ImportDefinition.FieldMaps fieldMaps);
    
    /**
     * Appends and returns a new empty "FieldMaps" element
     */
    com.exacttarget.wsdl.partnerapi.ImportDefinition.FieldMaps addNewFieldMaps();
    
    /**
     * Unsets the "FieldMaps" element
     */
    void unsetFieldMaps();
    
    /**
     * Gets the "FileSpec" element
     */
    java.lang.String getFileSpec();
    
    /**
     * Gets (as xml) the "FileSpec" element
     */
    org.apache.xmlbeans.XmlString xgetFileSpec();
    
    /**
     * True if has "FileSpec" element
     */
    boolean isSetFileSpec();
    
    /**
     * Sets the "FileSpec" element
     */
    void setFileSpec(java.lang.String fileSpec);
    
    /**
     * Sets (as xml) the "FileSpec" element
     */
    void xsetFileSpec(org.apache.xmlbeans.XmlString fileSpec);
    
    /**
     * Unsets the "FileSpec" element
     */
    void unsetFileSpec();
    
    /**
     * Gets the "FileType" element
     */
    com.exacttarget.wsdl.partnerapi.FileType.Enum getFileType();
    
    /**
     * Gets (as xml) the "FileType" element
     */
    com.exacttarget.wsdl.partnerapi.FileType xgetFileType();
    
    /**
     * True if has "FileType" element
     */
    boolean isSetFileType();
    
    /**
     * Sets the "FileType" element
     */
    void setFileType(com.exacttarget.wsdl.partnerapi.FileType.Enum fileType);
    
    /**
     * Sets (as xml) the "FileType" element
     */
    void xsetFileType(com.exacttarget.wsdl.partnerapi.FileType fileType);
    
    /**
     * Unsets the "FileType" element
     */
    void unsetFileType();
    
    /**
     * Gets the "Notification" element
     */
    com.exacttarget.wsdl.partnerapi.AsyncResponse getNotification();
    
    /**
     * True if has "Notification" element
     */
    boolean isSetNotification();
    
    /**
     * Sets the "Notification" element
     */
    void setNotification(com.exacttarget.wsdl.partnerapi.AsyncResponse notification);
    
    /**
     * Appends and returns a new empty "Notification" element
     */
    com.exacttarget.wsdl.partnerapi.AsyncResponse addNewNotification();
    
    /**
     * Unsets the "Notification" element
     */
    void unsetNotification();
    
    /**
     * Gets the "RetrieveFileTransferLocation" element
     */
    com.exacttarget.wsdl.partnerapi.FileTransferLocation getRetrieveFileTransferLocation();
    
    /**
     * True if has "RetrieveFileTransferLocation" element
     */
    boolean isSetRetrieveFileTransferLocation();
    
    /**
     * Sets the "RetrieveFileTransferLocation" element
     */
    void setRetrieveFileTransferLocation(com.exacttarget.wsdl.partnerapi.FileTransferLocation retrieveFileTransferLocation);
    
    /**
     * Appends and returns a new empty "RetrieveFileTransferLocation" element
     */
    com.exacttarget.wsdl.partnerapi.FileTransferLocation addNewRetrieveFileTransferLocation();
    
    /**
     * Unsets the "RetrieveFileTransferLocation" element
     */
    void unsetRetrieveFileTransferLocation();
    
    /**
     * Gets the "SubscriberImportType" element
     */
    com.exacttarget.wsdl.partnerapi.ImportDefinitionSubscriberImportType.Enum getSubscriberImportType();
    
    /**
     * Gets (as xml) the "SubscriberImportType" element
     */
    com.exacttarget.wsdl.partnerapi.ImportDefinitionSubscriberImportType xgetSubscriberImportType();
    
    /**
     * True if has "SubscriberImportType" element
     */
    boolean isSetSubscriberImportType();
    
    /**
     * Sets the "SubscriberImportType" element
     */
    void setSubscriberImportType(com.exacttarget.wsdl.partnerapi.ImportDefinitionSubscriberImportType.Enum subscriberImportType);
    
    /**
     * Sets (as xml) the "SubscriberImportType" element
     */
    void xsetSubscriberImportType(com.exacttarget.wsdl.partnerapi.ImportDefinitionSubscriberImportType subscriberImportType);
    
    /**
     * Unsets the "SubscriberImportType" element
     */
    void unsetSubscriberImportType();
    
    /**
     * Gets the "UpdateType" element
     */
    com.exacttarget.wsdl.partnerapi.ImportDefinitionUpdateType.Enum getUpdateType();
    
    /**
     * Gets (as xml) the "UpdateType" element
     */
    com.exacttarget.wsdl.partnerapi.ImportDefinitionUpdateType xgetUpdateType();
    
    /**
     * True if has "UpdateType" element
     */
    boolean isSetUpdateType();
    
    /**
     * Sets the "UpdateType" element
     */
    void setUpdateType(com.exacttarget.wsdl.partnerapi.ImportDefinitionUpdateType.Enum updateType);
    
    /**
     * Sets (as xml) the "UpdateType" element
     */
    void xsetUpdateType(com.exacttarget.wsdl.partnerapi.ImportDefinitionUpdateType updateType);
    
    /**
     * Unsets the "UpdateType" element
     */
    void unsetUpdateType();
    
    /**
     * Gets the "MaxFileAge" element
     */
    int getMaxFileAge();
    
    /**
     * Gets (as xml) the "MaxFileAge" element
     */
    org.apache.xmlbeans.XmlInt xgetMaxFileAge();
    
    /**
     * True if has "MaxFileAge" element
     */
    boolean isSetMaxFileAge();
    
    /**
     * Sets the "MaxFileAge" element
     */
    void setMaxFileAge(int maxFileAge);
    
    /**
     * Sets (as xml) the "MaxFileAge" element
     */
    void xsetMaxFileAge(org.apache.xmlbeans.XmlInt maxFileAge);
    
    /**
     * Unsets the "MaxFileAge" element
     */
    void unsetMaxFileAge();
    
    /**
     * Gets the "MaxFileAgeScheduleOffset" element
     */
    int getMaxFileAgeScheduleOffset();
    
    /**
     * Gets (as xml) the "MaxFileAgeScheduleOffset" element
     */
    org.apache.xmlbeans.XmlInt xgetMaxFileAgeScheduleOffset();
    
    /**
     * True if has "MaxFileAgeScheduleOffset" element
     */
    boolean isSetMaxFileAgeScheduleOffset();
    
    /**
     * Sets the "MaxFileAgeScheduleOffset" element
     */
    void setMaxFileAgeScheduleOffset(int maxFileAgeScheduleOffset);
    
    /**
     * Sets (as xml) the "MaxFileAgeScheduleOffset" element
     */
    void xsetMaxFileAgeScheduleOffset(org.apache.xmlbeans.XmlInt maxFileAgeScheduleOffset);
    
    /**
     * Unsets the "MaxFileAgeScheduleOffset" element
     */
    void unsetMaxFileAgeScheduleOffset();
    
    /**
     * Gets the "MaxImportFrequency" element
     */
    int getMaxImportFrequency();
    
    /**
     * Gets (as xml) the "MaxImportFrequency" element
     */
    org.apache.xmlbeans.XmlInt xgetMaxImportFrequency();
    
    /**
     * True if has "MaxImportFrequency" element
     */
    boolean isSetMaxImportFrequency();
    
    /**
     * Sets the "MaxImportFrequency" element
     */
    void setMaxImportFrequency(int maxImportFrequency);
    
    /**
     * Sets (as xml) the "MaxImportFrequency" element
     */
    void xsetMaxImportFrequency(org.apache.xmlbeans.XmlInt maxImportFrequency);
    
    /**
     * Unsets the "MaxImportFrequency" element
     */
    void unsetMaxImportFrequency();
    
    /**
     * Gets the "Delimiter" element
     */
    java.lang.String getDelimiter();
    
    /**
     * Gets (as xml) the "Delimiter" element
     */
    org.apache.xmlbeans.XmlString xgetDelimiter();
    
    /**
     * True if has "Delimiter" element
     */
    boolean isSetDelimiter();
    
    /**
     * Sets the "Delimiter" element
     */
    void setDelimiter(java.lang.String delimiter);
    
    /**
     * Sets (as xml) the "Delimiter" element
     */
    void xsetDelimiter(org.apache.xmlbeans.XmlString delimiter);
    
    /**
     * Unsets the "Delimiter" element
     */
    void unsetDelimiter();
    
    /**
     * Gets the "HeaderLines" element
     */
    int getHeaderLines();
    
    /**
     * Gets (as xml) the "HeaderLines" element
     */
    org.apache.xmlbeans.XmlInt xgetHeaderLines();
    
    /**
     * True if has "HeaderLines" element
     */
    boolean isSetHeaderLines();
    
    /**
     * Sets the "HeaderLines" element
     */
    void setHeaderLines(int headerLines);
    
    /**
     * Sets (as xml) the "HeaderLines" element
     */
    void xsetHeaderLines(org.apache.xmlbeans.XmlInt headerLines);
    
    /**
     * Unsets the "HeaderLines" element
     */
    void unsetHeaderLines();
    
    /**
     * Gets the "AutoGenerateDestination" element
     */
    com.exacttarget.wsdl.partnerapi.ImportDefinitionAutoGenerateDestination getAutoGenerateDestination();
    
    /**
     * True if has "AutoGenerateDestination" element
     */
    boolean isSetAutoGenerateDestination();
    
    /**
     * Sets the "AutoGenerateDestination" element
     */
    void setAutoGenerateDestination(com.exacttarget.wsdl.partnerapi.ImportDefinitionAutoGenerateDestination autoGenerateDestination);
    
    /**
     * Appends and returns a new empty "AutoGenerateDestination" element
     */
    com.exacttarget.wsdl.partnerapi.ImportDefinitionAutoGenerateDestination addNewAutoGenerateDestination();
    
    /**
     * Unsets the "AutoGenerateDestination" element
     */
    void unsetAutoGenerateDestination();
    
    /**
     * Gets the "ControlColumn" element
     */
    java.lang.String getControlColumn();
    
    /**
     * Gets (as xml) the "ControlColumn" element
     */
    org.apache.xmlbeans.XmlString xgetControlColumn();
    
    /**
     * True if has "ControlColumn" element
     */
    boolean isSetControlColumn();
    
    /**
     * Sets the "ControlColumn" element
     */
    void setControlColumn(java.lang.String controlColumn);
    
    /**
     * Sets (as xml) the "ControlColumn" element
     */
    void xsetControlColumn(org.apache.xmlbeans.XmlString controlColumn);
    
    /**
     * Unsets the "ControlColumn" element
     */
    void unsetControlColumn();
    
    /**
     * Gets the "ControlColumnDefaultAction" element
     */
    com.exacttarget.wsdl.partnerapi.ImportDefinitionColumnBasedActionType.Enum getControlColumnDefaultAction();
    
    /**
     * Gets (as xml) the "ControlColumnDefaultAction" element
     */
    com.exacttarget.wsdl.partnerapi.ImportDefinitionColumnBasedActionType xgetControlColumnDefaultAction();
    
    /**
     * True if has "ControlColumnDefaultAction" element
     */
    boolean isSetControlColumnDefaultAction();
    
    /**
     * Sets the "ControlColumnDefaultAction" element
     */
    void setControlColumnDefaultAction(com.exacttarget.wsdl.partnerapi.ImportDefinitionColumnBasedActionType.Enum controlColumnDefaultAction);
    
    /**
     * Sets (as xml) the "ControlColumnDefaultAction" element
     */
    void xsetControlColumnDefaultAction(com.exacttarget.wsdl.partnerapi.ImportDefinitionColumnBasedActionType controlColumnDefaultAction);
    
    /**
     * Unsets the "ControlColumnDefaultAction" element
     */
    void unsetControlColumnDefaultAction();
    
    /**
     * Gets the "ControlColumnActions" element
     */
    com.exacttarget.wsdl.partnerapi.ImportDefinition.ControlColumnActions getControlColumnActions();
    
    /**
     * True if has "ControlColumnActions" element
     */
    boolean isSetControlColumnActions();
    
    /**
     * Sets the "ControlColumnActions" element
     */
    void setControlColumnActions(com.exacttarget.wsdl.partnerapi.ImportDefinition.ControlColumnActions controlColumnActions);
    
    /**
     * Appends and returns a new empty "ControlColumnActions" element
     */
    com.exacttarget.wsdl.partnerapi.ImportDefinition.ControlColumnActions addNewControlColumnActions();
    
    /**
     * Unsets the "ControlColumnActions" element
     */
    void unsetControlColumnActions();
    
    /**
     * Gets the "EndOfLineRepresentation" element
     */
    java.lang.String getEndOfLineRepresentation();
    
    /**
     * Gets (as xml) the "EndOfLineRepresentation" element
     */
    org.apache.xmlbeans.XmlString xgetEndOfLineRepresentation();
    
    /**
     * True if has "EndOfLineRepresentation" element
     */
    boolean isSetEndOfLineRepresentation();
    
    /**
     * Sets the "EndOfLineRepresentation" element
     */
    void setEndOfLineRepresentation(java.lang.String endOfLineRepresentation);
    
    /**
     * Sets (as xml) the "EndOfLineRepresentation" element
     */
    void xsetEndOfLineRepresentation(org.apache.xmlbeans.XmlString endOfLineRepresentation);
    
    /**
     * Unsets the "EndOfLineRepresentation" element
     */
    void unsetEndOfLineRepresentation();
    
    /**
     * Gets the "NullRepresentation" element
     */
    java.lang.String getNullRepresentation();
    
    /**
     * Gets (as xml) the "NullRepresentation" element
     */
    org.apache.xmlbeans.XmlString xgetNullRepresentation();
    
    /**
     * True if has "NullRepresentation" element
     */
    boolean isSetNullRepresentation();
    
    /**
     * Sets the "NullRepresentation" element
     */
    void setNullRepresentation(java.lang.String nullRepresentation);
    
    /**
     * Sets (as xml) the "NullRepresentation" element
     */
    void xsetNullRepresentation(org.apache.xmlbeans.XmlString nullRepresentation);
    
    /**
     * Unsets the "NullRepresentation" element
     */
    void unsetNullRepresentation();
    
    /**
     * Gets the "StandardQuotedStrings" element
     */
    boolean getStandardQuotedStrings();
    
    /**
     * Gets (as xml) the "StandardQuotedStrings" element
     */
    org.apache.xmlbeans.XmlBoolean xgetStandardQuotedStrings();
    
    /**
     * True if has "StandardQuotedStrings" element
     */
    boolean isSetStandardQuotedStrings();
    
    /**
     * Sets the "StandardQuotedStrings" element
     */
    void setStandardQuotedStrings(boolean standardQuotedStrings);
    
    /**
     * Sets (as xml) the "StandardQuotedStrings" element
     */
    void xsetStandardQuotedStrings(org.apache.xmlbeans.XmlBoolean standardQuotedStrings);
    
    /**
     * Unsets the "StandardQuotedStrings" element
     */
    void unsetStandardQuotedStrings();
    
    /**
     * Gets the "Filter" element
     */
    java.lang.String getFilter();
    
    /**
     * Gets (as xml) the "Filter" element
     */
    org.apache.xmlbeans.XmlString xgetFilter();
    
    /**
     * True if has "Filter" element
     */
    boolean isSetFilter();
    
    /**
     * Sets the "Filter" element
     */
    void setFilter(java.lang.String filter);
    
    /**
     * Sets (as xml) the "Filter" element
     */
    void xsetFilter(org.apache.xmlbeans.XmlString filter);
    
    /**
     * Unsets the "Filter" element
     */
    void unsetFilter();
    
    /**
     * Gets the "DateFormattingLocale" element
     */
    com.exacttarget.wsdl.partnerapi.Locale getDateFormattingLocale();
    
    /**
     * True if has "DateFormattingLocale" element
     */
    boolean isSetDateFormattingLocale();
    
    /**
     * Sets the "DateFormattingLocale" element
     */
    void setDateFormattingLocale(com.exacttarget.wsdl.partnerapi.Locale dateFormattingLocale);
    
    /**
     * Appends and returns a new empty "DateFormattingLocale" element
     */
    com.exacttarget.wsdl.partnerapi.Locale addNewDateFormattingLocale();
    
    /**
     * Unsets the "DateFormattingLocale" element
     */
    void unsetDateFormattingLocale();
    
    /**
     * An XML FieldMaps(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public interface FieldMaps extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FieldMaps.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("fieldmapsd8bbelemtype");
        
        /**
         * Gets array of all "FieldMap" elements
         */
        com.exacttarget.wsdl.partnerapi.FieldMap[] getFieldMapArray();
        
        /**
         * Gets ith "FieldMap" element
         */
        com.exacttarget.wsdl.partnerapi.FieldMap getFieldMapArray(int i);
        
        /**
         * Returns number of "FieldMap" element
         */
        int sizeOfFieldMapArray();
        
        /**
         * Sets array of all "FieldMap" element
         */
        void setFieldMapArray(com.exacttarget.wsdl.partnerapi.FieldMap[] fieldMapArray);
        
        /**
         * Sets ith "FieldMap" element
         */
        void setFieldMapArray(int i, com.exacttarget.wsdl.partnerapi.FieldMap fieldMap);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "FieldMap" element
         */
        com.exacttarget.wsdl.partnerapi.FieldMap insertNewFieldMap(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "FieldMap" element
         */
        com.exacttarget.wsdl.partnerapi.FieldMap addNewFieldMap();
        
        /**
         * Removes the ith "FieldMap" element
         */
        void removeFieldMap(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.exacttarget.wsdl.partnerapi.ImportDefinition.FieldMaps newInstance() {
              return (com.exacttarget.wsdl.partnerapi.ImportDefinition.FieldMaps) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.exacttarget.wsdl.partnerapi.ImportDefinition.FieldMaps newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.exacttarget.wsdl.partnerapi.ImportDefinition.FieldMaps) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML ControlColumnActions(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public interface ControlColumnActions extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ControlColumnActions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("controlcolumnactionsbda4elemtype");
        
        /**
         * Gets array of all "ControlColumnAction" elements
         */
        com.exacttarget.wsdl.partnerapi.ImportDefinitionColumnBasedAction[] getControlColumnActionArray();
        
        /**
         * Gets ith "ControlColumnAction" element
         */
        com.exacttarget.wsdl.partnerapi.ImportDefinitionColumnBasedAction getControlColumnActionArray(int i);
        
        /**
         * Returns number of "ControlColumnAction" element
         */
        int sizeOfControlColumnActionArray();
        
        /**
         * Sets array of all "ControlColumnAction" element
         */
        void setControlColumnActionArray(com.exacttarget.wsdl.partnerapi.ImportDefinitionColumnBasedAction[] controlColumnActionArray);
        
        /**
         * Sets ith "ControlColumnAction" element
         */
        void setControlColumnActionArray(int i, com.exacttarget.wsdl.partnerapi.ImportDefinitionColumnBasedAction controlColumnAction);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ControlColumnAction" element
         */
        com.exacttarget.wsdl.partnerapi.ImportDefinitionColumnBasedAction insertNewControlColumnAction(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ControlColumnAction" element
         */
        com.exacttarget.wsdl.partnerapi.ImportDefinitionColumnBasedAction addNewControlColumnAction();
        
        /**
         * Removes the ith "ControlColumnAction" element
         */
        void removeControlColumnAction(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.exacttarget.wsdl.partnerapi.ImportDefinition.ControlColumnActions newInstance() {
              return (com.exacttarget.wsdl.partnerapi.ImportDefinition.ControlColumnActions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.exacttarget.wsdl.partnerapi.ImportDefinition.ControlColumnActions newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.exacttarget.wsdl.partnerapi.ImportDefinition.ControlColumnActions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.ImportDefinition newInstance() {
          return (com.exacttarget.wsdl.partnerapi.ImportDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ImportDefinition newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.ImportDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.ImportDefinition parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ImportDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ImportDefinition parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ImportDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.ImportDefinition parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ImportDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ImportDefinition parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ImportDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ImportDefinition parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ImportDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ImportDefinition parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ImportDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ImportDefinition parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ImportDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ImportDefinition parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ImportDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ImportDefinition parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ImportDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ImportDefinition parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ImportDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ImportDefinition parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ImportDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ImportDefinition parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ImportDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ImportDefinition parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ImportDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ImportDefinition parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ImportDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.ImportDefinition parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.ImportDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.ImportDefinition parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.ImportDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
