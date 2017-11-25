public class EggChickStarter {

    public static void main(String[] args) {
	EggVoice eggVoice = new EggVoice();
	ChickenVoice chickenVoice = new ChickenVoice();
	try {
	    for (int i = 0; i < 100000; i++) {
		eggVoice.start();
		if (chickenVoice.isAlive()) {
		    eggVoice.join();

		}
		chickenVoice.start();
		chickenVoice.join();
	    }

	} catch (

	InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

}
