package lab8.Variant8;

import java.util.Comparator;

public class TextDocument extends Document {
  private int amountSymbols;

  public TextDocument() {
    this.information = "";
    this.amountSymbols = 0;
  }

  public TextDocument(String info) {
    this.information = info;
    this.amountSymbols = info.length();
  }

  public static class DocumentLengthComparator implements Comparator<Document> {
    @Override
    public int compare(Document doc1, Document doc2) {
      return Integer.compare(doc1.read().length(), doc2.read().length());
    }
  }

  public static class TextDocumentSymbolComparator implements Comparator<TextDocument> {
    @Override
    public int compare(TextDocument doc1, TextDocument doc2) {
      return Integer.compare(doc1.getAmountSymbols(), doc2.getAmountSymbols());
    }
  }

  public int getAmountSymbols() {
    return amountSymbols;
  }

  @Override
  public String read() {
    return super.read();
  }

  @Override
  public void write(String info) {
    super.write(info);
    this.amountSymbols = info.length();
  }

  @Override
  public void add(String info) {
    super.add(info);
    this.amountSymbols += info.length();
  }

  public boolean equals(TextDocument doc) {
    return super.equals(doc);
  }

  @Override
  public String toString() {
    return "Document's information: " + this.information + "\n" + "Amount of symbols: " + this.amountSymbols;
  }
}
