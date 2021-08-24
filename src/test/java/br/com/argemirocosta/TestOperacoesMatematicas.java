package br.com.argemirocosta;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOperacoesMatematicas {

    @Test
    public void testSoma(){
        Assert.assertEquals(5, OperacoesMatematicas.soma(2,3));
    }

    @Test
    public void testSubtracao(){
        Assert.assertEquals(9, OperacoesMatematicas.subtracao(10,1));
    }

    @Test
    public void testMultiplicacao(){
        Assert.assertEquals(9, OperacoesMatematicas.multiplicacao(3,3));
    }

    @Test
    public void testDivisao(){
        Assert.assertEquals(15, OperacoesMatematicas.divisao(30, 2));
    }

}
