# LSEG-task1

To save html to table csv is used GrabzIt library. https://grabz.it/
Added via Maven

Becouse of Java 9 and later have not library to saving files (JAXBException: Implementation of JAXB-API has not been found on module path or classpath) 
We need to have api.
Must to Have! More info: https://mkyong.com/java/jaxbexception-implementation-of-jaxb-api-has-not-been-found-on-module-path-or-classpath/
        Maven, from Sunrise Company with javaassist
        <dependency>
            <groupId>com.sun.xml.bind</groupId>
            <artifactId>jaxb-core</artifactId>
            <version>2.3.0.1</version>
        </dependency>
        <dependency>
            <groupId>javax.xml.bind</groupId>
            <artifactId>jaxb-api</artifactId>
            <version>2.3.1</version>
        </dependency>
        <dependency>
            <groupId>com.sun.xml.bind</groupId>
            <artifactId>jaxb-impl</artifactId>
            <version>2.3.1</version>
        </dependency>
        <dependency>
            <groupId>org.javassist</groupId>
            <artifactId>javassist</artifactId>
            <version>3.25.0-GA</version>
        </dependency>
        
 And finally
 Aspose library is used to convert csv file to html. Added via liraries path, becouse the new maven can't download files via http protocol (only https) :)
 https://releases.aspose.com/cells/java/
 https://products.aspose.com/cells/java/conversion/csv-to-html/
 
 Result 
 ![image](https://user-images.githubusercontent.com/57364788/204102385-251b1b0b-acde-4b2c-acfe-42dc101e68c8.png)
 ![image](https://user-images.githubusercontent.com/57364788/204102403-e420335a-6d12-4fc5-95cb-30092d9c7a09.png)


 
 
