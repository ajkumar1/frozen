package com.identity.dPattern;

import com.identity.dPatterns.chainOfResponsibility.AbstractLogger;
import com.identity.dPatterns.chainOfResponsibility.ConsoleLogger;
import com.identity.dPatterns.chainOfResponsibility.ErrorLogger;
import com.identity.dPatterns.chainOfResponsibility.FileLogger;
import com.identity.dPatterns.decorator.BasicCar;
import com.identity.dPatterns.decorator.Car;
import com.identity.dPatterns.decorator.LuxuryCar;
import com.identity.dPatterns.decorator.SportsCar;
import com.identity.dPatterns.strategy.CompressionContext;
import com.identity.dPatterns.strategy.CompressionStrategy;
import com.identity.dPatterns.strategy.RARCompressionStrategy;
import com.identity.dPatterns.strategy.ZipCompressionStrategy;
import com.spring.practice.Configurations.CDPlayerConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ajkumar on 4/29/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class DesignPatternTests {
    @Test   //Strategy pattern
    public void ZipStartegyTest(){
        List<String> files = Arrays.asList("abc", "def", "pfq");
        CompressionContext cs = new CompressionContext(new ZipCompressionStrategy());
            cs.createArchieve(files);

    }
    @Test   //Strategy pattern
    public void RARStartegyTest(){
        List<String> files = Arrays.asList("abc", "def", "pfq");
        CompressionContext cs = new CompressionContext(new RARCompressionStrategy());
            cs.createArchieve(files);
    }

    @Test   //Decorator Pattern
    //http://www.journaldev.com/1540/decorator-design-pattern-in-java-example
    public void sportCarDecoratorTest(){
        Car scar = new SportsCar(new BasicCar());
        scar.assembleCar();

        Car luxurySportsCar = new LuxuryCar(new SportsCar(new BasicCar()));
        luxurySportsCar.assembleCar();
    }

    @Test
    //https://www.tutorialspoint.com/design_pattern/chain_of_responsibility_pattern.htm
    public void chainOfResponsibilityTest(){
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        AbstractLogger loggerChain = errorLogger;

        loggerChain.logMessage(AbstractLogger.DEBUG, "This is the message");
    }
}
