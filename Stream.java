import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{
    private int streamId;
    private List<StudentGroup> studentGroups;

    public Stream(int streamId, List<StudentGroup> studentGroups) {
        this.streamId = streamId;
        this.studentGroups = studentGroups;
    }

    public int getStreamId() {
        return streamId;
    }

    public void setStreamId(int streamId) {
        this.streamId = streamId;
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    public void setStudentGroups(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroups.iterator();
    }
}