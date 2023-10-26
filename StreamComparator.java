import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {

    @Override
    public int compare(Stream o1, Stream o2) {
        int groupCount1 = o1.getStudentGroups().size();
        int groupCount2 = o2.getStudentGroups().size();
        return Integer.compare(groupCount1, groupCount2);
    }
}
