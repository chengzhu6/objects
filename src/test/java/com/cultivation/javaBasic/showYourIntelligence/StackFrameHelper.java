package com.cultivation.javaBasic.showYourIntelligence;

public class StackFrameHelper {
    public static String getCurrentMethodName() {
        // TODO: please modify the following code to pass the test
        // <--start
        Throwable throwable = new Throwable();
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        StackTraceElement lastStackTraceElement = stackTrace[1];
        return lastStackTraceElement.getClassName() + "."+ lastStackTraceElement.getMethodName();
        // --end-->
    }
}
