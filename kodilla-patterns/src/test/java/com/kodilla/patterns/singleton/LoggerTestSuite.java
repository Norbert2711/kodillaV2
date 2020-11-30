package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeClass
    public static void log(){
        String log1 = "this is first log";
        Logger.getInstance().log(log1);
    }

    @Test
    public void getLastLog(){

        String getLog = Logger.getInstance().getLastLog();
        System.out.println(getLog);

        Assert.assertEquals("this is first log",getLog);

    }

}
