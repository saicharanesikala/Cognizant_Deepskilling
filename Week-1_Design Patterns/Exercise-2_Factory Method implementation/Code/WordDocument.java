

public class WordDocument implements Document {

@Override
	public void open() 
	{
		System.out.println("Word_ Document opened");
	}

	@Override
	public void save() 
	{
		System.out.println("Word_ Document saved");
	}

	@Override
	public void close() 
	{
		System.out.println("Word_ Document closed");
	}

}