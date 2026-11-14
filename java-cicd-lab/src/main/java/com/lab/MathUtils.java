package com.lab;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {
    private static final Logger logger = LoggerFactory.getLogger(MathUtils.class);

    public int add(int a, int b) {
        logger.info("Thuc hien phep cong: {} + {}", a, b);
        return a + b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            logger.error("Loi chia cho 0: a = {}, b = {}", a, b);
            throw new IllegalArgumentException("Khong the chia cho 0");
        }
        logger.info("Thuc hien phep chia: {} / {}", a, b);
        return (double) a / b;
    }
}