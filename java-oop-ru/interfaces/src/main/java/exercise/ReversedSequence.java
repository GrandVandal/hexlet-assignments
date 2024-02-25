package exercise;

// BEGIN
public final class ReversedSequence implements CharSequence {

    private final StringBuilder reversedSequence = new StringBuilder();

    public ReversedSequence(String sequence) {
        reversedSequence.append(sequence)
                .reverse();
    }

    @Override
    public int length() {
        return reversedSequence.length();
    }

    @Override
    public char charAt(int index) {
        return reversedSequence.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return reversedSequence.subSequence(start, end);
    }

    @Override
    public String toString() {
        return reversedSequence.toString();
    }
}
// END
