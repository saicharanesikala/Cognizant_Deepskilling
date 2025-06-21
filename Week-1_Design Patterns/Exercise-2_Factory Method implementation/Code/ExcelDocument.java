

public class ExcelDocument implements Document{
	@Override
	public void open() {
		
		System.out.println("Excel_ Document opened");
	}

	@Override
	public void save() {
		
		System.out.println("Excel_ Document saved");
	}

	@Override
	public void close() {
		
		System.out.println("Excel_ Document closed");
	}

}
