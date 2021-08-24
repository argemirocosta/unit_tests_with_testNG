package br.com.argemirocosta;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMensagens {

    @Test
    public void testMensagens(){
        Assert.assertEquals("Ok", Mensagens.mensagens("Ok"));
    }

}
