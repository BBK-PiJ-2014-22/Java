
public class Guitar implements MusicalInstrument, WoodenObject {

	@Override
	public void burn() {
		System.out.println("I'm Burning!");
	}

	@Override
	public void play() {
		System.out.println("I'm playing! dum dum dum");

	}

}
