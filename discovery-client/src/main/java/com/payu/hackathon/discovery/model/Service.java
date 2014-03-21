package com.payu.hackathon.discovery.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Collection;
import java.util.Collections;

public class Service {

    private String name;

    @JsonIgnore
    private Collection<Method> methods = Collections.emptyList();

    private String address;

    private String path;

    public Service() {

    }

    public Service(String name, Collection<Method> methods, String address, String path) {
        this.name = name;
        this.methods = methods;
        this.address = address;
        this.path = path;
    }

    public Collection<Method> getMethods() {
        return methods;
    }

    public String getAddress() {
        return address;
    }

    public String getPath() {
        return path;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Service{" +
                "name='" + name + '\'' +
                ", methods=" + methods +
                ", address='" + address + '\'' +
                ", path='" + path + '\'' +
                '}';
    }

    public static class Method {

        public enum MethodType {
            POST, GET, PUT, DELETE, TRACE, HEAD
        }

        private String name;

        private String path;

        private MethodType methodType;

        public Method() {

        }

        public Method(String name, String path, MethodType methodType) {
            this.name = name;
            this.path = path;
            this.methodType = methodType;
        }

        public String getPath() {
            return path;
        }

        public MethodType getMethodType() {
            return methodType;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Method{" +
                    "name='" + name + '\'' +
                    ", path='" + path + '\'' +
                    ", methodType=" + methodType +
                    '}';
        }
    }
}
