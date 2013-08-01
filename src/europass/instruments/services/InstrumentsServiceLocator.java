/**
 * InstrumentsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package europass.instruments.services;

public class InstrumentsServiceLocator extends org.apache.axis.client.Service implements europass.instruments.services.InstrumentsService {

    public InstrumentsServiceLocator() {
    }


    public InstrumentsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public InstrumentsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Instruments
    private java.lang.String Instruments_address = "http://europass.cedefop.europa.eu/instrumentssrv/services/Instruments";

    public java.lang.String getInstrumentsAddress() {
        return Instruments_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String InstrumentsWSDDServiceName = "Instruments";

    public java.lang.String getInstrumentsWSDDServiceName() {
        return InstrumentsWSDDServiceName;
    }

    public void setInstrumentsWSDDServiceName(java.lang.String name) {
        InstrumentsWSDDServiceName = name;
    }

    public europass.instruments.services.Instruments getInstruments() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Instruments_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getInstruments(endpoint);
    }

    public europass.instruments.services.Instruments getInstruments(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            europass.instruments.services.InstrumentsSoapBindingStub _stub = new europass.instruments.services.InstrumentsSoapBindingStub(portAddress, this);
            _stub.setPortName(getInstrumentsWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setInstrumentsEndpointAddress(java.lang.String address) {
        Instruments_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (europass.instruments.services.Instruments.class.isAssignableFrom(serviceEndpointInterface)) {
                europass.instruments.services.InstrumentsSoapBindingStub _stub = new europass.instruments.services.InstrumentsSoapBindingStub(new java.net.URL(Instruments_address), this);
                _stub.setPortName(getInstrumentsWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Instruments".equals(inputPortName)) {
            return getInstruments();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:instruments", "InstrumentsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:instruments", "Instruments"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Instruments".equals(portName)) {
            setInstrumentsEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
