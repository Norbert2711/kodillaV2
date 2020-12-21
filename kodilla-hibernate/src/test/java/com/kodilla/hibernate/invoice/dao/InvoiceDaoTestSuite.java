package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ProductDao productDao;

    @Autowired
    private ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Product notebook_acer = new Product("Notebok ACER");
        Product samsung_tv = new Product("Samsung TV");
        Product huawei_p20 = new Product("Huawei P20");

        Item item_notebook = new Item(notebook_acer, new BigDecimal(5400), 2, new BigDecimal(34));
        Item item_samsung = new Item(samsung_tv, new BigDecimal(2400), 1, new BigDecimal(3));
        Item item_huawei = new Item(huawei_p20, new BigDecimal(1400), 5, new BigDecimal(8));

        List<Item> itemList = new ArrayList<>();
        itemList.add(item_notebook);
        itemList.add(item_samsung);
        itemList.add(item_huawei);

        Invoice invoice = new Invoice("246", itemList);

        //When
        invoiceDao.save(invoice);
        int intoiceId = invoice.getId();

        itemDao.save(item_notebook);
        itemDao.save(item_samsung);
        itemDao.save(item_huawei);
        int notebookId = item_notebook.getId();
        int samsungId = item_samsung.getId();
        int huaweiId = item_huawei.getId();

        productDao.save(notebook_acer);
        productDao.save(samsung_tv);
        productDao.save(huawei_p20);
        int prod_acerId = notebook_acer.getId();
        int prod_samsungId = samsung_tv.getId();
        int prod_huawei = huawei_p20.getId();


        //Then
        Assert.assertNotEquals(0, intoiceId);

        //CleanUp
        try {
            invoiceDao.deleteById(intoiceId);
            itemDao.deleteById(notebookId);
            itemDao.deleteById(samsungId);
            itemDao.deleteById(huaweiId);
            productDao.deleteById(prod_acerId);
            productDao.deleteById(prod_samsungId);
            productDao.deleteById(prod_huawei);

        } catch (Exception e) {
            //do nothing
        }

    }

}
