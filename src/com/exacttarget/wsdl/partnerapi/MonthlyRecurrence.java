/*
 * XML Type:  MonthlyRecurrence
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.MonthlyRecurrence
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML MonthlyRecurrence(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface MonthlyRecurrence extends com.exacttarget.wsdl.partnerapi.Recurrence
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MonthlyRecurrence.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("monthlyrecurrencece4btype");
    
    /**
     * Gets the "MonthlyRecurrencePatternType" element
     */
    com.exacttarget.wsdl.partnerapi.MonthlyRecurrencePatternTypeEnum.Enum getMonthlyRecurrencePatternType();
    
    /**
     * Gets (as xml) the "MonthlyRecurrencePatternType" element
     */
    com.exacttarget.wsdl.partnerapi.MonthlyRecurrencePatternTypeEnum xgetMonthlyRecurrencePatternType();
    
    /**
     * True if has "MonthlyRecurrencePatternType" element
     */
    boolean isSetMonthlyRecurrencePatternType();
    
    /**
     * Sets the "MonthlyRecurrencePatternType" element
     */
    void setMonthlyRecurrencePatternType(com.exacttarget.wsdl.partnerapi.MonthlyRecurrencePatternTypeEnum.Enum monthlyRecurrencePatternType);
    
    /**
     * Sets (as xml) the "MonthlyRecurrencePatternType" element
     */
    void xsetMonthlyRecurrencePatternType(com.exacttarget.wsdl.partnerapi.MonthlyRecurrencePatternTypeEnum monthlyRecurrencePatternType);
    
    /**
     * Unsets the "MonthlyRecurrencePatternType" element
     */
    void unsetMonthlyRecurrencePatternType();
    
    /**
     * Gets the "MonthlyInterval" element
     */
    int getMonthlyInterval();
    
    /**
     * Gets (as xml) the "MonthlyInterval" element
     */
    org.apache.xmlbeans.XmlInt xgetMonthlyInterval();
    
    /**
     * True if has "MonthlyInterval" element
     */
    boolean isSetMonthlyInterval();
    
    /**
     * Sets the "MonthlyInterval" element
     */
    void setMonthlyInterval(int monthlyInterval);
    
    /**
     * Sets (as xml) the "MonthlyInterval" element
     */
    void xsetMonthlyInterval(org.apache.xmlbeans.XmlInt monthlyInterval);
    
    /**
     * Unsets the "MonthlyInterval" element
     */
    void unsetMonthlyInterval();
    
    /**
     * Gets the "ScheduledDay" element
     */
    int getScheduledDay();
    
    /**
     * Gets (as xml) the "ScheduledDay" element
     */
    org.apache.xmlbeans.XmlInt xgetScheduledDay();
    
    /**
     * True if has "ScheduledDay" element
     */
    boolean isSetScheduledDay();
    
    /**
     * Sets the "ScheduledDay" element
     */
    void setScheduledDay(int scheduledDay);
    
    /**
     * Sets (as xml) the "ScheduledDay" element
     */
    void xsetScheduledDay(org.apache.xmlbeans.XmlInt scheduledDay);
    
    /**
     * Unsets the "ScheduledDay" element
     */
    void unsetScheduledDay();
    
    /**
     * Gets the "ScheduledWeek" element
     */
    com.exacttarget.wsdl.partnerapi.WeekOfMonthEnum.Enum getScheduledWeek();
    
    /**
     * Gets (as xml) the "ScheduledWeek" element
     */
    com.exacttarget.wsdl.partnerapi.WeekOfMonthEnum xgetScheduledWeek();
    
    /**
     * True if has "ScheduledWeek" element
     */
    boolean isSetScheduledWeek();
    
    /**
     * Sets the "ScheduledWeek" element
     */
    void setScheduledWeek(com.exacttarget.wsdl.partnerapi.WeekOfMonthEnum.Enum scheduledWeek);
    
    /**
     * Sets (as xml) the "ScheduledWeek" element
     */
    void xsetScheduledWeek(com.exacttarget.wsdl.partnerapi.WeekOfMonthEnum scheduledWeek);
    
    /**
     * Unsets the "ScheduledWeek" element
     */
    void unsetScheduledWeek();
    
    /**
     * Gets the "ScheduledDayOfWeek" element
     */
    com.exacttarget.wsdl.partnerapi.DayOfWeekEnum.Enum getScheduledDayOfWeek();
    
    /**
     * Gets (as xml) the "ScheduledDayOfWeek" element
     */
    com.exacttarget.wsdl.partnerapi.DayOfWeekEnum xgetScheduledDayOfWeek();
    
    /**
     * True if has "ScheduledDayOfWeek" element
     */
    boolean isSetScheduledDayOfWeek();
    
    /**
     * Sets the "ScheduledDayOfWeek" element
     */
    void setScheduledDayOfWeek(com.exacttarget.wsdl.partnerapi.DayOfWeekEnum.Enum scheduledDayOfWeek);
    
    /**
     * Sets (as xml) the "ScheduledDayOfWeek" element
     */
    void xsetScheduledDayOfWeek(com.exacttarget.wsdl.partnerapi.DayOfWeekEnum scheduledDayOfWeek);
    
    /**
     * Unsets the "ScheduledDayOfWeek" element
     */
    void unsetScheduledDayOfWeek();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.MonthlyRecurrence newInstance() {
          return (com.exacttarget.wsdl.partnerapi.MonthlyRecurrence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.MonthlyRecurrence newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.MonthlyRecurrence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.MonthlyRecurrence parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.MonthlyRecurrence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.MonthlyRecurrence parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.MonthlyRecurrence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.MonthlyRecurrence parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.MonthlyRecurrence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.MonthlyRecurrence parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.MonthlyRecurrence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.MonthlyRecurrence parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.MonthlyRecurrence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.MonthlyRecurrence parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.MonthlyRecurrence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.MonthlyRecurrence parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.MonthlyRecurrence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.MonthlyRecurrence parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.MonthlyRecurrence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.MonthlyRecurrence parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.MonthlyRecurrence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.MonthlyRecurrence parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.MonthlyRecurrence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.MonthlyRecurrence parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.MonthlyRecurrence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.MonthlyRecurrence parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.MonthlyRecurrence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.MonthlyRecurrence parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.MonthlyRecurrence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.MonthlyRecurrence parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.MonthlyRecurrence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.MonthlyRecurrence parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.MonthlyRecurrence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.MonthlyRecurrence parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.MonthlyRecurrence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
