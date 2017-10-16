package com.pb.logback;

import com.pb.logback.core.Core;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Entry {

    private static final Logger logger = LoggerFactory.getLogger(Entry.class);

    public static void main(String[] args) {

        logger.trace("Printed with level trace");
        logger.debug("Printed with level debug");
        logger.info("Printed with level info");
        logger.warn("Printed with level warn");
        logger.error("Printed with level error");

        if (logger.isDebugEnabled()) {
            logger.debug("Debug is enabled.");
        }

        Core.doSomething();
    }
}
