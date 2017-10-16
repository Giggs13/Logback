package com.pb.logback.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Core {

    private static final Logger logger = LoggerFactory.getLogger(Core.class);

    public static void doSomething() {
        logger.debug("Printed with level debug");
    }
}
