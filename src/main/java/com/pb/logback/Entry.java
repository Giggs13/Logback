package com.pb.logback;

import ch.qos.logback.classic.*;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Entry {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("ROOT");

        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(loggerContext);
        loggerContext.getLoggerList().stream().forEach((log) -> {
            logger.info("The name of logger is {}", log.getName());
        });

        logger.trace("Printed with level trace");
        logger.debug("Printed with level debug");
        logger.info("Printed with level info");
        logger.warn("Printed with level warn");
        logger.error("Printed with level error");

        if (logger.isDebugEnabled()) {
            logger.debug("Debug is enabled.");
        }
    }
}
