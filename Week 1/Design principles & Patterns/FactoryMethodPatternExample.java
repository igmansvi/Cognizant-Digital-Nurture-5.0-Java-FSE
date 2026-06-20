public class FactoryMethodPatternExample {
    /*
        A document interface with process function
        - other document classes will implements this
    */
    interface Document {
        void process();
    }

    /*
        Multiple document classes
        - each implements the document and override its function with their version
        - each class shows a document type to be processed and have same parent contract
    */
    public static class WordDocument implements Document {
        @Override
        public void process() {
            System.out.println("Processing Word Document! \n");
        }
    }

    public static class PdfDocument implements Document {
        @Override
        public void process() {
            System.out.println("Processing Pdf Document! \n");
        }
    }

    public static class ExcelDocument implements Document {
        @Override
        public void process() {
            System.out.println("Processing Excel Document! \n");
        }
    }

    /*
        Document factory abstract class
        - it have createDocument() function
        - will return the required document type object
    */
    public abstract static class DocumentFactory {
        public abstract Document createDocument();
    }

    /*
        Multiple document factory
        - on call will return the particular object type
    */
    public static class WordDocumentFactory extends DocumentFactory {
        @Override
        public Document createDocument() {
            System.out.println("Creating Word Document!");
            return new WordDocument();
        }
    }

    public static class PdfDocumentFactory extends DocumentFactory {
        @Override
        public Document createDocument() {
            System.out.println("Creating Pdf Document!");
            return new PdfDocument();
        }
    }

    public static class ExcelDocumentFactory extends DocumentFactory {
        @Override
        public Document createDocument() {
            System.out.println("Creating Excel Document!");
            return new ExcelDocument();
        }
    }

    public static void main(String[] args) {
        // wordFactory returns WordDocument
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDocument = wordFactory.createDocument();
        wordDocument.process();

        // pdfFactory returns PdfDocument
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDocument = pdfFactory.createDocument();
        pdfDocument.process();

        // excelFactory returns ExcelDocument
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDocument = excelFactory.createDocument();
        excelDocument.process();

        // Output: Single base class factory returns all document type object and hides creational design.
        System.out.println("Completed!");
    }
}
