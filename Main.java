public class Main {
    public static void main(String[] args) {
        Handler tf = new TextFileHandler("1st handler");
        Handler ifh = new ImageFileHandler("3rd handler");
        Handler df = new DocFileHandler("2nd handler");
        tf.setHandler(df);
        df.setHandler(ifh);

        tf.process(new File("demo1", "text" , "C:OOP"));
        tf.process(new File("demo2", "image" , "C:OOP"));
        tf.process(new File("demo3 ","doc", "C:OOP"));
    }
}