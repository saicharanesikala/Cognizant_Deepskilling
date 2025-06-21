

public class DocumentFactory {
    public Document createDocument(int type)
    {
        switch(type) 
        {
            case 1:
                return new WordDocument();
            case 2:
                return new PdfDocument();
            case 3:
                return new ExcelDocument();
            default:
                throw new IllegalArgumentException("Invalid document type: " + type + 
                     ".Valid types are: 1->Word, 2->PDF, 3->Excel");
          }
    }
    
 }