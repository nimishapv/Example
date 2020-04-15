package pack2;

import java.io.IOException;

public class ExcelRun {

	public static void main(String[] args) throws IOException {
		ExcelRead er=new ExcelRead();
		double a=er.readData(0, 0);
		System.out.println(a);
		
	}

}
