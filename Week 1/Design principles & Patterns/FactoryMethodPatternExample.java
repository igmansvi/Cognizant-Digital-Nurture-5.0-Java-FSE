public class FactoryMethodPatternExample {
    interface Document {
        void process();
    }

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

    public abstract static class DocumentFactory {
        public abstract Document createDocument();
    }

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
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDocument = wordFactory.createDocument();
        wordDocument.process();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDocument = pdfFactory.createDocument();
        pdfDocument.process();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDocument = excelFactory.createDocument();
        excelDocument.process();

        System.out.println("Completed!");
    }
}
