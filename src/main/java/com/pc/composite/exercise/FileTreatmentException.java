package com.pc.composite.exercise;

/**
 * 文件处理异常
 * Created by Switch on 2017-02-21.
 */
public class FileTreatmentException extends RuntimeException {
    public FileTreatmentException() {

    }

    public FileTreatmentException(String message) {
        super(message);
    }
}
