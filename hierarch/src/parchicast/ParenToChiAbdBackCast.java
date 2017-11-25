package parchicast;

public class ParenToChiAbdBackCast {

    public static void main(String[] args) {
	Parent pToCh = new ChildOne();
	Parent pToTwoCh = new ChildTwo();

	System.out.println(((ChildOne) pToCh).xx);
	System.out.println(((ChildTwo) pToTwoCh).z);
    }
}
