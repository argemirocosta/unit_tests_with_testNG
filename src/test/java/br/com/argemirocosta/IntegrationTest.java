package br.com.argemirocosta;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IntegrationTest {

    IntegrationTest01 integrationTest01 = new IntegrationTest01();
    IntegrationTest02 integrationTest02 = new IntegrationTest02();

    @Test
    public void testandoMensagensOlaMundo(){
        Assert.assertEquals("Olá Mundo!", integrationTest01.olaMundo());
        Assert.assertEquals("Hello World!", integrationTest01.helloWorld());
        Assert.assertEquals("Hola Mundo!", integrationTest02.holaMundo());
    }

}
