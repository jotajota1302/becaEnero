package edu.es.eoi;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;

import edu.es.eoi.entity.Market;
import edu.es.eoi.repository.MarketRepositoryJPAImpl;

class MarketRepositoryJPAImplTest {

	@Test
	void testReadAll() {
		
		MarketRepositoryJPAImpl repository= new MarketRepositoryJPAImpl();
		
		List<Market> markets=repository.readAll();
		
		assertNotNull(markets);
		
	}
	
	

}
