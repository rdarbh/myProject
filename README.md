<strong>JAX-WS Service using JEE 6.0 & JPA</strong>

This code builds Web Service that connects to MySQL DB. Also used in this project are Apache CommonUtils, JPA, and Maven for build.

WSDL Location once you build it : http://localhost:8080/Employee/EmployeeService?wsdl

Script to create the Employee table:
```
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

```
Example Soap UI:
```
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ser="http://services.dwight.dhs.utah.gov/">
   <soapenv:Header/>
   <soapenv:Body>
      <ser:createEmployee>
         <!--Optional:-->
         <arg0>
            <!--Optional:-->
            <age>37</age>
            <!--Optional:-->
            <name>Ravi</name>
         </arg0>
      </ser:createEmployee>
   </soapenv:Body>
</soapenv:Envelope>

<S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/">
   <S:Body>
      <ns2:createEmployeeResponse xmlns:ns2="http://services.dwight.dhs.utah.gov/">
         <return>
            <messages>Employee record inserted</messages>
            <status>SUCCESS</status>
         </return>
      </ns2:createEmployeeResponse>
   </S:Body>
</S:Envelope>
```
There is another WebMethod to get all the Employees too.
