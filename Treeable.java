public interface Treeable{
  public Object gerValue();
  public Treeable getLeft();
  public Treeable getRight();
  public void setValue(Compareable value);
  public void setLeft(Treeable left);
  public void setRight(Treeable right);
}