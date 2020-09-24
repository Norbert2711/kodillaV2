package com.kodilla.stream.sand;

import org.junit.Assert;
import org.junit.Test;

import javax.xml.ws.RequestWrapper;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Adler32;

public class TestSandBeansSuite {

    @Test
    public void testGetSandBeansQuantity() {

        //Given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Asia());
        continents.add(new Africa());

        //When
        BigDecimal totalSand = BigDecimal.ZERO;
        for (SandStorage continent : continents) {
            totalSand = totalSand.add(continent.getSandsBeansQuantity());
        }

        //Then
        BigDecimal expectedSand = new BigDecimal("211111110903703703670");
        Assert.assertEquals(expectedSand, totalSand);
    }

    @Test
    public void testGetSandBeansQuantityWithReduce() {

        //Given
        List<SandStorage> nations = new ArrayList<>();
        nations.add(new Asia());
        nations.add(new Africa());
        nations.add(new Europe());

        //When
        BigDecimal sandQuantity = nations.stream()
                .map(SandStorage::getSandsBeansQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        //Then
        BigDecimal expectedSand = new BigDecimal("211111110903703703670");
        Assert.assertEquals(expectedSand, sandQuantity);

    }

}
