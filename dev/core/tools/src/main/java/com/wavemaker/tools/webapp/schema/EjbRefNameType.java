/*
 *  Copyright (C) 2008-2011 VMware, Inc. All rights reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.4-10/02/2007 10:39 AM(ffu)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.12.20 at 10:31:30 AM PST 
//

package com.wavemaker.tools.webapp.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * 
 * 
 * The ejb-ref-name element contains the name of an EJB reference. The EJB reference is an entry in the Deployment
 * Component's environment and is relative to the java:comp/env context. The name must be unique within the Deployment
 * Component.
 * 
 * It is recommended that name is prefixed with "ejb/".
 * 
 * Example:
 * 
 * <ejb-ref-name>ejb/Payroll</ejb-ref-name>
 * 
 * 
 * 
 * 
 * <p>
 * Java class for ejb-ref-nameType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ejb-ref-nameType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://java.sun.com/xml/ns/j2ee>jndi-nameType">
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ejb-ref-nameType")
public class EjbRefNameType extends JndiNameType {

}
