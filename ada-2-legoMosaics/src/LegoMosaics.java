public class LegoMosaics {

    private int[] nBlocks;
    private int maxLength;

    public LegoMosaics(int cols) {
        this.nBlocks = new int[cols + 1];
        this.maxLength = 0;
    }

    public void setMaxLength(int length) {maxLength = length;}

    public void addBlock(int block) {nBlocks[block]++;}

    public int getMaxLength() {return maxLength;}
}
