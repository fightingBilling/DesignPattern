package top.ningg.design.delegate;

public class DelegateClass {

    private OriginalClass originalClass = new OriginalClass();

    public void methodA() {
        originalClass.methodA();
    }

    public void methodB() {
        originalClass.methodB();
    }
}
