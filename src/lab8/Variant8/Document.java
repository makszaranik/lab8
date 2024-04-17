package lab8.Variant8;

public class Document {
  protected String information;

  public Document(){
    information = "";
  }

  public Document(String info){
    this.information = info;
  }

  public String read() {
    return information;
  }

  public void write(String info) {
    this.information = info;
  }

  public void add(String info){
    this.information += info;
  }

  public boolean equals(Document doc) {
    return this.information.equals(doc.information);
  }

  @Override
  public String toString() {
    return "Document's information: " + this.information;
  }

}