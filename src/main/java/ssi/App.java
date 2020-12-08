package ssi;



public final class App {
    private App() {

    }

    /**
     * Sorts the array.
     *
     * @param args The arguments of the program
     */
    public static void main(String[] args) {
        Sort bs = new Sort();
        int[] values = bs.read();
        bs.sort(values);
        bs.show(values);
    }
}
