package com.epam.infohandling.logic;

import com.epam.infohandling.model.Composite;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TextLogic {

    private static final Logger logger = LogManager.getLogger(TextLogic.class);

    public Composite calculate(Composite text) {
        logger.info("calculating text");
        text.calculateExp();
        return text;
    }

    public String restore(Composite text) {
        logger.info("restoring text");
        StringBuilder serealizedText = new StringBuilder();
        text.restoreText(serealizedText);
        String textString = serealizedText.toString();
        return textString;
    }
}
