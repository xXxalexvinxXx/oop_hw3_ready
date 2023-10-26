import java.util.List;

public class Controller {
    private StreamService streamService;
    public Controller(StreamService streamService){
        this.streamService = streamService;
    }

    public List<Stream> sortStream(List<Stream> streams){
        return streamService.sortStreams(streams);
    }
}
