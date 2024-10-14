package com.bloomtech.catsanddogs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// spring boot is a framework for building server applications
//
// a framework is a set of classes to make common processing easier
//
// spring boot uses a tomcat server by default
//
// tomcat is a free, open source server form apache
//
// popular server for java applications
//      (1) it's free
//      (2) easy to use
//      (3) it's stable (doesn't blow up or break), very reliable
//
// the tomcat server used by spring boot listen to port 8080
//      a port is simply an address that a process will monitor for data (listens for data)
//
// a port is like an apartment number in an apartment building
//
// to send requests to your tomcat server -> localhost:8080
//
// localhost means a process on your computer
// 8080 is the port the server is listening to
//


@SpringBootApplication      // tells java that this is a spring boot application
public class Application
{
    // spring boot applications start with a main() method just like any other java app
    public static void main(String[] args) {
        // starts a server for a spring boot application
        //      uses the class name ('Application') of the application (with any args passed)
        //      to the start the application
        SpringApplication.run(Application.class, args);
    }

}
