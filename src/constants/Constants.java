package constants;

public class Constants {

    public final static int N = 16; // Total size of the file (probably should be
    // read)
    public final static int M = (int) Math.sqrt(N);
    public final static int g = 2; // Number of Column Groups
    public final static int groupLength = M / g; // Length of a ColumnGroup (not
    // including boundaries)
    public final static int groupSize = groupLength * M; // Number of elements in a
    // column group

    // compute filter parameters for netid ak883
    public final static float fromNetID = 0.388f;
    public final static float desiredDensity = 0.59f;
    public final static float wMin = 0.4f * fromNetID;
    public final static float wLimit = wMin + desiredDensity;

    public final static boolean DEBUG = true;
    public static final String outputDir = "data/output/";
}
