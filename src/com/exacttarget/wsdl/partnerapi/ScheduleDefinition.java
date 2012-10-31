/*
 * XML Type:  ScheduleDefinition
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ScheduleDefinition
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML ScheduleDefinition(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface ScheduleDefinition extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ScheduleDefinition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("scheduledefinition5f8ctype");
    
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
     * Gets the "Recurrence" element
     */
    com.exacttarget.wsdl.partnerapi.Recurrence getRecurrence();
    
    /**
     * Sets the "Recurrence" element
     */
    void setRecurrence(com.exacttarget.wsdl.partnerapi.Recurrence recurrence);
    
    /**
     * Appends and returns a new empty "Recurrence" element
     */
    com.exacttarget.wsdl.partnerapi.Recurrence addNewRecurrence();
    
    /**
     * Gets the "RecurrenceType" element
     */
    com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum.Enum getRecurrenceType();
    
    /**
     * Gets (as xml) the "RecurrenceType" element
     */
    com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum xgetRecurrenceType();
    
    /**
     * True if has "RecurrenceType" element
     */
    boolean isSetRecurrenceType();
    
    /**
     * Sets the "RecurrenceType" element
     */
    void setRecurrenceType(com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum.Enum recurrenceType);
    
    /**
     * Sets (as xml) the "RecurrenceType" element
     */
    void xsetRecurrenceType(com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum recurrenceType);
    
    /**
     * Unsets the "RecurrenceType" element
     */
    void unsetRecurrenceType();
    
    /**
     * Gets the "RecurrenceRangeType" element
     */
    com.exacttarget.wsdl.partnerapi.RecurrenceRangeTypeEnum.Enum getRecurrenceRangeType();
    
    /**
     * Gets (as xml) the "RecurrenceRangeType" element
     */
    com.exacttarget.wsdl.partnerapi.RecurrenceRangeTypeEnum xgetRecurrenceRangeType();
    
    /**
     * True if has "RecurrenceRangeType" element
     */
    boolean isSetRecurrenceRangeType();
    
    /**
     * Sets the "RecurrenceRangeType" element
     */
    void setRecurrenceRangeType(com.exacttarget.wsdl.partnerapi.RecurrenceRangeTypeEnum.Enum recurrenceRangeType);
    
    /**
     * Sets (as xml) the "RecurrenceRangeType" element
     */
    void xsetRecurrenceRangeType(com.exacttarget.wsdl.partnerapi.RecurrenceRangeTypeEnum recurrenceRangeType);
    
    /**
     * Unsets the "RecurrenceRangeType" element
     */
    void unsetRecurrenceRangeType();
    
    /**
     * Gets the "StartDateTime" element
     */
    java.util.Calendar getStartDateTime();
    
    /**
     * Gets (as xml) the "StartDateTime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetStartDateTime();
    
    /**
     * True if has "StartDateTime" element
     */
    boolean isSetStartDateTime();
    
    /**
     * Sets the "StartDateTime" element
     */
    void setStartDateTime(java.util.Calendar startDateTime);
    
    /**
     * Sets (as xml) the "StartDateTime" element
     */
    void xsetStartDateTime(org.apache.xmlbeans.XmlDateTime startDateTime);
    
    /**
     * Unsets the "StartDateTime" element
     */
    void unsetStartDateTime();
    
    /**
     * Gets the "EndDateTime" element
     */
    java.util.Calendar getEndDateTime();
    
    /**
     * Gets (as xml) the "EndDateTime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetEndDateTime();
    
    /**
     * True if has "EndDateTime" element
     */
    boolean isSetEndDateTime();
    
    /**
     * Sets the "EndDateTime" element
     */
    void setEndDateTime(java.util.Calendar endDateTime);
    
    /**
     * Sets (as xml) the "EndDateTime" element
     */
    void xsetEndDateTime(org.apache.xmlbeans.XmlDateTime endDateTime);
    
    /**
     * Unsets the "EndDateTime" element
     */
    void unsetEndDateTime();
    
    /**
     * Gets the "Occurrences" element
     */
    int getOccurrences();
    
    /**
     * Gets (as xml) the "Occurrences" element
     */
    org.apache.xmlbeans.XmlInt xgetOccurrences();
    
    /**
     * True if has "Occurrences" element
     */
    boolean isSetOccurrences();
    
    /**
     * Sets the "Occurrences" element
     */
    void setOccurrences(int occurrences);
    
    /**
     * Sets (as xml) the "Occurrences" element
     */
    void xsetOccurrences(org.apache.xmlbeans.XmlInt occurrences);
    
    /**
     * Unsets the "Occurrences" element
     */
    void unsetOccurrences();
    
    /**
     * Gets the "Keyword" element
     */
    java.lang.String getKeyword();
    
    /**
     * Gets (as xml) the "Keyword" element
     */
    org.apache.xmlbeans.XmlString xgetKeyword();
    
    /**
     * True if has "Keyword" element
     */
    boolean isSetKeyword();
    
    /**
     * Sets the "Keyword" element
     */
    void setKeyword(java.lang.String keyword);
    
    /**
     * Sets (as xml) the "Keyword" element
     */
    void xsetKeyword(org.apache.xmlbeans.XmlString keyword);
    
    /**
     * Unsets the "Keyword" element
     */
    void unsetKeyword();
    
    /**
     * Gets the "TimeZone" element
     */
    com.exacttarget.wsdl.partnerapi.TimeZone getTimeZone();
    
    /**
     * True if has "TimeZone" element
     */
    boolean isSetTimeZone();
    
    /**
     * Sets the "TimeZone" element
     */
    void setTimeZone(com.exacttarget.wsdl.partnerapi.TimeZone timeZone);
    
    /**
     * Appends and returns a new empty "TimeZone" element
     */
    com.exacttarget.wsdl.partnerapi.TimeZone addNewTimeZone();
    
    /**
     * Unsets the "TimeZone" element
     */
    void unsetTimeZone();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.ScheduleDefinition newInstance() {
          return (com.exacttarget.wsdl.partnerapi.ScheduleDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ScheduleDefinition newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.ScheduleDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.ScheduleDefinition parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ScheduleDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ScheduleDefinition parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ScheduleDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.ScheduleDefinition parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ScheduleDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ScheduleDefinition parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ScheduleDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ScheduleDefinition parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ScheduleDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ScheduleDefinition parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ScheduleDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ScheduleDefinition parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ScheduleDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ScheduleDefinition parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ScheduleDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ScheduleDefinition parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ScheduleDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ScheduleDefinition parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ScheduleDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ScheduleDefinition parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ScheduleDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ScheduleDefinition parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ScheduleDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ScheduleDefinition parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ScheduleDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ScheduleDefinition parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ScheduleDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.ScheduleDefinition parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.ScheduleDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.ScheduleDefinition parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.ScheduleDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
