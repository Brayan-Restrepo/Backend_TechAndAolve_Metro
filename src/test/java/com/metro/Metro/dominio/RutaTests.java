package com.metro.Metro.dominio;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.metro.metro.dominio.Ruta;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RutaTests {

    @Spy
    private Ruta aRuta;
    @Before
    public void setup() {

    }

    @Test
    public void testPlus() {
        //Arrange
        doNothing().when(aRuta).sumar();
        //when()

        //Act
        int result = aRuta.suma(2,3);

        //Assert
        assertThat(result).isEqualTo(5);
        Mockito.verify(aRuta ,Mockito.times(1)).sumar();
    }
}
