public class DocFileHandler implements Handler{
    private Handler handler;
    private String handlerName;

    public DocFileHandler(String handlerName){
        this.handlerName = handlerName;
    }
    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void process(File file) {
        if (file.getFileType().equals("Doc")) {
            System.out.println("processing: " + file.getFilePath() + "/" + file.getFileName() + " by " + handlerName);
        } else if (handler != null) {
            System.out.println(handlerName + " forwards request to "
                    + handler.getHandlerName());
            handler.process(file);
        }
        else
            System.out.println("File not supported");

    }

    @Override
    public String getHandlerName() {
        return this.handlerName;
    }
}