package com.detrox.weather_ai_agent.tools;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class SimpleDataTool {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    // Information tool
    @Tool(description = "Get the current date and time in users zone.")
    public String getCurrentDateTime() {

        this.logger.info("Tool calling");
        this.logger.info("Get the current date and time in users zone.");

        return LocalDateTime.now()
                .atZone(
                        LocaleContextHolder
                                .getTimeZone()
                                .toZoneId()
                )
                .toString();
    }

    // Action tool
    @Tool(description = "Set the alarm for given time.")
    public void setAlarm(
            @ToolParam(description = "Time in ISO-8601 format")
            String time) {

        var dateTime = LocalDateTime.parse(
                time,
                DateTimeFormatter.ISO_DATE_TIME
        );

        this.logger.info(
                "Set the alarm for given time. {}",
                dateTime
        );
    }
}