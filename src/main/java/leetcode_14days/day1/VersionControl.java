package leetcode_14days.day1;


public class VersionControl {

    boolean[] badVersion;

    public int firstBadVersion(int n) {
        int low = 1, high = n;
        int lastBadIndex = 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                high = mid - 1;
                lastBadIndex = mid;
            } else {
                low = mid + 1;
            }
        }
        return lastBadIndex;
    }

    public VersionControl(boolean[] badVersion) {
        this.badVersion = badVersion;
    }

    private boolean isBadVersion(int n) {
        return badVersion[n - 1];
    }


}
