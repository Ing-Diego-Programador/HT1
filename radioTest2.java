import static org.junit.Assert.assertArrayEquals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class radioTest2 {

	
	 void EncenderRadio(){
		radio r = new radio();
		
		assertFalse(r.getEstadoRadio());
	}
	
	 void Contador() {
		radio r = new radio();
		assertEquals(0, r.contGuardado);
	}

	void contAm(){
		radio r = new radio();
		assertEquals(1, r.contAM);
	}



}
