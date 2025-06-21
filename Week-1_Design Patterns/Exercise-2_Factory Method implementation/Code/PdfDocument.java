

public class PdfDocument implements Document {

	@Override
	public void open() 
	{
		System.out.println("Pdf_Document opened");
	}

	@Override
	public void save() 
	{
		System.out.println("Pdf_ Document saved");
	}

	@Override
	public void close() 
	{
		System.out.println("Pdf_ Document closed");
	}

}