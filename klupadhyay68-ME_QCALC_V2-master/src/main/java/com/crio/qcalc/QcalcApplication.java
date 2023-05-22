package com.crio.qcalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		SpringApplication.run(QcalcApplication.class, args);
		System.out.println("Hello world!");


		
		// ScientificCalculator calc = new ScientificCalculator();
		// calc.tan(3.0);
		// calc.printResult();

		// LogicCalculator calc = new LogicCalculator();
		// calc.OR(8, 6);
		// calc.printResult();

		
	LogicCalculator calc = new LogicCalculator();
	calc.AND(8, 6);
	calc.printResult();


	}

}
