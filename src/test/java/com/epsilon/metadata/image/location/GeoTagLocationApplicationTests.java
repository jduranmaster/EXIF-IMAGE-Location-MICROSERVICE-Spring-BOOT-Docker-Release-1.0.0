package com.epsilon.metadata.image.location;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = GeoTagLocationApplication.class)
@WebAppConfiguration
public class GeoTagLocationApplicationTests {

	public static final String LOCATION_GET_HTTP_METHOD = "";
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void testGeoTagLocation() {
		
	}
}
