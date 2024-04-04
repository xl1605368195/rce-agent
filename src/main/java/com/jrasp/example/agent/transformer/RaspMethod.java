package com.jrasp.example.agent.transformer;

import org.objectweb.asm.commons.Method;

public class RaspMethod extends Method {

    public int access;

    public RaspMethod(int access, String name, String descriptor) {
        super(name, descriptor);
        this.access = access;
    }
}
