package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.social.*;
import org.junit.Assert;
import org.junit.Test;

public class StrategyUserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        User adam = new YGeneration("Adam");
        User anna = new ZGeneration("Anna");
        User tomasz = new Millenials("Tomasz");

        String adamChose = adam.sharePost();
        System.out.println("Adam like: " + adamChose);
        String annaChose = anna.sharePost();
        System.out.println("Anna like: " + annaChose);

        Assert.assertEquals("Twitter", adamChose);
        Assert.assertEquals("Facebook", annaChose);

    }

    @Test
    public void individualChoseSocialMedia() {

        //Given
        User adam = new YGeneration("Adam");

        //When
        String adamChose = adam.sharePost();
        System.out.println("Adam like: " + adamChose);

        adam.setSocialPublisher(new SnapchatPublisher());
        adamChose = adam.sharePost();
        System.out.println("Now Adam like: " + adamChose);

        Assert.assertEquals("Snapchat", adamChose);

    }

}
